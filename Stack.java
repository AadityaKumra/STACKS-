public class Stack{
  int[] arr;
  int top; //top of stack

  public Stack(int size){ //time complexity=o(1) space comp=O(N)
    this.arr=new int[size];
    this.top=-1;
    System.out.println("The stack is created with size of: "+size);
  }

  
}