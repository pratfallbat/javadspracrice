package Comparables;

public class PDog implements OurComparable {
    private String name;
    public int size;

    public PDog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }
    public int compareTo(Object o){
        PDog uddaDog=(PDog) o;
        return this.size-uddaDog.size;
    }
}
