package br.com.eventos.model;

public class Palestrante {
    private String nome;
    private String curriculo;
    private String areaAtuacao;

    public Palestrante(String nome, String curriculo, String areaAtuacao) {
        this.nome = nome;
        this.curriculo = curriculo;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNome() { return nome; }
    public String getCurriculo() { return curriculo; }
    public String getAreaAtuacao() { return areaAtuacao; }
}