package codes;

public class Code16 {
    public static void display() {
        System.out.println("def multiplicar_matrizes_3D(A, B, C):");
        System.out.println("    result = [[[0 for _ in range(len(C[0][0]))] for _ in range(len(C[0]))] for _ in range(len(A))]");
        System.out.println("    for i in range(len(A)):");
        System.out.println("        for j in range(len(B[0])):");
        System.out.println("            for k in range(len(C[0][0])):");
        System.out.println("                result[i][j][k] = A[i][j][k] * B[i][j][k] * C[i][j][k]");
        System.out.println("    return result");
    }
}
