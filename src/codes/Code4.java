package codes;

public class Code4 {
    public static void display() {
        System.out.println("def busca_binaria(arr, x):");
        System.out.println("    esquerda, direita = 0, len(arr) - 1");
        System.out.println("    while esquerda <= direita:");
        System.out.println("        meio = (esquerda + direita) // 2");
        System.out.println("        if arr[meio] == x:");
        System.out.println("            return meio");
        System.out.println("        elif arr[meio] < x:");
        System.out.println("            esquerda = meio + 1");
        System.out.println("        else:");
        System.out.println("            direita = meio - 1");
        System.out.println("    return -1");
    }
}
