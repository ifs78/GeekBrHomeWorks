package gb;

import java.util.Arrays;

public class MyArr {
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void creat() {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
    }


    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void delete(int value) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) break;
        }
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
    }

    public void insert(int value) {
        arr[size] = value;
        size++;
    }

    public void sortBubble() {
        int out, in;
        for (out = arr.length - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    int tmp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = tmp;

                }
            }

        }

    }
    public void sortSelect() {
        int out, in, mark;
        for (out = 0; out < arr.length; out++) {
            mark = out;
            for (in = out + 1; in < arr.length; in++) {
                if (arr[in] < arr[mark]) {
                    mark = in;
                }
            }
            int tmp = arr[out];
            arr[out] = arr[mark];
            arr[mark] = tmp;
        }

    }
    public void sortInsert() {
        int out, in;
        for (out = 1; out < arr.length; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }

    }
    public boolean find(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) break;
        }
        if (i == size) return false;
        else return true;

    }


    public boolean binaryFind(int value) {
        int low = 0;
        int high = size-1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (value == arr[mid]) {
                return true;
            } else {
                if (value < arr[mid]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;

                }
            }
        }
        return false;
    }

}