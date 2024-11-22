package main;

import models.Lutador;
import models.TransformacaoPolimorfica;

public class Main {
    public static void main(String[] args) {
        // Gerar um mestre
        Lutador mestre = TransformacaoPolimorfica.gerarLutadorAleatorio();
        System.out.println(mestre);

        // Gerar três aprendizes
        for (int i = 0; i < 3; i++) {
            Lutador aprendiz = TransformacaoPolimorfica.gerarLutadorAleatorio();
            System.out.println(aprendiz);
        }


    }
}