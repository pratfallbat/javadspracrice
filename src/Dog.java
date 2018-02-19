public class Dog implements  Animal {
    public void overload(Animal a){
        System.out.println("Animal overloading");
    }
    public void overload(Dog a){
        System.out.println("Dog overloading");
    }
   public  void sniff(Animal a){
        System.out.println("Dog sniff animal");

    }
   public void flatter(Dog a){
        System.out.println("Dog flatter animal");

    }
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d=new Dog();
        d.overload(d);//overloading
        d.overload(a);//overloading
        a.greet(d);
        a.sniff(d);//overriding
        d.flatter(d);
        a.flatter(d);//not overrided since dont have same signature in child parent class
    }
}
