public class SinglyList {
    private node first;


    public SinglyList()
    {
        this.first = null;
    }

    public void insertFirst(int data) //BigO(1)
    {
        node newNode = new node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertAtGiven(int pos, int data)
    {
        node current = first;
        node newNode = new node();
        newNode.data = data;

        if(pos==0)
        {
            newNode.next = first;
            first = newNode;
        }
        else
        {
            for (int i = 1; i < pos; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    public void deleteFirst()
    {
        first = first.next;

    }

    public int listLength() {
        node current = first;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void insertAtLast(int data) {
        node current = first;
        node newNode = new node();
        newNode.data = data;
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next = newNode;

    }

    public void deleteLast() {
        node current = first;

        while (current.next.next != null)
        {
            current = current.next;
        }
        current.next = null;

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
        displayList();
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



    public void displayList() //BigO(n)
    {
        node current = first;
        while (current != null)
        {
            current.displayNode();
            current = current.next; //Used to increase Iteration
        }
    }

}

