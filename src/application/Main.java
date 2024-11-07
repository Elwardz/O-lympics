package application;

import codes.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Mapeando a complexidade de cada Code
        String[] complexidades = {
                "O(1)", // Code1
                "O(1)",    // Code2
                "O(1)", // Code3
                "O(log n)", // Code4
                "O(log n)",    // Code5
                "O(log n)",  // Code6
                "O(n)",  // Code7
                "O(n)",    // Code8
                "O(n)",  // Code9
                "O(n log n)", // Code10
                "O(n log n)",  // Code11
                "O(n log n)",  // Code12
                "O(n^2)",  // Code13
                "O(n^2)",  // Code14
                "O(n^2)",  // Code15
                "O(n^3)",  // Code16
                "O(n^3)", // Code17
                "O(n^3)",  // Code18
                "O(2^n)",  // Code19
                "O(2^n)",  // Code20
                "O(2^n)", // Code21
                "O(n!)",  // Code22
                "O(n!)",  // Code23
                "O(n!)"    // Code24
        };

        System.out.println("\n" +
                "┏┓      ┓       •  \n" +
                "┃┃  ━━  ┃┓┏┏┳┓┏┓┓┏┏\n" +
                "┗┛      ┗┗┫┛┗┗┣┛┗┗┛\n" +
                "          ┛   ┛    \n");

        boolean continueGame = true;  // Controla se o usuário quer continuar jogando

        while (continueGame) {
            // Gerar um número aleatório para escolher um código
            int codeNumber = random.nextInt(24) + 1; // Aleatório entre 1 e 24
            showCode(codeNumber);

            // Solicitar a complexidade ao user
            System.out.println("\nEscolha a complexidade:");
            System.out.println("1 - O(1)");
            System.out.println("2 - O(log n)");
            System.out.println("3 - O(n)");
            System.out.println("4 - O(n log n)");
            System.out.println("5 - O(n^2)");
            System.out.println("6 - O(n^3)");
            System.out.println("7 - O(2^n)");
            System.out.println("8 - O(n!)");

            // Capturar a resposta do usuário
            System.out.print("Escolha a complexidade: ");
            int userAnswer = scanner.nextInt();

            // Verificar se a resposta do usuário está correta
            if (checkComplexity(codeNumber, userAnswer, complexidades)) {
                System.out.println("Correto!");
            } else {
                System.out.println("Errado! Tente novamente.");
            }

            // Perguntar se o usuário deseja continuar para o próximo código
            System.out.println("\nGostaria de ir para o próximo código?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int choice = scanner.nextInt();
            if (choice == 2) {
                continueGame = false;
            }
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }

    // Método para exibir o código com base no número gerado
    public static void showCode(int codeNumber) {
        switch (codeNumber) {
            case 1:
                Code1.display();
                break;
            case 2:
                Code2.display();
                break;
            case 3:
                Code3.display();
                break;
            case 4:
                Code4.display();
                break;
            case 5:
                Code5.display();
                break;
            case 6:
                Code6.display();
                break;
            case 7:
                Code7.display();
                break;
            case 8:
                Code8.display();
                break;
            case 9:
                Code9.display();
                break;
            case 10:
                Code10.display();
                break;
            case 11:
                Code11.display();
                break;
            case 12:
                Code12.display();
                break;
            case 13:
                Code13.display();
                break;
            case 14:
                Code14.display();
                break;
            case 15:
                Code15.display();
                break;
            case 16:
                Code16.display();
                break;
            case 17:
                Code17.display();
                break;
            case 18:
                Code18.display();
                break;
            case 19:
                Code19.display();
                break;
            case 20:
                Code20.display();
                break;
            case 21:
                Code21.display();
                break;
            case 22:
                Code22.display();
                break;
            case 23:
                Code23.display();
                break;
            case 24:
                Code24.display();
                break;
            default:
                System.out.println("Código inválido.");
        }
    }

    // Método para verificar se a complexidade fornecida pelo usuário está correta
    public static boolean checkComplexity(int codeNumber, int userAnswer, String[] complexidades) {
        // Complexidade correta para o código gerado
        String correctComplexity = complexidades[codeNumber - 1];
        String userComplexity = getComplexityFromChoice(userAnswer);

        // Verificar se a complexidade está correta
        return correctComplexity.equals(userComplexity);
    } // testin error

    // Método para mapear a escolha do usuário para a complexidade correspondente
    public static String getComplexityFromChoice(int choice) {
        switch (choice) {
            case 1:
                return "O(1)";
            case 2:
                return "O(log n)";
            case 3:
                return "O(n)";
            case 4:
                return "O(n log n)";
            case 5:
                return "O(n^2)";
            case 6:
                return "O(n^3)";
            case 7:
                return "O(2^n)";
            case 8:
                return "O(n!)";
            default:
                return "";
        }
    }
}