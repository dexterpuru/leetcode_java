class Solution {

    List<Integer>[] graph;
    boolean[] visited;
    boolean[] explored;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //creating adjacency list representation of the graph
        graph = new ArrayList[numCourses];
        for(int i=0; i<numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<prerequisites.length; i++) {
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        visited = new boolean[numCourses];
        explored = new boolean[numCourses];

        for(int i=0; i<numCourses; i++) {
            if(!visited[i]) {
                if(isCyclic(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isCyclic(int u) {
        visited[u] = true;
        for(Integer v : graph[u]) {
            if(!visited[v]) {
                if(isCyclic(v)) {
                    return true;
                }
            } else if(!explored[v]) {
                return true;
            }
        }
        explored[u] = true;
        return false;
    }
}