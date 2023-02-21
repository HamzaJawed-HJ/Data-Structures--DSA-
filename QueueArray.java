public class QueueArray
{
    private int data,count;
    private int Maxsize;
    private int front,rear;
    private int items[];

    public QueueArray(int size)
    {
        this.Maxsize = size;
        this.items = new int[size];
        this.rear = -1;
        this.front = -1;
        this.count = 0;
    }



    public boolean isEmpty()
    {
        if( rear==-1)
        {
            return true;
        }
        else return false;
    }

    public void PrintQueueArray() throws Exception
    {
        while(!isComplete())
        {
            System.out.println(Dequeue());
        }
    }

    public boolean isComplete()
    {
        return front == Maxsize;
    }

    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
        else
        {
            return items[front];
        }
    }

    public void Enqueue(int data) throws Exception
    {
         if(isEmpty())
        {
            front++;
        }
            rear++;
            items[rear] = data;
            count++;
    }

    public int Dequeue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
        else
        {
            int data = items[front];
            front++;
            count--;
            return data;
        }
    }

    public void Max() throws Exception
    {
        int temp = front;
      while(!isComplete())
        {
            if(temp<peek())
            {
                temp = peek();
            }
            Dequeue();
        }
        System.out.println("Max Value is: "+temp);
    }

    public void Min() throws Exception
    {
        int temp = front;
        while(!isComplete())
        {
            if(temp>peek())
            {
                temp = peek();
            }
            Dequeue();
        }
        System.out.println("Max Value is: "+temp);
    }

    public void Product() throws Exception
    {
        int product=1;
        while(!isComplete())
        {
            product = product*peek();
            Dequeue();
        }
        System.out.println("Product Value is: "+product);

    }
    public float Sum() throws Exception
    {
        float sum = 0;
        while (!isComplete())
        {
            sum = sum + peek();
            Dequeue();
        }
        System.out.println("Sum of all Values: "+sum);
        return sum;
    }

    public void Avg() throws Exception
    {
        float avg;
        avg = (Sum()/count);
        System.out.println("Average is: "+avg);
    }

    public void Find(int data) throws Exception {
        int pos = 0;
        while (!isComplete()) {
            if (peek() == data) {
                System.out.println("Found at Index: " + pos);
            } else
                pos++;
            Dequeue();

        }
    }
        public void Even() throws Exception
        {
            int even;
            while(!isComplete())
            {
                if(peek()%2==0)
                {
                    even = peek();
                    System.out.println("Even: "+even);
                }
                Dequeue();
            }

        }

    public void Odd() throws Exception
    {
        int even;
        while(!isComplete())
        {
            if(peek()%2!=0)
            {
                even = peek();
                System.out.println("Even: "+even);
            }
            Dequeue();
        }

    }

    public int count() throws Exception
    {
        int i;
        int count = 0;
        for(i=front; i<=rear; i++)
        {
            count++;
        }
        return count;
    }

    public void Factorial(int data) throws Exception
    {
        int fact=0,i;
        int[] newQueue = new int[data];
        for(i=front; i<=rear; i++)
        {
            fact = data*(data-1);
            Dequeue();
        }
        System.out.println("Factorial: "+fact);
    }

    public void Fibonacci(int limit) throws Exception
    {
        int fib=0,i;
        int[] newQueue = new int[limit];
        for(i=front; i<=limit; i++)
        {
            System.out.println("Fibonacci: "+fib);
            fib = fib +(fib+1);

        }

    }






}
