class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<Integer> [] adjList = new ArrayList[graph.length];
        for(int i = 0; i<adjList.length;i++)
            adjList[i] = new ArrayList<>();
        
        for(int i = 0; i<graph.length;i++){
            for(int j=0; j<graph[i].length;j++){
                adjList[i].add(graph[i][j]);                        
        
    }
}
    List<List<Integer>>ans = new ArrayList<>();
    boolean visited[] = new boolean[adjList.length];
                               
    dfs(0,adjList, new ArrayList<>(),ans,visited);
        return ans;
      }
void dfs(int node , List<Integer>[] adjList, List<Integer> tmp, List<List<Integer>> res, boolean visited[]){
    
    if(visited[node] == true){
        return ;
        
    }
    visited[node] = true;
    tmp.add(node);
    if(node == adjList.length-1){
        res.add(tmp);
    
}
    for(int n:adjList[node]){
        dfs(n , adjList, new ArrayList<>(tmp), res, visited);
        visited[n] =false;
    }
}
}
         
                             
                               