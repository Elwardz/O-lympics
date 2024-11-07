package codes;

public class Code18 {
    public static void display() {
        System.out.println("def floyd_warshall(graph):");
        System.out.println("    n = len(graph)");
        System.out.println("    dist = [[float('inf')] * n for _ in range(n)]");
        System.out.println("    for i in range(n):");
        System.out.println("        dist[i][i] = 0");
        System.out.println("    for u in range(n):");
        System.out.println("        for v in graph[u]:");
        System.out.println("            dist[u][v] = graph[u][v]");
        System.out.println("    for k in range(n):");
        System.out.println("        for i in range(n):");
        System.out.println("            for j in range(n):");
        System.out.println("                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])");
        System.out.println("    return dist");
    }
}
