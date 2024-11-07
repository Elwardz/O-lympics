package codes;

public class Code10 {
    public static void display() {
        System.out.println("def merge_sort(arr):");
        System.out.println("    if len(arr) <= 1:");
        System.out.println("        return arr");
        System.out.println("    meio = len(arr) // 2");
        System.out.println("    esquerda = merge_sort(arr[:meio])");
        System.out.println("    direita = merge_sort(arr[meio:])");
        System.out.println("    return merge(esquerda, direita)");
        System.out.println();
        System.out.println("def merge(esquerda, direita):");
        System.out.println("    resultado = []");
        System.out.println("    i = j = 0");
        System.out.println("    while i < len(esquerda) and j < len(direita):");
        System.out.println("        if esquerda[i] < direita[j]:");
        System.out.println("            resultado.append(esquerda[i])");
        System.out.println("            i += 1");
        System.out.println("        else:");
        System.out.println("            resultado.append(direita[j])");
        System.out.println("            j += 1");
        System.out.println("    resultado.extend(esquerda[i:])");
        System.out.println("    resultado.extend(direita[j:])");
        System.out.println("    return resultado");
    }
}
