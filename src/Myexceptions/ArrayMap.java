package Myexceptions;

import Map.Map61B;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


        import org.junit.Test;
        import static  org.junit.Assert.*;
        import java.lang.reflect.Array;
        import java.util.ArrayList;
        import java.util.List;
public class ArrayMap<K,V> implements Map61B<K,V> {
    private K[] keys;
    private V[] values;
    int size;

    public ArrayMap(){
//        keys=new K[];
        //but we cant make generic array instantiation
        keys =(K[])new Object[5];
        values =(V[])new Object[5];
        size=0;
    }

    private int keyIndex(K key) {
        for(int i=0;i<size;i++){
            if(keys[i].equals(key)) {
                return i;
            }
            //should not look all the keys
        }
        return -1;
    }

    @Override
    public boolean containsKey(K key) {
        int index=keyIndex(key);
//        if(index>-1){
//            return true;
//        }
//        return false;
        return index > -1;
    }

    @Override
    public V get(K key) {
        int index=keyIndex(key);
        return values[index];
        //this will crash if item is not here
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(K key, V value) {
        int index=keyIndex(key);
        if(index == -1){
            keys[size]=key;
            values[size]=value;
            size+=1;
            return;
        }
        values[index]=value;
        //redundant
        // keys[index]=key;
    }
    @Override
    public List<K> keys() {
//        return keys;
        //convert java arrays to list
        List<K>  keylist =new ArrayList<>();
        for(int i=0;i<keys.length;i++){
            keylist.add(keys[i]);
        }
        return keylist;
    }
    @Test
    public void test(){
        Map.ArrayMap<String,Integer> m =new Map.ArrayMap<String,Integer>();
        m.put("horse",3);
        int expected=3;
        assertEquals((Integer)expected, m.get("horse"));
//assertEquals(long,long);
        //so widen our types
//     we can also do object object
    }

    public static void main(String[] args) {
        Map.ArrayMap<String,Integer> m =new Map.ArrayMap<String,Integer>();
        m.put("horse",3);
        m.put("fish",9);
        m.put("house",10);
        System.out.println(m.get("fish"));
    }

}
