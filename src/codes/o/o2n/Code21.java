package codes.o.o2n;

public class Code21 {
    public static void display() {
        System.out.println("def busca_solucoes(n):");
        System.out.println("    if n == 0:");
        System.out.println("        return 1");
        System.out.println("    return busca_solucoes(n-1) + busca_solucoes(n-1)");
    }
}
