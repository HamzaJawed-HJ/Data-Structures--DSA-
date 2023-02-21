package DSA;
import java.util.Arrays;
public class PriorityQueue{
        private int[] items;
        private int count;
        private int maxsize;

        public PriorityQueue(int capacity){
            this.maxsize=capacity;
            this.items=new int[capacity];
            this.count=0;
        }

        public boolean isempty(){
            return (count==0);

        }
        public boolean isfull(){
            return (count==items.length);
        }

        public void enqueue(int data) {
            if (isfull())
                throw new IllegalStateException("full");
            int i;
            for (i = count - 1; i >= 0; i--) {
                if (items[i] > data)
                    items[i + 1] = items[i];
                else
                    break;
            }
            items[i+1]=data;
            count++;

        }

        public int dequeue() {
            if (isempty())
                throw new IllegalStateException("empty");

            return items[--count];
        }

        public String toString(){
            return Arrays.toString(items);
        }

        public void printqueue(){
            System.out.println("output");

            while (!isempty()){
                System.out.println("["+dequeue()+"]");
            }
        }
    }

