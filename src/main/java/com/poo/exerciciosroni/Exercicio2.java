package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        //2- Construir um algoritmo que leia numero e exiba na tela seu sucessor e antecessor

        int n1;

        System.out.println("Digite um numero: ");
        Scanner leia = new Scanner(System.in);
        n1 = leia.nextInt();

        System.out.println("O antecessor é: "+(n1-1) + "E o sucessor é: "+ (n1+1));
    }

}
