public class StackArray
{

    private int maxsize;
    private int[] Array;
    private int top;
    public int count;

    public StackArray(int size)
    {
        this.maxsize = size;
        this.Array = new int[maxsize]; //Initialize Array with given size
        this.top = -1;
    }

    public boolean isFull()
    {
        return (maxsize-1 == top);
    }

    public boolean isEmpty()
    {
        return (top==-1);
    }

    public int peek()
    {
        return Array[top];
    }

    public void count()
    {
        System.out.println("Number of Elements: "+count);
    }

    public void PrintArray(StackArray stackArray) throws Exception
    {
        while(!isEmpty())
        {
            System.out.println(pop());
        }
    }


    public StackArray Reverse(StackArray stackArray) throws Exception
    {
        StackArray tempArray = new StackArray(stackArray.maxsize);
        while(!stackArray.isEmpty())
        {
            tempArray.push(stackArray.pop());
        }
        return tempArray;
    }



    public void push(int data) throws Exception
    {
        if (isFull())
        {
            throw new Exception("Stack is Full");
        }
        else {
            Array[top] = data;
            top++;
            count++;
        }


    }


    public int pop() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Stack is Already Empty!");
        }
        else
        {
            int data = Array[top];
            top--;
            return data;
        }
    }


    public void max() throws Exception
    {
        int temp = top;
        int i;
        for(i=0; i<maxsize; i++)
        {
            if(temp<peek())
            {
                temp = peek();
            }
            pop();
        }
        System.out.println("Max Value: "+temp);

    }

    public void min() throws Exception
    {
        int temp = top;
        int i;
        for(i=0; i<maxsize; i++)
        {
            if(temp>peek())
            {
                temp = peek();
            }
            pop();
        }
        System.out.println("Min Value: "+temp);
    }

    public void OddEven() throws Exception
    {
        int i,odd,even;

        for(i=0; i<count; i++)
        {
            if(peek()%2==0)
            {
                even = peek();
                System.out.println("Even: "+even);
            }
            else
            {
                odd = peek();
                System.out.println("Odd: "+odd);
            }
            pop();
        }
    }



    public void product() throws Exception
    {
        int product = 1;
        int i;
        for(i=0; i<maxsize; i++)
        {
            product = product * peek();
            pop();
        }
        System.out.println("product Value: "+product);
    }

    public float sum() throws Exception
    {
        float sum = 0;
        int i;
        for(i=0; i<count; i++)
        {
            sum = sum + peek();
            pop();
        }
        System.out.println("Sum is: "+sum);
        return sum;
    }


    public void avg() throws Exception
    {
        float avg;
        avg = sum()/count;
        System.out.println("Avg is: "+avg);
    }

    public void Factors(int num) throws Exception
    {
        while(!isEmpty())
        {
            if (num%peek() == 0)
            {
                System.out.println("Factors: "+peek());
            }
            pop();
        }

    }

    public void position(int data) throws Exception
    {
        int i;
        int pos =0;
        int temp=0;
        for(i=0; i<count; i++)
        {
            if(peek()==data)
            {
                temp = pos;
            }
            pos++;
            pop();
        }
        System.out.println("Found at Position: "+temp);

    }

}
