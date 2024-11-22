package models;

import Models.EstiloDeLuta;

public class Mestre extends Lutador {
    public Mestre(String nome, models.CorFaixa faixa, int tempoTreino, EstiloDeLuta estilo) {
        super(nome, faixa, tempoTreino, estilo);
    }

    @Override
    public void treinar(int anos) {
        this.tempoTreino += anos;
        System.out.println(nome + " (Mestre) treinou por " + anos + " anos.");
    }
}