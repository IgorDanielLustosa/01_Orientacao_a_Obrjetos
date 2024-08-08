package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempototal = 0;

    public int getTempototal(){
        return this.tempototal;
    }

    public void inclui(Titulo titulo){
        System.out.println();
    this.tempototal += titulo.getDuracaoEmMinutos();
    }
}
