import java.io.IOException;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        Tree theTree = new Tree();
        //for (int i = 0; i < 2; i++) {
          theTree.insert(10);
        theTree.insert(20);
        theTree.insert(30);
        theTree.insert(40);
        theTree.insert(25);
        theTree.insert(36);
        theTree.insert(70);
        //}
        theTree.displayTree();
    }
}
