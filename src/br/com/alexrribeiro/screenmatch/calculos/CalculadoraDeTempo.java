package br.com.alexrribeiro.screenmatch.calculos;

import br.com.alexrribeiro.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo t) {
        System.out.println("Adicionando duração em minutos de " + t);
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
