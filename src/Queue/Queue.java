package Queue;

public class Queue {
    int [] data;
    int f;
    int r;
    int size;
    public Queue(int s){
        data=new int[s];
        f=-1;
        r=-1;
        size=0;
    }
    public void enque(int d){
        if(data.length==size){
            //System.out.println("Array full");
            try {
                throw new QueueFullException();
            } catch (QueueFullException e) {
                e.printStackTrace();
            }

        }
        if(size==0){f=0;}
        r=r+1;
        data[r]=d;
        size++;
    }
    public void deque(){
        if(size==0){
            f = -1;
            r = -1;
            try {
                throw new QueueUnderFlowException();
            } catch (QueueUnderFlowException e) {
                e.printStackTrace();
            }

            //            System.out.println("queue empty");

        }
        int temp=data[f];
        f=f+1;
        size--;

    }
    public void print(){
        for(int i: data){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Queue q1=new Queue(10);
        q1.enque(10);
//  q1.deque();

//        q1.deque();
        q1.print();

    }
}
