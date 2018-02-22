package Myexceptions.otherexceptions;

public class NestedTryCatch {
    public static void main(String args[]) {

        try {
            try {
                int[] arr = new int[5];
                arr[6] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("kejhkqjwhe");
            }

            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println(e);
            }
            String str2 = null;
            System.out.println(str2.length());

        } catch (Exception e) {
            System.out.println("overalll catch");
        }
        System.out.println("normal flow..");
    }
}
