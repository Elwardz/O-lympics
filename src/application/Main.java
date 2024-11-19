package application;

import codes.o.logn.Code4;
import codes.o.logn.Code5;
import codes.o.logn.Code6;
import codes.o.n.Code7;
import codes.o.n.Code8;
import codes.o.n.Code9;
import codes.o.n2.Code13;
import codes.o.n2.Code14;
import codes.o.n2.Code15;
import codes.o.n3.Code16;
import codes.o.n3.Code17;
import codes.o.n3.Code18;
import codes.o.nfatorial.Code22;
import codes.o.nfatorial.Code23;
import codes.o.nfatorial.Code24;
import codes.o.nlogn.Code10;
import codes.o.nlogn.Code11;
import codes.o.nlogn.Code12;
import codes.o.o1.Code1;
import codes.o.o1.Code2;
import codes.o.o1.Code3;
import codes.o.o2n.Code19;
import codes.o.o2n.Code20;
import codes.o.o2n.Code21;

import java.io.*;
import java.util.*;

public class Main {
    private static final String SCORE_FILE = "scores.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Map<Integer, String> complexidades = initializeComplexidades();
        Set<Integer> usedCodes = new HashSet<>();

        System.out.println("\n" +
                "┏┓      ┓       •  \n" +
                "┃┃  ━━  ┃┓┏┏┳┓┏┓┓┏┏\n" +
                "┗┛      ┗┗┫┛┗┗┣┛┗┗┛\n" +
                "          ┛   ┛");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        int option = scanner.nextInt();

        if (option == 2) {
            System.out.println("Até logo!");
            return;
        }

        System.out.print("Digite seu username: ");
        String username = scanner.next();
        int score = 0;

        while (usedCodes.size() < 24) {
            int codeNumber;
            do {
                codeNumber = random.nextInt(24) + 1;
            } while (usedCodes.contains(codeNumber));

            usedCodes.add(codeNumber);
            showCode(codeNumber);

            System.out.println("\nEscolha a complexidade:");
            System.out.println("1 - O(1)");
            System.out.println("2 - O(log n)");
            System.out.println("3 - O(n)");
            System.out.println("4 - O(n log n)");
            System.out.println("5 - O(n^2)");
            System.out.println("6 - O(n^3)");
            System.out.println("7 - O(2^n)");
            System.out.println("8 - O(n!)");

            System.out.print("Escolha a complexidade: ");
            int userAnswer = scanner.nextInt();

            if (checkComplexity(codeNumber, userAnswer, complexidades)) {
                System.out.println("Correto!");
                score++;
            } else {
                System.out.println("Errado! A resposta correta é: " + complexidades.get(codeNumber));
                // Exibe a dica específica
                System.out.println("Dica: " + getHint(codeNumber));
            }
        }

        System.out.println("\nFim do jogo!");
        System.out.println("Username: " + username);
        System.out.println("Pontuação: " + score + "/24");

        saveScore(username, score);
        displayScores();

