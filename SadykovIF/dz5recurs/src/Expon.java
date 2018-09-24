public class Expon {
    public static void main(String[] args) {
        System.out.println(expon(3,3));
    }
    public static int expon(int n, int m){
        if (m == 1) return n;
        return n*expon(n,m-1);
    }
}
