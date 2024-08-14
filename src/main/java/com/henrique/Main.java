package com.henrique;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Repositorio rep = new Repositorio();

        System.out.println("Bem-Vindo ao AutoCAD em Java");

        Scanner entrada = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Opções:\n1 - Inserir um Polígono\n2 - Calcular Área");
                int opcao = entrada.nextInt();

                if (opcao == 1) {
                    System.out.println("Digite o número de lados do Polígono: ");
                    int numeroLados = entrada.nextInt();
                    System.out.println(numeroLados);
                    System.out.println("Digite o tamanho do lado em cm: ");
                    double tamanhoLado = entrada.nextDouble();
                    System.out.println(tamanhoLado);
                    var poligono = CalculadoraArea.descobrePoligono(numeroLados, tamanhoLado);
                    if(poligono != null) {
                        rep.addPoligono(poligono);
                    }
                    else {
                        System.out.println("Que pena! Só consigo calcular a área de Triângulos e Quadrados.");
                    }

                } else if (opcao == 2) {
                    rep.exibir();
                    System.out.printf("\nÁrea total: %.2f cm²%n", rep.areaTotal());
                    break;
                } else {
                    System.out.println("Opção Inválida!");
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada Inválida, Digite Apenas Números!");
        }
    }
}
