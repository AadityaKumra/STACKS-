public class Stack{
  int[] arr;
  int top; //top of stack

  public Stack(int size){ //time complexity=o(1) space comp=O(N)
    this.arr=new int[size];
    this.top=-1;
    System.out.println("The stack is created with size of: "+size);
  }

  public boolean isEmpty(){
    if(top==-1){
      return true;
    }
    else{
      return false;
    }
  }

  public boolean isFull(){
    if(top==arr.length-1){
      System.out.println("Stack is full!");
      return true;
    }
    else{
      return false;
    }
  }

  public void push(int value){
    if(isFull()){
      System.out.println("Stack is already full!");
    }
    else{
      arr[top+1]=value;
      top++;
      System.out.println("Value successfully inserted");
    }  
  }

  public void pop(){
    if(isEmpty()){
      System.out.println("Stack is empty!");
    }
    int topStack=arr[top];
    top-=1;
    System.out.println(topStack+" popped.");
    
  }
}