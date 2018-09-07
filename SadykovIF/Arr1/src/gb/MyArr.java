package gb;

public class MyArr {
    private int[] arr;
    private int size;

    public MyArr(int size){
        this.size = size;
        this.arr = new int[size];
    }

    public void creat() {
        for (int i = 0; i < size ; i++) {
            arr[i] = (int) (Math.random() * size);
        }
    }


    public void display(){
       for (int i = 0; i < size ; i++) {
           System.out.print(arr[i]+ " ");
       }
   }

   public void delete(int value){
       int i=0;
       for (i = 0; i < size; i++) {
           if (arr[i] == value) break;
       }
       for (int j = i; j < size - 1; j++) {
           arr[j] = arr[j+1];
       }
       size--;
   }

    public void insert(int value) {
        arr[size] = value;
        size++;
    }
}
