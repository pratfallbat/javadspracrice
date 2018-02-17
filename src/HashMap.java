import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
//import  java.util.HashMap;
//https://www.dotnetperls.com/hashmap-java
public class HashMap {
    public static void frequency(String[] asdf) {
        java.util.HashMap<String, Integer> m = new java.util.HashMap<String, Integer>();
        for (String word : asdf) {
            Integer freq = m.get(word);
            m.put(word, (freq == null ? 1 : freq + 1));
        }
//        System.out.println(m);
//        System.out.println(m.keySet());
//        System.out.println(m.values());
//        System.out.println(m.get("d"));
//
        java.util.HashMap<Integer,String> hm=new java.util.HashMap<Integer,String>();
        hm.put(1,"Deo");
        hm.put(2,"zen");
        hm.put(3,"porter");
        hm.put(4,"piter");
        System.out.println(hm);
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
        System.out.println(hm.get(4));
//          HashMap<String,Integer> hash=new HashMap<String,Integer>();
//        hash.put("dog", 1);
//        hash.put("cat", 2);
//        hash.put("rabbit", 3);
//        System.out.print(hash);
//        int a = hash.get("dog");
//        int b = hash.get("cat");
//        System.out.println(a+""+b);
        //    System.out.println(hash.keySet());
//        Set<String> keys=hash.keySet();
//        for (String key : keys) {
//            if (hash.containsKey("dog")) {
//                hash.get("dog");
//                System.out.println("dog was found");
//
//            }
//            System.out.println(key);
//        }

    }

    public static void ok(){
        java.util.HashMap<String, String> fruit = new java.util.HashMap<>();
        fruit.put("apple", "red");
        fruit.put("orange", "orange");
        fruit.put("banana", "yellow");
        fruit.put("raspberry", "red");
        fruit.put("raspberry2", "red");
        System.out.println(fruit.size());

        System.out.println(fruit.isEmpty());
        if (fruit.containsValue("red")) {
            System.out.println("Red fruit detected!");

            // Loop over all keys and print them if they have "red" values.
            for (String key : fruit.keySet()) {
                if (fruit.get(key) == "red") {
                    System.out.println(key);
                }
            }
        }
        System.out.println("-------------------");
        // Get all values from the HashMap.
        Collection<String> values = fruit.values();
        // System.out.println(fruit.values());
        for (String valuex : values) {
            System.out.println(valuex);
        }
        Set<String> set = fruit.keySet();
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // Display sorted keys and their values.
        for (String key : list) {
            System.out.println(key + ": " + fruit.get(key));
        }

    }
    public static String unique(String str){

        if(str.length()==0){
            return "";
        }
        String ans="";
        java.util.HashMap<Character,Boolean> hm = new java.util.HashMap<Character,Boolean>();

        for(int i=0;i<str.length();i++){

            char currch=str.charAt(i);
            if(!hm.containsKey(currch)){
                hm.put(currch,true);
                ans=ans+currch;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        String sx="abbccdde";
//        System.out.println(sx);
//
//        String sax= unique(sx);
//        System.out.print(sax);

        String[] a={"a","b","b","c","d","b","b","c"};
        frequency(a);
        ok();
    }

}
