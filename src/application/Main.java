package application;

import codes.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibição da interface inicial

        System.out.println("\n" +
                "┏┓      ┓       •  \n" +
                "┃┃  ━━  ┃┓┏┏┳┓┏┓┓┏┏\n" +
                "┗┛      ┗┗┫┛┗┗┣┛┗┗┛\n" +
                "          ┛   ┛");

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner

        if (choice == 1) {
            // Coletar o nome do jogador
            System.out.print("Digite seu nome de usuário: ");
            String username = scanner.nextLine();

            // Criar uma lista para armazenar os códigos já respondidos
            Set<Integer> answeredCodes = new HashSet<>();
            int score = 0;

            // Mapear a complexidade de cada Code
            String[] complexidades = {
                    "O(1)", "O(1)", "O(1)", "O(log n)", "O(log n)", "O(log n)", "O(n)", "O(n)",
                    "O(n)", "O(n log n)", "O(n log n)", "O(n log n)", "O(n^2)", "O(n^2)", "O(n^2)",
                    "O(n^3)", "O(n^3)", "O(n^3)", "O(2^n)", "O(2^n)", "O(2^n)", "O(n!)", "O(n!)", "O(n!)"
            };

            // Enquanto não tiver respondido todos os códigos, o jogo continua
            Random random = new Random();
            while (answeredCodes.size() < 24) {
                // Gerar um número aleatório de código que não tenha sido respondido ainda
                int codeNumber;
                do {
                    codeNumber = random.nextInt(24) + 1;
                } while (answeredCodes.contains(codeNumber));

                // Marcar o código como respondido
                answeredCodes.add(codeNumber);

                // Exibir o código para o jogador
                showCode(codeNumber);

                // Solicitar a complexidade ao usuário
                System.out.println("\nEscolha a complexidade:");
                System.out.println("1 - O(1)");
                System.out.println("2 - O(log n)");
                System.out.println("3 - O(n)");
                System.out.println("4 - O(n log n)");
                System.out.println("5 - O(n^2)");
                System.out.println("6 - O(n^3)");
                System.out.println("7 - O(2^n)");
                System.out.println("8 - O(n!)");

                // Capturar a resposta do usuário com tratamento de exceção
                int userAnswer = 0;
                boolean validAnswer = false;
                while (!validAnswer) {
                    try {
                        System.out.print("Escolha a complexidade: ");
                        userAnswer = scanner.nextInt();

                        if (userAnswer < 1 || userAnswer > 8) {
                            System.out.println("Escolha inválida. Por favor, selecione um número entre 1 e 8.");
                        } else {
                            validAnswer = true; // Resposta válida, sai do loop
                        }
                    } catch (Exception e) {
                        System.out.println("Entrada inválida. Tente novamente.");
                        scanner.next(); // Limpar o buffer do scanner
                    }
                }

                // Verificar se a resposta do usuário está correta e atualizar a pontuação
                if (checkComplexity(codeNumber, userAnswer, complexidades)) {
                    System.out.println("Correto!");
                    score++; // Incrementar o score
                } else {
                    System.out.println("Errado! A complexidade correta é: " + complexidades[codeNumber - 1]);
                }
            }

            // Exibir o resultado final
            System.out.println("\nFim do jogo!");
            System.out.println("Jogador: " + username);
            System.out.println("Pontuação: " + score + "/24");
        } else {
            System.out.println("Saindo... Até a próxima!");
        }

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
        String correctComplexity = complexidades[codeNumber - 1];
        String userComplexity = getComplexityFromChoice(userAnswer);

        return correctComplexity.equals(userComplexity);
    }

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
                return "Invalido";  // Retornar "Invalido" para escolhas fora do intervalo
        }
    }
}




