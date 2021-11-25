package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//THIS CODE DOESN'T WORK FOR ALL TEST CASES DUE TO ADDITIONAL TIME FOR MODE OF INPUT. PASSING CODE BELOW THIS ONE
enum Color {
	RED, GREEN
}

//Abstract Tree
abstract class Tree {

	private int value;
	private Color color;
	private int depth;

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public int getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public int getDepth() {
		return depth;
	}

	public abstract void accept(TreeVis visitor);
}

//Tree class
class TreeNode extends Tree {

	private ArrayList<Tree> children = new ArrayList<>();

	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitNode(this);

		for (Tree child : children) {
			child.accept(visitor);
		}
	}

	public void addChild(Tree child) {
		children.add(child);
	}
	
	public ArrayList<Tree> getChildren() {
		return this.children;
	}
	
	

}

//Tree Leaf Class
class TreeLeaf extends Tree {

	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
	
	
}

//Tree vis class
abstract class TreeVis {
	public abstract int getResult();

	public abstract void visitNode(TreeNode node);

	public abstract void visitLeaf(TreeLeaf leaf);

}

//SUM IN LEAVES VISITOR
class SumInLeavesVisitor extends TreeVis {
	int result = 0;
	public int getResult() {
		return this.result;

	}

	public void visitNode(TreeNode node) {
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		result+=leaf.getValue();

	}

}

//PRODUCT OF RED NODES VISITOR
class ProductOfRedNodesVisitor extends TreeVis {
	long result = 1;
	long mod = 1000000007;
	public int getResult() {
		return (int)result;

	}

	public void visitNode(TreeNode node) {
		if(node.getColor() == Color.RED)
			result = (result*node.getValue())%mod;
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// TODO Auto-generated method stub
		if(leaf.getColor() == Color.RED)
			result = (result*leaf.getValue())%mod;

	}
}

//FANCY VISITOR
class FancyVisitor extends TreeVis {
	int evenNodeSum = 0;
	int greenLeavesSum = 0;
	public int getResult() {
		return Math.abs(evenNodeSum - greenLeavesSum);

	}

	public void visitNode(TreeNode node) {
		if(node.getDepth()%2 == 0 )
			evenNodeSum += node.getValue();
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// TODO Auto-generated method stub
		if(leaf.getColor() == Color.GREEN)
			greenLeavesSum += leaf.getValue();

	}
}

public class JavaVisitorPattern {
	
	static HashMap<Integer, HashSet<Integer>> nodeMap = new HashMap<>();
	static ArrayList<Integer> nodeVals;
	static Color colors[];
	
	public static void addChildren(TreeNode parentNode, int parent) {

		//Removing parent from children
		for(int n : nodeMap.get(parent)) {
			Tree tree;
			nodeMap.get(n).remove(parent);

			if(nodeMap.get(n).isEmpty()) {
				tree = new TreeLeaf(nodeVals.get(n-1), colors[n], parentNode.getDepth()+1);
			}
			else {
				tree = new TreeNode(nodeVals.get(n-1), colors[n], parentNode.getDepth()+1);
			}
			
			parentNode.addChild(tree);
			
			if(tree instanceof TreeNode) {
				addChildren((TreeNode)tree, n);
			}
		}
		
		
	}

