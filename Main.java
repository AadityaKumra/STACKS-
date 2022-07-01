class Main {
  public static void main(String[] args) {
    Stack newStack=new Stack(4);
    // if(newStack.isEmpty()){
    //   System.out.println("Stack is empty.");
    // }
    // else{
    //   System.out.println("Eh.Stack not empty.");
    // }
    boolean empty=newStack.isEmpty();
    System.out.println(empty);
    boolean full=newStack.isFull();
    System.out.println(full);
  }
}