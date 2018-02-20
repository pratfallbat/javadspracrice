package Stack;

public class StackUsingArray {
    private int[] dataArray;
    private static final int DEFAULT_SIZE = 10;
    private int top;

    public StackUsingArray() {
        top = -1;
        dataArray = new int[DEFAULT_SIZE];
    }

    public StackUsingArray(int size) {
        top = -1;
        dataArray = new int[size];
    }

    public void push(int data)  {
        if (isFull()) {
            grow();
            //throw new StackOverFlowException();
        }
        top++;
        dataArray[top] = data;
        System.out.println(data+ " pushed");
    }

    private void grow() {
        int[] temp =dataArray;
        dataArray = new int[temp.length*2];
        for(int i =0;i<temp.length;i++){
            dataArray[i] = temp[i];
        }
    }

    public int pop()  {
        if (isEmpty()) {
            //throw new StackUnderFlowException();
            System.out.println("Stack empty");
        }
        System.out.println(dataArray[top]+ " poped");
        return dataArray[top--];
    }

    // display() {
    //
    // }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == dataArray.length;
    }

    public int getTop()  {
        if (isEmpty()) {
     //       throw new StackUnderFlowException();
            System.out.println("Stack empty");
        }
        return dataArray[top];
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackUsingArray sa=new StackUsingArray();
        sa.push(10);
        sa.push(20);
        sa.push(30);

        for(int i:sa.dataArray){
            System.out.println(i);
        }
        while(!sa.isEmpty()){
            sa.pop();
        }


    }

}
