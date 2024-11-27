package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exeption.YearConversationErrorException;
import br.com.alura.screenmatch.model.Title;
import br.com.alura.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWebAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<Title> titleList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String search = "";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para buscar:");
            search = sc.nextLine();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }


            String encodedSearch = URLEncoder.encode(search, StandardCharsets.UTF_8);

            String url = "https://www.omdbapi.com/?t=" + encodedSearch + "&apikey=bb69bdfd";
            System.out.println(url);

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(tituloOmdb);


                Title myTitle = new Title(tituloOmdb);
                titleList.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");

            } catch (YearConversationErrorException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titleList);

        FileWriter written = new FileWriter("movies-list.json");
        written.write(gson.toJson(titleList));
        written.close();
    }
}
