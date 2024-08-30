package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        String nome, disciplina;
        float n1, n2, n3, n4, media;

        System.out.println("Digite o nome do aluno: ");
        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.println("Digite a disciplina: ");
        disciplina = leia.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1 = leia.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = leia.nextFloat();

        System.out.println("Digite a quarta nota: ");
        n4 = leia.nextFloat();

        media = (n1+n2+n3+n4)/4;

        System.out.println("A media do aluno foi: " + media);



    }
}
