import java.lang.Math; 

public class HelloWorld
{
  public static int maxHeight(Node node){
    if(node==null){
      return 0;
    }
    return 1+ Math.max(maxHeight(node.left),maxHeight(node.right));
  }
  
  public static int checkBalanced(Node node){
    if(node==null){
      return 0;
    }
    if(Math.abs(maxHeight(node.left)-maxHeight(node.right))>1){return 0;}
    else{return 1;}
  }

  public static void main(String[] args)
  {
    Node node = new Node(2);
    node.insert(1);
    node.insert(0);
    //node.insert(3);
    node.print();
    System.out.print(checkBalanced(node));
    
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
