package Map;


import java.util.ArrayList;
import java.util.HashMap;

class Student {
    String name;
    int rollNo;
    int age = 20;
    String gender = "Male";
    String school;
    String dob;

    Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Student) obj).name);
    }

    @Override
    public int hashCode() {

        return 7;
    }
}

public class HashMapPractsie {

    public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(800000000, 9);
//		for (int i = 0; i < 10; i++) {
//			list.add(null);
//		}
//		list.add(5, 9);
//
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");

        System.out.println(str1.equals(str3));
		HashMap<String, Integer> map = new HashMap<>();
//
//		Integer x1 = new Integer(5);
//		Integer x2 = new Integer(5);
//		int x3 = 5;
//        System.out.println(x1.equals(x3));
        Student s3 = new Student("Aman");
        s3.rollNo = 10;
        Student s1 = new Student("Aman");
        s1.rollNo = 5;


        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1);
        System.out.println(s3);
        if (s1 == s3) {
            System.out.println("=");
        }
        if (s1.equals(s3)) {
            System.out.println("equals coming");
        }

    }
}
