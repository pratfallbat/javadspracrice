//implements tells SLlist is hyponym of List61B

public class SLlist {
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* The first item (if it exists) is at sentinel.next. */
    private IntNode sentinel;
    private int size;

    /** Creates an empty SLList. */
    public SLlist() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLlist(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size = size + 1;
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the list. */
    public void addLast(int x) {
        size = size + 1;

        IntNode p = sentinel;

        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }
    /** Returns the size of the list. */
    public void print() {
        IntNode q = sentinel.next;

        /* Advance p to the end of the list. */
        while (q != null) {
            System.out.print(" "+q.item+"");
            q = q.next;
        }

    }


    public static void main(String[] args) {
        SLlist L = new SLlist();
        L.addLast(10);
        L.addLast(15);
        L.addLast(20);
L.print();
//        System.out.println(L.size());


    }

}



