//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Also, sorry that the "Paste" feature no longer works! GitHub broke
// this (so we'll switch to a new provider): https://blog.github.com\
// /2018-02-18-deprecation-notice-removing-anonymous-gist-creation/
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  public static int maxHeight(Node node){
    //if(data!)
    if(node==null){
      return 0;
    }
    return 1+ Math.max(maxHeight(node.left),maxHeight(node.right));
  }
  
  public static int checkBalanced(Node node){
    //if(data!)
    if(node==null){
      return 0;
    }
    if(Math.abs(maxHeight(node.left)-maxHeight(node.right))>1){return 0;}
    else{return 1;}
  }
  
  public static Node createBST(int[] sortedArray) {
		return createBST(sortedArray, 0, sortedArray.length - 1);
	}
	
	private static Node createBST(int[] sortedArray, int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return null;
		}
		int mid = (startIndex + endIndex) / 2;
		Node root = new Node(sortedArray[mid]);
		root.left  = createBST(sortedArray, startIndex, mid - 1);
		root.right = createBST(sortedArray, mid + 1, endIndex);
		return root;
    }

  public static void main(String[] args)
  {
    Node node = new Node(2);
    node.insert(1);
    node.insert(0);
    //node.insert(3);
    node.print();
    System.out.print(checkBalanced(node)+"\n");
    
	int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};
    Node bst = createBST(sortedArray);
    bst.print();
  }
  
}


public class Node
{
  int data;
  Node left, right;
  
  public Node(int data){
  	this.data=data;
  }
  public void insert(int value){
    if(value<= data){
      if(left==null){
      	left= new Node(value);
      }else{
      	left.insert(value);
      }
    }else{
      if(right==null){
      	right= new Node(value);
      }else{
      	right.insert(value);
      }
    }
  }
  
  public void print(){
    if(left!=null){left.print();}
  	System.out.println(data);
    if(right!=null){right.print();}
  }
  
  
  
}
