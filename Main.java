class Main {
  public static void main(String[] args) {
    Stack stack=new Stack(4);
    // if(newStack.isEmpty()){
    //   System.out.println("Stack is empty.");
    // }
    // else{
    //   System.out.println("Eh.Stack not empty.");
    // }
    boolean empty=stack.isEmpty();
    System.out.println(empty);
    boolean full=stack.isFull();
    System.out.println(full);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    
    full=stack.isFull();
    System.out.println(full);
    
    stack.push(5);
    stack.pop();
    stack.pop();

    stack.peek();

    stack.deleteStack();
    
  }
}