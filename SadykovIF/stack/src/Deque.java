public class Deque {
    private int[] deque;
    private int front;
    private int rear;
    private int items;
    private int maxSize;

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
        deque[front--]=i;
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

    }
}