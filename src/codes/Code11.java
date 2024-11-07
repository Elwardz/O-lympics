package codes;

public class Code11 {
    public static void display() {
        System.out.println("def quick_sort(arr):");
        System.out.println("    if len(arr) <= 1:");
        System.out.println("        return arr");
        System.out.println("    pivot = arr[len(arr) // 2]");
        System.out.println("    esquerda = [x for x in arr if x < pivot]");
        System.out.println("    meio = [x for x in arr if x == pivot]");
        System.out.println("    direita = [x for x in arr if x > pivot]");
        System.out.println("    return quick_sort(esquerda) + meio + quick_sort(direita)");
    }
}
