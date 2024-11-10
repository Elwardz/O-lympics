package codes.o.n2;

public class Code15 {
    public static void display() {
        System.out.println("def bubble_sort(arr):");
        System.out.println("    n = len(arr)");
        System.out.println("    for i in range(n):");
        System.out.println("        for j in range(0, n-i-1):");
        System.out.println("            if arr[j] > arr[j+1]:");
        System.out.println("                arr[j], arr[j+1] = arr[j+1], arr[j]");
        System.out.println("    return arr");
    }
}
