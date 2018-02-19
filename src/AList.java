//implements tells Alist is hyponym of List61B

//specifying the capabilities of subclass using the implements keyword is known as interface inheritance.


public class AList<Item> implements List61B<Item>{
    private Item[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (Item[]) new Object[3];
        size = 0;
    }
    @Override
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

    @Override
    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }
    @Override
    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }

    @Override
    /** Inserts item into given position.
     * Code from discussion #3 */
    public void insert(Item x, int position) {
        Item[] newItems = (Item[]) new Object[items.length + 1];

        System.arraycopy(items, 0, newItems, 0, position);
        newItems[position] = x;

        System.arraycopy(items, position, newItems, position + 1, items.length - position);
        items = newItems;
    }

    @Override
    /** Inserts an item at the front. */
    public void addFirst(Item x) {
        insert(x, 0);
    }

    @Override
    /** Gets an item from the front. */
    public Item getFirst() {
        return get(0);
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
