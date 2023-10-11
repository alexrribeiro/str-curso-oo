package br.com.alexrribeiro.screenmatch.principal;

import br.com.alexrribeiro.screenmatch.modelos.Titulo;
import br.com.alexrribeiro.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = scanner.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=222296d0";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println("omdb");
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Título já convertido");
        System.out.println(meuTitulo);
    }
}
