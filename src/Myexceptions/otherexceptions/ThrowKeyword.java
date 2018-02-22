package Myexceptions.otherexceptions;

class UnderAgeException extends Exception{

}
public class ThrowKeyword {

    static void ageValidate(int age) throws UnderAgeException{
        if(age<18){
            throw new UnderAgeException();
        }
    }
    public static void main(String args[]) {
        try {
            ageValidate(17);
        } catch (UnderAgeException e) {
            System.out.println("throw caught in main");
            System.out.println(e);
//            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}



