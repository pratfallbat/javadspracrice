
package Comparables;

import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    private String name;
    public int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }
    public int compareTo(Dog uddaDog){
       return this.size-uddaDog.size;
      //  return this.name.compareTo(uddaDog.name);

        //i want to compare myself to other objects
        //there is room for only one compareto function
    }



    private static class NameComparator implements Comparator<Dog>{
        public int compare(Dog a ,Dog b){
            return a.name.compareTo(b.name);
            //comparator compares to other object
            //we can have muliple compare function depending on requirement
            //we dont always want to compare the mehod inn just one way eacch time
        }


    }
    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }


}
