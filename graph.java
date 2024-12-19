public class Main {
    
    public static HashMap<Integer, ArrayList<Integer>> createAdj(ArrayList<ArrayList<Integer>> edges) {
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();        
    
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0); 
            int v = edge.get(1);
            
              adjList.putIfAbsent(u, new ArrayList<>());
            adjList.get(u).add(v);

            adjList.putIfAbsent(v, new ArrayList<>());
            adjList.get(v).add(u);
        }
        return adjList;
    }
  public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        edges.add(temp);
        
        temp = new ArrayList<>();
        temp.add(2);
        temp.add(3);
        edges.add(temp);
        
        temp = new ArrayList<>();
        temp.add(1);
        temp.add(3);
        edges.add(temp);
        
        temp = new ArrayList<>();
        temp.add(2);
        temp.add(4);
        edges.add(temp);
        
        temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        edges.add(temp);
        
        temp = new ArrayList<>();
        temp.add(5);
        temp.add(4);
        edges.add(temp);

        HashMap<Integer, ArrayList<Integer>> result = createAdj(edges);
        for (int k : result.keySet()) {
            System.out.print(k + ": ");
            for (int v : result.get(k)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
