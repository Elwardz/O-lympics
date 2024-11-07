package codes;

public class Code23 {
    public static void display() {
        System.out.println("def gerar_permutacoes(lista):");
        System.out.println("    if len(lista) == 0:");
        System.out.println("        return [[]]");
        System.out.println("    resultado = []");
        System.out.println("    for i in range(len(lista)):");
        System.out.println("        rest = lista[:i] + lista[i+1:]");
        System.out.println("        for x in gerar_permutacoes(rest):");
        System.out.println("            resultado.append([lista[i]] + x)");
        System.out.println("    return resultado");
    }
}
