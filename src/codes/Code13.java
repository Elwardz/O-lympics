package codes;

public class Code13 {
    public static void display() {
        System.out.println("def multiplicar_matrizes(A, B):");
        System.out.println("    result = [[0 for _ in range(len(B[0]))] for _ in range(len(A))]");
        System.out.println("    for i in range(len(A)):");
        System.out.println("        for j in range(len(B[0])):");
        System.out.println("            for k in range(len(B)):");
        System.out.println("                result[i][j] += A[i][k] * B[k][j]");
        System.out.println("    return result");
    }
}