	public static Tree solve() {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of nodes: ");
		int numberOfNodes = Integer.parseInt(input.nextLine());
		
		colors = new Color[numberOfNodes+1];
		
		System.out.print("Node Values: ");
		nodeVals = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
		System.out.print("Colors: ");
		ArrayList<Integer> colorVals = Stream.of(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
		int counter = 0;

		for(int i = 1; i <= numberOfNodes; i++) {
			colors[i] = colorVals.get(i-1) == 0? Color.RED:Color.GREEN;
		}

		for (int i = 0; i < numberOfNodes - 1; i++) {
			System.out.print("Edge: ");
			String sNums[] = input.nextLine().split(" ");
			int u = Integer.parseInt(sNums[0]);
			int v = Integer.parseInt(sNums[1]);
			
			if(nodeMap.get(u) == null) {
				HashSet<Integer> nodeChildren = new HashSet<Integer>();
				nodeChildren.add(v);
				nodeMap.put(u,nodeChildren);
			}
			else {
				nodeMap.get(u).add(v);
			}
			
			if(nodeMap.get(v) == null) {
				HashSet<Integer> nodeChildren = new HashSet<Integer>();
				nodeChildren.add(u);
				nodeMap.put(v,nodeChildren);
			}
			else {
				nodeMap.get(v).add(u);
			}

		}
		
		
		Tree root = new TreeNode(nodeVals.get(0), colors[1], 0);
		addChildren((TreeNode)root, 1);
				
		return root;

	}

	public static void main(String args[]) {
		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();
		
		//System.out.println("Size:::: " + ((TreeNode)t).getChildren().size());

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}

//*******************************************************************************************************************************//
//PASSING CODE HERE

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//enum Color {
//    RED, GREEN
//}
//
////Abstract Tree
//abstract class Tree {
//
//    private int value;
//    private Color color;
//    private int depth;
//
//    public Tree(int value, Color color, int depth) {
//        this.value = value;
//        this.color = color;
//        this.depth = depth;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public Color getColor() {
//        return color;
//    }
//
//    public int getDepth() {
//        return depth;
//    }
//
//    public abstract void accept(TreeVis visitor);
//}
//
////Tree class
//class TreeNode extends Tree {
//
//    private ArrayList<Tree> children = new ArrayList<>();
//
//    public TreeNode(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitNode(this);
//
//        for (Tree child : children) {
//            child.accept(visitor);
//        }
//    }
//
//    public void addChild(Tree child) {
//        children.add(child);
//    }
//    
//    public ArrayList<Tree> getChildren() {
//        return this.children;
//    }
//    
//    
//
//}
//
////Tree Leaf Class
//class TreeLeaf extends Tree {
//
//    public TreeLeaf(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitLeaf(this);
//    }
//    
//    
//}
//
////Tree vis class
//abstract class TreeVis {
//    public abstract int getResult();
//
//    public abstract void visitNode(TreeNode node);
//
//    public abstract void visitLeaf(TreeLeaf leaf);
//
//}
//
////SUM IN LEAVES VISITOR
//class SumInLeavesVisitor extends TreeVis {
//    int result = 0;
//    public int getResult() {
//        return this.result;
//
//    }
//
//    public void visitNode(TreeNode node) {
//    }
//
//    @Override
//    public void visitLeaf(TreeLeaf leaf) {
//        result+=leaf.getValue();
//
//    }
//
//}
//
////PRODUCT OF RED NODES VISITOR
//class ProductOfRedNodesVisitor extends TreeVis {
//    long result = 1;
//    long mod = 1000000007;
//    public int getResult() {
//        return (int)result;
//
//    }
//
//    public void visitNode(TreeNode node) {
//        if(node.getColor() == Color.RED)
//            result = (result*node.getValue())%mod;
//    }
//
//    @Override
//    public void visitLeaf(TreeLeaf leaf) {
//        // TODO Auto-generated method stub
//        if(leaf.getColor() == Color.RED)
//            result = (result*leaf.getValue())%mod;
//
//    }
//}
//
////FANCY VISITOR
//class FancyVisitor extends TreeVis {
//    int evenNodeSum = 0;
//    int greenLeavesSum = 0;
//    public int getResult() {
//        return Math.abs(evenNodeSum - greenLeavesSum);
//
//    }
//
//    public void visitNode(TreeNode node) {
//        if(node.getDepth()%2 == 0 )
//            evenNodeSum += node.getValue();
//    }
//
//    @Override
//    public void visitLeaf(TreeLeaf leaf) {
//        // TODO Auto-generated method stub
//        if(leaf.getColor() == Color.GREEN)
//            greenLeavesSum += leaf.getValue();
//
//    }
//}
//
//public class JavaVisitorPattern {
//    
//    static HashMap<Integer, HashSet<Integer>> nodeMap = new HashMap<>();
//    static int nodeVals[];
//    static Color colors[];
//    
//    public static void addChildren(TreeNode parentNode, int parent) {
//
//        for(int n : nodeMap.get(parent)) {
//            Tree tree;
//            nodeMap.get(n).remove(parent); //Removing parent from children
//
//            if(nodeMap.get(n).isEmpty() || nodeMap.get(n) == null) {
//                tree = new TreeLeaf(nodeVals[n], colors[n], parentNode.getDepth()+1);
//            }
//            else {
//                tree = new TreeNode(nodeVals[n], colors[n], parentNode.getDepth()+1);
//            }
//            
//            parentNode.addChild(tree);
//            
//            if(tree instanceof TreeNode) {
//                addChildren((TreeNode)tree, n);
//            }
//        }
//        
//        
//    }
//
//    public static Tree solve() {
//        Scanner input = new Scanner(System.in);
//        int numberOfNodes = Integer.parseInt(input.nextLine());
//        
//        colors = new Color[numberOfNodes+1];
//        nodeVals = new int[numberOfNodes+1];
//        
//        for (int i = 1; i <= numberOfNodes; i++) {
//            nodeVals[i] = input.nextInt();
//        }
//        for (int i = 1; i <= numberOfNodes; i++) {
//            colors[i] = input.nextInt() == 0 ? Color.RED : Color.GREEN;
//        }
//
//
//        for (int i = 0; i < numberOfNodes - 1; i++) {
//            int u = input.nextInt();
//            int v = input.nextInt();
//            if(nodeMap.get(u) == null) {
//                HashSet<Integer> nodeChildren = new HashSet<Integer>();
//                nodeChildren.add(v);
//                nodeMap.put(u,nodeChildren);
//            }
//            else {
//                nodeMap.get(u).add(v);
//            }
//            
//            if(nodeMap.get(v) == null) {
//                HashSet<Integer> nodeChildren = new HashSet<Integer>();
//                nodeChildren.add(u);
//                nodeMap.put(v,nodeChildren);
//            }
//            else {
//                nodeMap.get(v).add(u);
//            }
//
//        }
//        
//        
//        Tree root = new TreeNode(nodeVals[1], colors[1], 0);
//        addChildren((TreeNode)root, 1);
//                
//        return root;
//
//    }
//
//    public static void main(String args[]) {
//        Tree root = solve();
//        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
//        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
//        FancyVisitor vis3 = new FancyVisitor();
//
//        root.accept(vis1);
//        root.accept(vis2);
//        root.accept(vis3);
//
//        int res1 = vis1.getResult();
//        int res2 = vis2.getResult();
//        int res3 = vis3.getResult();
//
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);
//    }
//
//}

