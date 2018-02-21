package Abstract;

public abstract class Graphic implements Paper {
public int x,y;
public void moveTo(int newX,int newY){

}
 //an abstact class does not have to implement though
   public void shredY(){
       System.out.println("u");
   }
   //Q what happen if we put
    // public abstract void shred();

public abstract void draw();
    public abstract void resize();
}
