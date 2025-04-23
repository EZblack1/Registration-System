package br.com.eventos.model;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private String descricao;
    private LocalDate data;
    private String local;
    private int capacidade;

    public Evento(String nome, String descricao, LocalDate data, String local, int capacidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public LocalDate getData() { return data; }
    public String getLocal() { return local; }
    public int getCapacidade() { return capacidade; }
}