package List;

public class AList<Item> {
    private Item[] items;
    private int size;
    public AList() {
        items = (Item[]) new Object[3];
        size = 0;
    }
    public void addLast(Item x) {
        if (size == items.length) {
            System.out.print("size from addlast"+size);

            resize(size + 1);
        }

        items[size] = x;
        size = size + 1;
    }
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public Item getLast() {
        return items[size - 1];
    }
    public Item get(int i) {
        return items[i];
    }
public int size() {
        return size;
    }
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }

    public void insert(Item x, int position) {
        Item[] newItems = (Item[]) new Object[items.length + 1];

        System.arraycopy(items, 0, newItems, 0, position);
        newItems[position] = x;

        System.arraycopy(items, position, newItems, position + 1, items.length - position);
        items = newItems;
    }
    public void addFirst(Item x) {
        insert(x, 0);
    }

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
