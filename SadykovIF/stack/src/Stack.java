public class Stack {
   private int maxSize;
   private char[] stack;
   private int top;

   public Stack(int size){
       this.maxSize = size;
       this.stack = new char[size];
       this.top = -1;
   }
   public boolean isEmpty(){
       return (top == -1);
   }
   public boolean isFull(){
       return (top == maxSize-1);
   }
   public void push(char i){
       stack[++top] = i;
   }
   public char pop(){
      return stack[top--];
   }
   public char peek(){
       return stack[top];
   }

}
