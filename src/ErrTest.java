public class ErrTest {

   public static void main(String[] args) {
        String[][] arr;
        int sum = 0;
        try {
            arr = initArray(4,4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("Arr [" + i + "],[" + j + "] не является числом" );
                }
            }
        System.out.println("Сумма элементов массива = " + sum);
    }

    private static String [][] initArray(int row, int col) throws MyArraySizeException {
        if (row != 4 || col != 4) throw new MyArraySizeException("Размер должен быть 4х4.");
        return new String[][]{{"3","5","2","3"},{"6","4","3","1"}};
    }
}
class MyArraySizeException extends Exception {
    MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String message) {
        super(message);
    }
}