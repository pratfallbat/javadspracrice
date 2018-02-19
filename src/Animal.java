public interface Animal {

    default void greet(Animal a){
        System.out.println("hello Animal");
    }
    default void sniff(Animal a){
        System.out.println("sniff Animal");
    }
//    default void flatter(Dog a){
//        System.out.println("flatter Animal");
//    }

    default void flatter(Animal a){
        System.out.println("flatter Animal");
    }
}
