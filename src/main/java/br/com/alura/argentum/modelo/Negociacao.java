package main.java.br.com.alura.argentum.modelo;

import java.time.LocalDateTime;

public class Negociacao {

    private double preco;
    private int quantidade;
    private LocalDateTime data;

    public Negociacao(double preco, int quantidade, LocalDateTime data) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getData() {
        return data;
    }
}
