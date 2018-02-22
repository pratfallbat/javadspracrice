package Myexceptions.otherexceptions;

public class CommonExceptions {

public static void main(String[] args) {
try{
		int x = 10/0;
		System.out.println(x);}
		catch (ArithmeticException e){
            System.out.println(e);
        }
    System.out.println("Aftre ArithmeticException ok");
//
//		int[] arr = new int[3];
//		arr[4] = 5;
//
    try {
        String s = null;
        System.out.println(s.length());

    }
    catch (NullPointerException e){
        System.out.println(e);
    }
    System.out.println("After ignoring nullpointer exception we ran this line");

    try {
        String s1 = "a";
        Integer i = Integer.parseInt(s1);
    }
    catch (NumberFormatException e){
        System.out.println(e+"ok");
    }
    System.out.println("After ignoring NumberFormatException exception we ran this line again");

        }
        }
