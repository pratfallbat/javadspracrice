package Testing;

import org.junit.Test;
        import static  org.junit.Assert.*;
public class SortTest  extends groovy.util.GroovyTestCase {


    @Test
    public  void testsort(){
        String[]  input2 ={"i","have","an","egg"};
        String[] expected={"an","egg","have","i"};
        Sort.sort(input2);
        assertArrayEquals(expected,input2);
    }
    @Test
    public  void testFindSmallest(){
        String[]  input2 ={"i","have","xan","egg"};
        int  expected2 = 3;
        int actual= Sort.findSmallest(input2,1);
        assertEquals(expected2,actual);

        String[]  input3 ={"there","are","many","pigs"};
        int  expected3 = 2 ;
        int actual2= Sort.findSmallest(input3,2);
        assertEquals(expected3,actual2);
    }
    @Test
    public  void testswap(){
        String[] input={"I","have","an","egg"};
        int a=0;int b=2;
        String[] expected={"an","have","I","egg"};
        Sort.swap(input,a,b);
        assertArrayEquals(expected,input);
    }


//    public static void main(String[] args) {
//   testsort();
//
//        testFindSmallest();
//        testswap();
//    }

    public  static  void testadhoc(){
        //        String[]  input ={"I","have","an","egg"};
//        String[]  expected ={"an","egg","have","I"};
//        String[]  input2 ={"I","have","an","egg"};
//System.out.print("------------------ADHOC-------------------------");
//        if(!java.util.Arrays.equals(input,expected)){
//            System.out.println("There seems to be problem");
//        }

        //to get more info about adhoc testing
//
//        for(int i=0;i<input.length;i++){
//            if(!input[i].equals(expected[i])){
//                System.out.println(" Mismatch in position "+i+" expected "+expected[i]+" but got "+input[i]);
//            }
//        }
//        System.out.print("------------------ADHOC-------------------------");
//        String[]  input ={"I","have","an","egg"};
//        String[]  expected ={"an","egg","have","I"};
//        Sort.sort(input);
//        org.junit.Assert.assertArrayEquals(expected,input);

    }
}

