//List61B is hypernym of AList and SLlist
//Alist is hyponym of list61B
//SLlist is hyponym of List 61B
public class Inheritance {
    /** Returns the length of the longest word. */
    //interface inheritance:works on all list(what)

    public static String longest(List61B<String> list) {
        int maxDex = 0;
        for (int i = 0; i < list.size(); i += 1) {
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()) {
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }
    //OVERLOADING
    //we dont have to write two longest overloaded method for ALIST and SLlist seperately

    public static void main(String[] args) {
        AList<String> someList = new AList<>();
        someList.addLast("elk");
        someList.addLast("are");
        someList.addLast("watching");
        System.out.println(longest(someList));
        someList.print();
        SLLists<String> someoList = new SLLists<>();
        someoList.addLast("elk");
        someoList.addLast("dwell");
        someoList.addLast("watching");
        System.out.println(longest(someoList));
        someoList.print();

        List61B<String> someList3 = new SLLists<String>();
        someList3.addFirst("elk");
        someList3.addLast("dwell");
        someList3.addLast("on");
        someList3.addLast("existential");
        someList3.addLast("crises");
        someList3.print();
        //this is implementation inheritance
        //can decide whether or not to reuse print
        //every SLList is a List61b

    }

}
