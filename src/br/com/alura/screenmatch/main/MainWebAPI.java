package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exeption.YearConversationErrorException;
import br.com.alura.screenmatch.model.Title;
import br.com.alura.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainWebAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um filme para buscar:");
        var search = sc.nextLine();

        String encodedSearch = URLEncoder.encode(search, StandardCharsets.UTF_8);

        String url = "https://www.omdbapi.com/?t=" + encodedSearch + "&apikey=bb69bdfd";
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(tituloOmdb);


            Title myTitle = new Title(tituloOmdb);
            System.out.println(myTitle);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (YearConversationErrorException e) {
            System.out.println(e.getMessage());
        }
    }
}
