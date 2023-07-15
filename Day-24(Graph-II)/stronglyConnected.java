//Strongly Connected Components – Kosaraju’s Algorithm:
import java.util.*;
public class stronglyConnected {
    
    public static List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {
        int[] vis = new int[n];
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            adjT.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adjT.get(v).add(u);
        }

        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(i, s, adj, vis);
            }
        }

        Arrays.fill(vis, 0);

        while (!s.isEmpty()) {
            int node = s.pop();
            if (vis[node] == 0) {
                ArrayList<Integer> component = new ArrayList<>();
                dfs3(node, vis, component, adjT);
                ans.add(component);
            }
        }

        return ans;
    }

    public static void dfs(int node, Stack<Integer> s, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[node] = 1;
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs(it, s, adj, vis);
            }
        }
        s.push(node);
    }

    public static void dfs3(int node, int[] vis, ArrayList<Integer> l, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        l.add(node);
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs3(it, vis, l, adj);
            }
        }
    }
}
