public class Deque {
    private int[] deque;
    private int front;
    private int rear;
    private int items;
    private int maxSize;

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public Deque(int s){
        maxSize = s;
        deque = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }


    public void insertLeft(int i) {
        if (front == -1)
            front = maxSize-1;
        deque[--front]=i;
        items++;

    }

    public void insertRight(int i) {
        if (rear == maxSize - 1)
            rear = -1;
        deque[++rear] = i;
        items++;
    }

    public int removeLeft(){
        int temp = deque[front++];
        if (front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public int removeRight(){
        int temp = deque[rear--];
        if (rear == 0)
            rear = maxSize;
        items--;
        return temp;

    }
}
class DequeMain{
    public static void main(String[] args) {
        Deque q = new Deque(5);
        q.insertLeft(10);
        q.insertLeft(20);
        q.insertLeft(30);
        q.insertLeft(40);

        while (!q.isEmpty()){
            int item = q.removeLeft();
            System.out.print(item + " ");
        }
        }
    }

