package application;

import java.util.Scanner;

public class CalculadoraMediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da prova: ");
        double notaProva = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        double media = (notaProva + notaTrabalho) / 2;

        System.out.println("A média do aluno é: " + media);

        // Verificar se o aluno foi aprovado ou reprovado
        if (media >= 7.0) {
            System.out.println("Parabéns, você é um gênio!");
        } else {
            System.out.println("Reprovado, estude mais.");
        }

        scanner.close();
    }
}

