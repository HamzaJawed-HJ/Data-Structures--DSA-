public class CircularList {
    private node first;
    private node last;

    public CircularList() //initializes first and last
    {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() //Check if list is empty
    {
        return (first == null);
    }

    public void insertAtFirst(int data)
    {
        node newNode = new node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
        last.next = first;
    }

    public void display() //Displaying List
    {
        node current = first;
        do {
            current.displayNode();
            current = current.next;//Used to increase Iteration
        } while (current != first);
    }

    public void insertLast(int data) //Insert At last position
    {

        node newNode = new node();
        newNode.data = data;

        last.next = newNode;
        newNode.next = first;
        last = newNode;
    }

    public void deleteAtFirst() //Delete at first position
    {
        node current = first;
        if (isEmpty()) {
            System.out.println("No Node Exists ");
        }
        first = current.next;
        last.next = first;
    }

    public void deleteAtLast() // Delete at First Pos
    {
        node current = first;

        if (isEmpty()) {
            System.out.println("No Node Exists ");
        }
        do {
            current = current.next;

        } while (current.next != last);
        last = current;
        current.next = first;

    }

    public void MaxValue() {
        node current = first;
        int temp = current.data;
        while (current.next != first)
        {
            current = current.next;
            if (temp < current.data)
                temp = current.data;

        }
        System.out.println(temp);
    }

    public void MinValue() {
        node current = first;
        int temp = current.data;
        while (current.next != first)
        {
            current = current.next;
            if (temp > current.data)
            {
                temp = current.data;
            }
        }
        System.out.println(temp);
    }

    public float Average() {
        node current = first;
        float avg = 0, sum = 0;
        do {
            sum = sum + current.data;
            current = current.next;

        } while (current.next != last);

        avg = sum / listLength();
        return avg;
    }


    public int listLength() {
        node current = first;
        int length = 0;
        while (current != last) {
            length++;
            current = current.next;
        }
        return length;
    }


    public int product() {
        node current = first;
        int temp = current.data;

        int prod = 1;
        do {
            prod = prod * current.data;
            current = current.next;

        } while (current != last);

        return prod;

    }

    public void Reverse()
    {
        node prev,current,next;
        prev = null;
        current = first;
        next = first;
        while(current!=last)
        {
            next = next.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        display();
    }


    public void Odd() {
        node current = first;
        int temp = current.data;
        while (current != last)
        {
            current = current.next;
            if (current.data % 2 != 0) {
                temp = current.data;
                System.out.print("\nOdd Values: " + temp);
            }
        }
    }

    public void Even() {
        node current = first;
        int temp = current.data;
        while (current != last)
        {
            current = current.next;
            if (current.data % 2 == 0) {
                temp = current.data;
                System.out.print("\nEven Values: " + temp);
            }

        }

    }

    public void Find(int data)
    {
        node current = first;
        boolean flag=false;

        while (current != last)
        {
            current = current.next;

            if (data == current.data)
                flag = true;

        }
        System.out.println("\nValue Present: "+flag);
    }

    public void commonData()
    {
        while (first.next!=first)
        {
            node current = first.next;
            while(current!=first)
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

    public void Replace(int pos, int data) //Replace Function
    {
        node current = first;
        int temp = 0;
        while (current != last)
        {
            temp++;
            current = current.next;
            if (temp == pos)
            {
                current.data=data;
            }
        }
        first = current;
    }
    public void PrimeNumbers()
    {
        node current = first;
        while(current!= last)
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
}

