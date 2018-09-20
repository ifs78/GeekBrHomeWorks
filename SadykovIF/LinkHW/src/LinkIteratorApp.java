public class LinkIteratorApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iter = new LinkIterator(list);

        iter.insertAfter("Artem",22);
        iter.insertBefore("Denis",21);
        iter.insertAfter("Vadim", 26);
        iter.insertAfter("Oleg", 23);
        list.display();
        System.out.println();
        iter.nexLink();

        iter.deleteCurrent();
        iter.insertBefore("Ivan", 30);
        iter.nexLink();
        iter.nexLink();
        iter.insertAfter("Fedor",20);
        iter.deleteCurrent();
        list.display();

    }
}
