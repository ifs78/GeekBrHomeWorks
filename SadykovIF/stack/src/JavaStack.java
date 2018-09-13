import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStack {
    public static void main(String[] args) throws IOException {
        String input;
        while (true){
            input = getString();
            if (input.equals("")) break;


            Reverse rv = new Reverse(input);
            rv.invert();
        }
    }
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
