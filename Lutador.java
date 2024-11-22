package models;

import Models.EstiloDeLuta;
import interfaces.Treinavel;

public abstract class Lutador implements Treinavel {
    protected String nome;
    protected CorFaixa faixa;  // Mudamos para CorFaixa
    protected int tempoTreino;  // em anos
    protected EstiloDeLuta estilo;

    public Lutador(String nome, CorFaixa faixa, int tempoTreino, EstiloDeLuta estilo) {
        this.nome = nome;
        this.faixa = faixa;
        this.tempoTreino = tempoTreino;
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Faixa: " + faixa + ", Tempo de Treino: " + tempoTreino + " anos, Estilo: " + estilo;
    }

    public abstract void treinar(int anos);
}