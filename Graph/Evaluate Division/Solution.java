class Solution {
    
    class Tree {
        String name;
        List<Tree> child;
        List<Double> cost;
        
        Tree(String name) {
            this.name = name;
            this.child = new ArrayList<>();
            this.cost = new ArrayList<>();
        }
    }
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        Map<String, Boolean> visitMap = new HashMap<>();
        Map<String, Tree> mainTree = createTree(equations, values, visitMap);
        
        double[] resPath = new double[queries.size()];
        
        for (int i = 0; i < queries.size(); i++) {
            resPath[i] = traverse(queries.get(i).get(0), queries.get(i).get(1), mainTree, visitMap);
        }
        return resPath;
    }
    
    private double traverse(String x, String y, Map<String, Tree> mainTree, Map<String, Boolean> visitMap) {
        if (!mainTree.containsKey(x) || !mainTree.containsKey(y)) {
            return -1.0;
        }
        
        if (x.equals(y)) return 1.0;
        
        Tree treeX = mainTree.get(x);
        
        visitMap.put(x, true);
        double pathCost = -1.0;
        for (int i = 0; i < treeX.child.size(); i++) {
            Tree nextX = treeX.child.get(i);
            if (visitMap.get(nextX.name) == false) {
                pathCost = traverse(nextX.name, y, mainTree, visitMap);
                if (pathCost != -1.0) {
                    pathCost *= treeX.cost.get(i);
                    break;
                }
            }
        }
        visitMap.put(x, false);
        return pathCost;
    }
    
    private Map<String, Tree> createTree(List<List<String>> equations, double[] values, Map<String, Boolean> visitMap) {
        Map<String, Tree> mainTree = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> equ = equations.get(i);
            double divRes = values[i];
            
            Tree treeA = mainTree.getOrDefault(equ.get(0), new Tree(equ.get(0)));
            Tree treeB = mainTree.getOrDefault(equ.get(1), new Tree(equ.get(1)));
            
            
            treeA.child.add(treeB);
            treeA.cost.add(divRes);
            
            treeB.child.add(treeA);
            treeB.cost.add(1.0 / divRes);
            
            mainTree.put(equ.get(0), treeA);
            mainTree.put(equ.get(1), treeB);
            
            visitMap.putIfAbsent(equ.get(0), false);
            visitMap.putIfAbsent(equ.get(1), false);
        }
        return mainTree;
    }
}