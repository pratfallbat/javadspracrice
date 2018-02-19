public class AList<Item> {
    private Item[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (Item[]) new Object[3];
        size = 0;
    }
    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if (size == items.length) {
            System.out.print("size from addlast"+size);

            resize(size + 1);
        }

        items[size] = x;
        size = size + 1;
    }
    /** Resizes the underlying array to the target capacity. */
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }

    public static void main(String[] args) {
        AList<Integer> a = new AList<>();
        a.addLast(10);
        a.addLast(10);
        a.addLast(10);
        a.addLast(10);
        System.out.println();
System.out.print(   a.size());
    }
}
