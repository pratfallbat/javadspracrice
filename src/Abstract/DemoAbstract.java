package Abstract;


public  class DemoAbstract extends Graphic {
    public int x,y;
    public static void main(String[] args) {
        System.out.println("we can have public static finale var in interfaces");
        System.out.println("Intefaces can have abstract and default methods");
        System.out.println("Abstract class:cannot be instantiated");
        System.out.println("In the middle of class and interfaces");
        System.out.println("use abstract keyword to define abstract methods ,in interface we use no keywords");
        System.out.println("use no keywords for default object and in interfaces used default keyword for concrete methods");

    }

    @Override
    public void draw() {

    }

    @Override
    public void resize() {

    }

 //below cam from interface
    @Override
    public void shred() {

    }

    @Override
    public void shredAll() {

    }
}
