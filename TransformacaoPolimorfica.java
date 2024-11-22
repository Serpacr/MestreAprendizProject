package models;

import Models.EstiloDeLuta;

import java.util.Random;

public class TransformacaoPolimorfica {
    private static Random random = new Random();

    public static models.Lutador gerarLutadorAleatorio() {
        String[] nomes = {"Carlos", "João", "Maria", "Ana", "Pedro"};
        EstiloDeLuta[] estilos = EstiloDeLuta.values();
        models.CorFaixa[] faixas = models.CorFaixa.values(); // Adicionando as faixas

        String nome = nomes[random.nextInt(nomes.length)];
        int tempoTreino = random.nextInt(10); // Tempo de treino entre 0 e 9 anos
        EstiloDeLuta estilo = estilos[random.nextInt(estilos.length)];
        CorFaixa faixa = faixas[random.nextInt(faixas.length)]; // Escolhendo faixa aleatória

        if (random.nextBoolean()) {
            return new Mestre(nome, faixa, tempoTreino, estilo);
        } else {
            return new Aprendiz(nome, faixa, tempoTreino, estilo);
        }
    }
}