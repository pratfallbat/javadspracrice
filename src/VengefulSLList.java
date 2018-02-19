
/** SList with additional operation printLostItems() which prints all items
 * that have ever been deleted. */
public class VengefulSLList<Item> extends SLLists<Item> {
    SLLists<Item> deletedItems;

    public VengefulSLList() {
//since it cannot access private field of sllist
     //explicitly call theconstructor although ot necessary
        super();
        //super(x)
        deletedItems = new SLLists<Item>();
    }

    public VengefulSLList(Item x) {

        //super(x) if dont it calls super()  by default
        deletedItems = new SLLists<Item>();
    }

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    /** Prints deleted items. */
    public void printLostItems() {
        deletedItems.print();
    }

    public static void main(String[] args) {

        VengefulSLList<Integer> vs1 = new VengefulSLList<Integer>(0);
        vs1.addLast(1);
        vs1.addLast(5);
        vs1.addLast(10);
        vs1.addLast(13);
        // vs1 is now: [1, 5, 10, 13]


        vs1.removeLast();
        vs1.removeLast();
        // After deletion, vs1 is: [1, 5]

        // Should print out the numbers of the fallen, namely 10 and 13.
        System.out.print("The fallen are: ");
        vs1.printLostItems();
    }
}