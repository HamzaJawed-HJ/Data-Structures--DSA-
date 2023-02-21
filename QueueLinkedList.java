public class QueueLinkedList
{
    private node first;

    public QueueLinkedList()
    {
        this.first = null;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void DisplayQueue()
    {
        System.out.println("Queue FIFO");
        node current = first;
        System.out.print("[");
        while (current != null)
        {
            current.displayNode();
            current = current.next;
        }
        System.out.print("]");

    }

    public void Enqueue(int data)
    {
        node newNode = new node();
        newNode.data = data;
        node current = first;

        if(isEmpty())
        {
            newNode.next = first;
            first = newNode;
        }
        else
            {
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
            }
    }

    public node Dequeue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("List is Empty");
        }
        node current = first;
        first = current.next;
        return current;
    }

    public int maxValue() {
        node current = first;
        int temp = current.data;
        while (current != null) {
            if (current.data > temp) {
                temp = current.data;
            }
            current = current.next;
        }
        return temp;
    }

    public int minValue() {
        node current = first;
        int temp = current.data;
        while (current != null) {
            if (current.data < temp) {
                temp = current.data;
            }
            current = current.next;
        }
        return temp;
    }

    public float avg() {
        node current = first;
        int temp = current.data;

        float avg = 0, sum = 0;
        do {
            sum = sum + current.data;
            current = current.next;

        } while (current != null);

        avg = sum / listLength();
        return avg;

    }

    public int product() {
        node current = first;
        int temp = current.data;

        int prod = 1;
        do {
            prod = prod * current.data;
            current = current.next;

        } while (current != null);

        return prod;

    }

    public void Odd() {
        node current = first;
        int temp = current.data;
        while (current != null) {
            if (current.data % 2 != 0) {
                temp = current.data;
                System.out.print("\nOdd Values: " + temp);
            }
            current = current.next;
        }
    }

    public void Even()
    {
        node current = first;
        int temp = current.data;
        while (current != null)
        {
            if (current.data % 2 == 0)
            {
                temp = current.data;
                System.out.print("\nEven Values: " + temp);
            }
            current = current.next;
        }
    }

    public void Find(int data)//incomplete
    {
        node current = first;
        boolean flag=false;

        while (current != null)
        {
            current = current.next;

            if (data == current.data)
                flag = true;
        }
        System.out.println("\nValue Present: "+flag);
    }

    public void Positive() {
        node current = first;
        int temp;
        while (current != null) {
            if (current.data > 0) {
                temp = current.data;
                System.out.print("\nPositive Values " + temp);
            }
            current = current.next;
        }
    }

    public void Negative() {
        node current = first;
        int temp;
        while (current != null) {
            if (current.data < 0) {
                temp = current.data;
                System.out.print("\nNegative Values " + temp);
            }
            current = current.next;
        }

    }

    public void Replace(int pos, int data) //Replace Function
    {
        node current = first;
        int temp = 0;
        while (current != null)
        {
            if (temp == pos)
            {
                current.data=data;
            }
            temp++;
            current = current.next;
        }
    }

    public void PrimeNumbers()
    {
        node current = first;
        while(current!= null)
        {
            int count=0;
            for (int i = 1; i <= current.data; i++) {
                if (current.data % i == 0) {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.println("\nprime number: " + current.data);
            }
            current = current.next;
        }
    }
    public void Reverse()
    {
        node prev,current,next;
        prev = null;
        current = first;
        next = first;
        while(current!=null)
        {
            next = next.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        DisplayQueue();
    }

    public void commonData()
    {
        while (first.next!=null)
        {
            node current = first.next;
            while(current!=null)
            {
                if(first.data==current.data)
                {
                    System.out.println(current.data);
                }
                current = current.next;
            }
            first = first.next;
        }
    }

    public int listLength()
    {
        node current = first;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }



}
