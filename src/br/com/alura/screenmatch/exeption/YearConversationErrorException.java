package br.com.alura.screenmatch.exeption;

public class YearConversationErrorException extends RuntimeException {
    private String message;

    public YearConversationErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
