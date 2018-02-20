package Comparables;
import java.util.Collection;
import java.util.Comparator;
public class Maximizer {

    public static Comparable max(Comparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i += 1) {
            int cmp=items[i].compareTo(items[maxDex]);
            if (cmp>0) {
                maxDex = i;
            }
        }
        return items[maxDex];



    }

    public static void main(String[] args) {
        Dog d1 = new Dog("ElyseDOg", 23);
        Dog d2 = new Dog("AtureDog", 19);
        Dog d3 = new Dog("BenjaminDog", 15);
        Dog[] dogs = new Dog[]{d1, d2, d3};
       Dog d = (Dog)max(dogs);
    //How to do this
        //    Dog largest= Collection.max(dogs);
       d.bark();
      //  Dog.NameComparator nc= new Dog.NameComparator();
//        if(nc.compare(d2,d3)>0){
//            d2.bark();
//        }
//        else{
//            d3.bark();
//        }
       Comparator<Dog> nc=  Dog.getNameComparator();
        if(nc.compare(d1,d2)>0){
            d1.bark();
        }
        else{
            d2.bark();
        }

// or
// Comparator<Dog> nc=   new NameComparator();;
//        if(nc.compare(d2,d3)>0){
//            d2.bark();
//        }
//        else{
//            d3.bark();
//        }

    }
}
