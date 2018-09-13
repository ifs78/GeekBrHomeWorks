public class Reverse {
    private String input;

    public Reverse(String in){
        input = in;
    }
    public void invert(){
        int size = input.length();
        Stack st = new Stack(size);


        for (int i = 0; i < size; i++) {
           char ch = input.charAt(i);
           st.push(ch);
        }
        for (int i = 0; i < size; i++) {
            if (!st.isEmpty()) {
                char chr = st.pop();
                System.out.print(chr);
            }
        }
    }
}
