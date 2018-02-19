//Interface is specs of what  a list can and cannot do

public interface List61B<Item> {
    public void addFirst(Item x);
    public Item getFirst();
    public void addLast(Item x);
    public Item getLast();
    public Item get(int i);
    public int size();
    public Item removeLast();
    public void insert(Item x, int position);
    default public void print() {
        for (int i = 0; i < size(); i = i + 1) {
            System.out.print(get(i) + " ");
        }
    }
  //  public void proo();
}

//Interface inheritance
//interface:list of all metod sign
//inheritance:subclass inherits the interface from a superclass
//specifies what the subclass can do but not how
//subclasses must override all these methods i.e if ALISt doesnt have all method of List61b it will not compile