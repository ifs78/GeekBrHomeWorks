public class Tree {
    private Node root;
    public Node find (int key){
        Node current = root;
        while (current.value!=key){
            if (key < current.value){
                current = current.leftChild;
            } else{
                current = current.rightChild;
            }
            if (current == null){
                return null;
            }
        }
        return current;
    }
    public void insert (int value){
       Node node = new Node();
       node.value = value;
       if (root == null){
           root = node;
       }else{
           Node current = root;
           Node parent;
           while (true){
               parent = current;
               if (value < current.value){
                   current = current.leftChild;
                   if (current == null){
                       parent.leftChild = node;
                       return;
                   }
               }else {
                   current = current.rightChild;
                   if (current == null){
                       parent.rightChild = node;
                       return;
                   }
               }
           }
       }

    }
    public void displayTree(){
        Stack stack = new Stack(100);
        stack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;

        while (isRowEmpty == false){
            Stack localStack = new Stack(100);
            isRowEmpty = true;
            for (int i = 0; i < nBlanks; i++) {
                System.out.println("");
            }
            while (stack.isEmpty() == false){
                Node temp = stack.pop();
                if (temp != null){
                    temp.display();
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null){
                        isRowEmpty = false;
                    }
                }else{
                    System.out.println("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks*2-2 ; j++) {
                    System.out.println(" ");
                }
                System.out.println(" ");
                nBlanks = nBlanks/2;
                while (localStack.isEmpty() == false){
                    stack.push(localStack.pop());
                }
                System.out.println(".......................");
            }
        }
    }
}
