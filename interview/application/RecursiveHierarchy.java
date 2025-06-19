package interview.application;

import java.util.*;

class DataNode {
  
	int id;
    String name;
    Integer parent;
    List<DataNode> children;

    DataNode(int id, String name, Integer parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.children = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return "DataNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent=" + parent +
                ", children=" + children +
                '}';
    }
}

public class RecursiveHierarchy {
    
    public static void main(String[] args) {
    	
    	
    	// factorial(5);
    	
    	
        List<DataNode> dataList = Arrays.asList(
        		
                new DataNode(1, "A", 2),
                new DataNode(2, "B", 3),
                new DataNode(3, "C", 4),
                new DataNode(5, "D", 4),
                new DataNode(4, "E", null),
                new DataNode(6, "F", 1),
                new DataNode(7, "G", null)
        
        		);

        Map<Integer, DataNode> mapById = new HashMap<>();
        List<DataNode> result = new ArrayList<>();

        // Step 1: Store all nodes in a map for easy lookup by id
        for (DataNode node : dataList) {
            mapById.put(node.id, node);
        }

        // Step 2: Iterate and build the hierarchy
        for (DataNode node : dataList) {
            if (node.parent == null) {
                // If no parent, it's a root node
                result.add(node);
            } else {
                // Find the parent and add this node to the parent's children list
                DataNode parentNode = mapById.get(node.parent);
                if (parentNode != null) {
                    parentNode.children.add(node);
                }
            }
        }

        // Step 3: Display the hierarchical structure
        for (DataNode node : result) {

        	System.out.println("============================================");
            printNode(node, 0);
        }
    }

    // Recursive function to print the nodes with proper indentation
    public static void printNode(DataNode node, int level) {
        System.out.println("_ ".repeat(level) + node.name + " (ID: " + node.id + ")");
        for (DataNode child : node.children) {
        	System.out.println("-------------------------------------");
            printNode(child, level+1);
        }
    }
    
    // public static int factorial(int n) {
    //     // Base case: factorial of 0 is 1
    //     if (n == 0) {
    //         return 1;
    //     }
    //     // Recursive case: n! = n * (n-1)!
    //     System.out.println("hihello "+n);
    //     return n * factorial(n - 1);
    // }
}
