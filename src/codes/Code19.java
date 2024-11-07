package codes;

public class Code19 {
    public static void display() {
        System.out.println("def gerar_subconjuntos(s):");
        System.out.println("    if len(s) == 0:");
        System.out.println("        return [[]]");
        System.out.println("    else:");
        System.out.println("        subconjuntos = gerar_subconjuntos(s[1:])");
        System.out.println("        return subconjuntos + [[s[0]] + x for x in subconjuntos]");
    }
}
