package Map;
import java.util.List;
import org.junit.Test;
import static  org.junit.Assert.*;
public class MapHelper {

    //make method generics
public static<K,V> V get(Map61B<K,V> sim,K key){
if(sim.containsKey(key)){
    return sim.get(key);
}
return null;
}
//SInce generic doesnt know k is string we use comparable
//public static <K,V> K maxkey(Map61B<K,V> map){
//List<K> keylist = map.keys();
//K largest=keylist.get(0);
//    for(K k:keylist){
//    if(k.compareTo(largest)>0){
//        largest=k;
//    }
//    }
//    return largest;
//}

//    public static <K extends Comparable<K>,V>  K maximumKey(Map61B<K,V> map){
//        List<K> keylist = map.keys();
//        K largest=keylist.get(0);
//        for(K k:keylist){
//            if(k.compareTo(largest) > 0) {
//                largest=k;
//            }
//        }
//        return largest;
//    }
public static <K extends Comparable<K>, V> K maxKey(Map61B<K, V> map) {
    List<K> keylist = map.keys();
    K largest = keylist.get(0);
    for (K k : keylist) {
        if (k.compareTo(largest) > 0) {
            largest = k;
        }
        }
    return largest;
}

    @Test
    public void testGet() {
        Map61B<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
        Integer actual = get(m, "fish");
        Integer expected = 9;
        assertEquals(expected, actual);

    assertEquals(null, get(m, "awefawefawef"));
        Map61B<Integer, Integer> im = new ArrayMap<Integer, Integer>();
        im.put(1, 3);
        im.put(2, 9);
        im.put(3, 10);
        Integer imactual = get(im,1);
        Integer imexpected = 3;
        assertEquals(imexpected, imactual);

        assertEquals(null, get(im, 4));

    }
//    @Test
//    public void testmax(){
//        Map61B<String, Integer> em = new ArrayMap<String, Integer>();
//        //em.put("aorse", 3);
//        em.put("fish", 9);
//        em.put("house", 10);
//        String actual = maximumKey(em);
//        System.out.println(em);
//        String expected = "house";
//        //assertEquals(expected, actual);
//
//    }
@Test
public void testMaxKey() {
    Map61B<String, Integer> m = new ArrayMap<String, Integer>();
    m.put("horse", 3);
    m.put("fish", 9);
    m.put("house", 10);
    m.put("rat", 19);
    m.put("bat", 13);

    String actual = MapHelper.maxKey(m);
    String expected = "rat";
    assertEquals(expected, actual);
}
}
