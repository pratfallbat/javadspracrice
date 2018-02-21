package Myexceptions;

import java.io.IOException;

public class ExceptionDemo {
public static void gulgate(){
    String today = "Thursday";
//    if(today.equals( "Thursday")){
////        throw new IOException("Hi");
//        throw new RuntimeException("Hi");
//    }
//    ..checked
    if(today.equals( "Thursday")){
//        throw new IOException("Hi");
        try {
            throw new IOException("Hi");
        } catch (IOException e) {
            System.out.println("psych");
//            e.printStackTrace();
        }
    }
}
    public static void gulgate2() throws IOException{
        String today = "Thursday";
        if(today.equals( "Thursday")){
                throw new IOException("Hi");
        }
    }
    public static void main(String[] args) {
        System.out.println("these exceptioncan be checked and then corrected at compile time");
    // ArrayMap<String,Integer> am=new ArrayMap<String,Integer>();
     //   am.put("hello",6);
        //System.out.println(am.get("yolp"));
gulgate();
        try {
            gulgate2();
        } catch (IOException e) {
            System.out.println("caught");
            //  e.printStackTrace();
        }
    }

}
