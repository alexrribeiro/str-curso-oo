package br.com.alexrribeiro.screenmatch.principal;

import br.com.alexrribeiro.screenmatch.modelos.Filme;
import br.com.alexrribeiro.screenmatch.modelos.Serie;
import br.com.alexrribeiro.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        Serie theOffice = new Serie("The Office", 2004);

        List<Titulo> listaHistorico = new LinkedList<>();
        listaHistorico.add(filmeDoPaulo);
        listaHistorico.add(meuFilme);
        listaHistorico.add(outroFilme);
        listaHistorico.add(lost);
        listaHistorico.add(theOffice);

        for (Titulo item : listaHistorico) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Sandra Bullock");
        buscaPorArtista.add("Arnold Schwarzenegger");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(listaHistorico);
        System.out.println("Lista de títulos ordenados");
        System.out.println(listaHistorico);

        listaHistorico.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaHistorico);
    }
}
