package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
		
        int n1, n2;

		System.out.print("Digite o primeiro numero: ");
		Scanner scanner1 = new Scanner(System.in);
		n1 = scanner1.nextInt(); // leia o próximo inteiro

		System.out.print("O primeiro número é: "+ n1 + "\n");
		
		System.out.println("Digite o primeiro numero: ");
		n2 = scanner1.nextInt();

		System.out.println("O segundo número é: "+ n2);

		System.out.println("A soma é: "+(n1+n2));

    }

}
