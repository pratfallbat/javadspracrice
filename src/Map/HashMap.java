package Map;

import java.util.*;

//import  java.util.HashMap;
                                                                                                            //https://www.dotnetperls.com/hashmap-java
public class HashMap {

    public static void TreeMap(){
        Map<String,Integer> num= new TreeMap<>();
        num.put("horse",4);
        num.put("fish",0);
        num.put("bat",2);
        num.put("spider",8);
        num.put("human",2);

        System.out.println(num);

    }
    public static void howmanytimes(){
        java.util.HashMap<String, Integer> counts = new java.util.HashMap<>();
        String[] a={"first","second" ,"third"};
        //we have seen none of the words
        for(String w:a){
counts.put(w,0);
        }
        String[] b={"first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third"};
//        for(String wb:b){
//            int oldCount=   counts.get(wb);
//             counts.put(wb,oldCount+1);
//        }
        for(String wb:b){
            //more verbose
            if(counts.containsKey(wb)){
                int oldCount=   counts.get(wb);
                counts.put(wb,oldCount+1);
            }
        }
        System.out.println(counts);

    }
    public static String uniqueUsingHasHmap(String str){

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
        Set<Character> ss = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char currchSet=str.charAt(i);
            ss.add(currchSet);
        }
        System.out.println(ss);

        return ans;
    }
    public static Set<String> uniqueEasyway() {
        String[] b={"first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third","first","second" ,"third"};
        Set<String> ss = new HashSet<>();
        for(String s :b){
            ss.add(s);
        }
        System.out.println(ss);
        return ss;
    }

        public static void main(String[] args) {
       String sx="abaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbeeefffccdde";
        String unq= uniqueUsingHasHmap(sx);
        System.out.println(unq);
        howmanytimes();
            Set<String> uniqueEasyHashSetway= uniqueEasyway();
            TreeMap();
    }

}

