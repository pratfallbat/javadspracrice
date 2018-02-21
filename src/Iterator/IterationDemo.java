package Iterator;

import Map.ArrayMap;

public class IterationDemo {

    public static void main(String[] args) {
        ArrayMap<String,Integer> am=new ArrayMap<String, Integer>();
        am.put("hello",5);
        am.put("ahello",25);
        am.put("bhello",15);
       //instantiate nested class thats not static
                      //  if using nested class use below
                        // ArrayMap.KeyIterator ami=am.new KeyIterator();
//    while (ami.hasNext()){
//        System.out.println(ami.next());
//    }
        //replace above while loop by
        for(String s: am){
            System.out.println(s);
        }

        //1.implements Iterable
        //2.iterator() in Arraymap
        //3.KeyIterator implements Iterator

    }
}
