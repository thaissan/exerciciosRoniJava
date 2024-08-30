package com.poo.exerciciosroni;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosroniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosroniApplication.class, args);

		Exercicio1.resolucao(); //chama a classe 
		Exercicio2.resolucao();
		Exercicio3.resolucao();
		
	}

}
