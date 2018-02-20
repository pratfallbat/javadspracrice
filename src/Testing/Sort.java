package Testing;
//Selection Sort
public class Sort {
    public static void  swap(String[] x,int a,int b){
        String temp =x[a];
        x[a]=x[b];
        x[b]=temp;
    }
    public static void  sort(String[] x){
        sort(x,0);
    }
    public static void  sort(String[] x,int k){
        if(k==x.length){
            return;
        }
        //find the smallest item
        int smallest=findSmallest(x,k);
        swap(x,k,smallest);        //Move it to the front//Selection sort the rest using recursion
        sort(x,k+1);
    }
    public static int findSmallest(String[] x,int start ){
        int smallestIndex=start;
        for(int i=start;i<x.length;i++){
            int cmp= x[i].compareTo(x[smallestIndex]);
            //    System.out.println(cmp);
            //            if a[i]<a[smallest] ,cmp will be -1
            if(cmp<0){
                //     System.out.print("i is "+i);
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }
//    public static void main(String[] args) {
//        String[]  input2 ={"i","have","an","egg"};
//      sort(input2);
//        for(int i=0;i<input2.length;i++){
//            System.out.println(input2[i]);
//        }
//    }
}
