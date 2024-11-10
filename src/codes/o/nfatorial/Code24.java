package codes.o.nfatorial;

public class Code24 {
    public static void display() {
        System.out.println("def caixeiro_viajante(cidades):");
        System.out.println("    if len(cidades) == 1:");
        System.out.println("        return cidades");
        System.out.println("    resultado = []");
        System.out.println("    for i in range(len(cidades)):");
        System.out.println("        rest = cidades[:i] + cidades[i+1:]");
        System.out.println("        for x in caixeiro_viajante(rest):");
        System.out.println("            resultado.append([cidades[i]] + x)");
        System.out.println("    return resultado");
    }
}
