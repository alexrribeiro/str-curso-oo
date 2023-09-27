package br.com.alexrribeiro.screenmatch.principal;

import br.com.alexrribeiro.screenmatch.modelos.Filme;
import br.com.alexrribeiro.screenmatch.modelos.Serie;
import br.com.alexrribeiro.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaHistorico = new ArrayList<>();
        listaHistorico.add(filmeDoPaulo);
        listaHistorico.add(meuFilme);
        listaHistorico.add(outroFilme);
        listaHistorico.add(lost);

        for (Titulo item : listaHistorico) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }


        }

    }
}
