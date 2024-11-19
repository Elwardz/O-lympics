package codes.o.logn;

public class Code6 {
    public static void display() {
        System.out.println("def e_primo(n):");
        System.out.println("    if n <= 1:");
        System.out.println("        return False");
        System.out.println("    if n == 2 or n == 3:");
        System.out.println("        return True");
        System.out.println("    if n % 2 == 0 or n % 3 == 0:");
        System.out.println("        return False");
        System.out.println("    i = 5");
        System.out.println("    while i * i <= n:");
        System.out.println("        if n % i == 0 or n % (i + 2) == 0:");
        System.out.println("            return False");
        System.out.println("        i += 6");
        System.out.println("    return True");
    }
}