        scanner.close();
    }

    private static Map<Integer, String> initializeComplexidades() {
        Map<Integer, String> complexidades = new HashMap<>();
        complexidades.put(1, "O(1)");
        complexidades.put(2, "O(1)");
        complexidades.put(3, "O(1)");
        complexidades.put(4, "O(log n)");
        complexidades.put(5, "O(log n)");
        complexidades.put(6, "O(log n)");
        complexidades.put(7, "O(n)");
        complexidades.put(8, "O(n)");
        complexidades.put(9, "O(n)");
        complexidades.put(10, "O(n log n)");
        complexidades.put(11, "O(n log n)");
        complexidades.put(12, "O(n log n)");
        complexidades.put(13, "O(n^2)");
        complexidades.put(14, "O(n^2)");
        complexidades.put(15, "O(n^2)");
        complexidades.put(16, "O(n^3)");
        complexidades.put(17, "O(n^3)");
        complexidades.put(18, "O(n^3)");
        complexidades.put(19, "O(2^n)");
        complexidades.put(20, "O(2^n)");
        complexidades.put(21, "O(2^n)");
        complexidades.put(22, "O(n!)");
        complexidades.put(23, "O(n!)");
        complexidades.put(24, "O(n!)");
        return complexidades;
    }

    public static void showCode(int codeNumber) {
        switch (codeNumber) {
            case 1 -> new Code1().display();
            case 2 -> new Code2().display();
            case 3 -> new Code3().display();
            case 4 -> new Code4().display();
            case 5 -> new Code5().display();
            case 6 -> new Code6().display();
            case 7 -> new Code7().display();
            case 8 -> new Code8().display();
            case 9 -> new Code9().display();
            case 10 -> new Code10().display();
            case 11 -> new Code11().display();
            case 12 -> new Code12().display();
            case 13 -> new Code13().display();
            case 14 -> new Code14().display();
            case 15 -> new Code15().display();
            case 16 -> new Code16().display();
            case 17 -> new Code17().display();
            case 18 -> new Code18().display();
            case 19 -> new Code19().display();
            case 20 -> new Code20().display();
            case 21 -> new Code21().display();
            case 22 -> new Code22().display();
            case 23 -> new Code23().display();
            case 24 -> new Code24().display();
            default -> System.out.println("Código inválido.");
        }
    }

    public static boolean checkComplexity(int codeNumber, int userAnswer, Map<Integer, String> complexidades) {
        String correctComplexity = complexidades.get(codeNumber);
        String userComplexity = getComplexityFromChoice(userAnswer);
        return correctComplexity.equals(userComplexity);
    }

    public static String getComplexityFromChoice(int choice) {
        return switch (choice) {
            case 1 -> "O(1)";
            case 2 -> "O(log n)";
            case 3 -> "O(n)";
            case 4 -> "O(n log n)";
            case 5 -> "O(n^2)";
            case 6 -> "O(n^3)";
            case 7 -> "O(2^n)";
            case 8 -> "O(n!)";
            default -> "";
        };
    }

    public static String getHint(int codeNumber) {
        switch (codeNumber) {
            case 1: return "Este código tem uma complexidade constante O(1), pois não depende do tamanho da entrada.";
            case 2: return "Este código tem uma complexidade constante O(1), pois a operação é feita em tempo fixo.";
            case 3: return "Este código tem uma complexidade constante O(1), pois é uma operação direta.";
            case 4: return "Este é um algoritmo de busca binária, sua complexidade é O(log n).";
            case 5: return "Este código é uma busca binária, que reduz pela metade a área de busca a cada passo.";
            case 6: return "Este código implementa uma busca binária, um algoritmo eficiente com complexidade O(log n).";
            case 7: return "Este código tem complexidade O(n) porque percorre cada elemento uma vez.";
            case 8: return "O código percorre cada elemento da entrada, logo é O(n).";
            case 9: return "A complexidade é O(n), pois a execução do código é proporcional ao tamanho da entrada.";
            case 10: return "Este código tem uma complexidade O(n log n), como a ordenação utilizando MergeSort.";
            case 11: return "Esse código possui complexidade O(n log n), como visto em algoritmos de ordenação eficientes.";
            case 12: return "A complexidade O(n log n) é típica de algoritmos eficientes de ordenação e divisão.";
            case 13: return "Este código tem complexidade O(n^2), como os algoritmos de ordenação como o BubbleSort.";
            case 14: return "Este algoritmo tem O(n^2), como em operações de comparação em lista não ordenada.";
            case 15: return "A complexidade O(n^2) é típica de algoritmos que percorrem dois loops aninhados.";
            case 16: return "O algoritmo tem complexidade O(n^3), o que ocorre com alguns algoritmos de multiplicação de matrizes.";
            case 17: return "Este código tem O(n^3), como visto em alguns algoritmos de cubo ou transformação tridimensional.";
            case 18: return "A complexidade O(n^3) é típica de operações com três dimensões ou loops triplos.";
            case 19: return "Este código tem complexidade O(2^n), como em algoritmos de força bruta que tentam todas as combinações.";
            case 20: return "Esse algoritmo possui complexidade O(2^n), um exemplo clássico de algoritmo exponencial.";
            case 21: return "A complexidade O(2^n) é típica de algoritmos que tentam resolver problemas com soluções combinatórias.";
            case 22: return "Este código tem complexidade O(n!), como os algoritmos de permutação de n elementos.";
            case 23: return "A complexidade O(n!) é típica de algoritmos que tentam todas as permutações possíveis.";
            case 24: return "Esse código tem complexidade O(n!), como algoritmos para resolver problemas como o Caixeiro Viajante.";
            default: return "Dica não disponível.";
        }
    }

    public static void saveScore(String username, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SCORE_FILE, true))) {
            writer.write(username + ": " + score);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar a pontuação.");
        }
    }

    public static void displayScores() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORE_FILE))) {
            String line;
            System.out.println("\nPontuações anteriores:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler as pontuações.");
        }
    }
}
