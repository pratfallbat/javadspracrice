package Comparables;
public class PMaximizer {
    public static OurComparable max(OurComparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i += 1) {
            int cmp=items[i].compareTo(items[maxDex]);
            if (cmp>0) {
                maxDex = i;
            }
        }
        return items[maxDex];

    }
    public static PDog maxdog(PDog[] dogs){
        if(dogs==null||dogs.length==0){
            return null;
        }
        PDog maxDog=dogs[0];
        for (PDog d:dogs){
            if(d.size > maxDog.size){
                maxDog=d;
            }
        }
        return maxDog;
    }
    public static void main(String[] args) {
        PDog d1 = new PDog("Elyse", 23);
        PDog d2 = new PDog("Sture", 19);
        PDog d3 = new PDog("Benjamin", 15);
        PDog[] dogs = new PDog[]{d1, d2, d3};
        PDog d = (PDog)max(dogs);
        d.bark();
    }

//    issues are
    //Awkward casting
    //no class implements OurComparable
    //we have to write our own max method ,own min method
    //so we use built in comparable but its generic =Comparable<T>
//public interface Comparable<T>{
//        public  int compareTo(T obj);
//}
}
