public class Arr {
    static final int size = 10;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {
        Arr e1 = new Arr();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        first(arr);
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        second(a1);
    }


    public static void first(float[] arr){
       long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(" "+ arr[i]);
        }
        System.out.println("Время работы 1 метода " + (System.currentTimeMillis()- a));
    }
    public static void second(float[] a1){
        for (int i = 0; i < h ; i++) {
            a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
  }




