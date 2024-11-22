package models;

import Models.EstiloDeLuta;

public class Aprendiz extends models.Lutador {
    public Aprendiz(String nome, models.CorFaixa faixa, int tempoTreino, EstiloDeLuta estilo) {
        super(nome, faixa, tempoTreino, estilo);
    }

    @Override
    public void treinar(int anos) {
        this.tempoTreino += anos;
        System.out.println(nome + " (Aprendiz) treinou por " + anos + " anos.");
    }
}