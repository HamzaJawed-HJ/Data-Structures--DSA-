public class DoublyList
{
    private node first;
    private node last;

    public DoublyList()
    {
        this.first = null;
        this.last = null;
    }
    public boolean isEmpty() //Check if list is empty
    {
        return (first == null);
    }
    public void displayListForwards() //BigO(n)
    {
        node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next; //Used to increase Iteration
        }
    }
    public void displayListBackwards() //BigO(n)
    {
        node current = last;
        while (current != null) {
            current.displayNode();
            current = current.prev; //Used to increase Iteration
        }
    }

    public void insertAtFirst(int data)
    {
        node newNode = new node();
        newNode.data = data;
        if (isEmpty())
        {
            last = newNode;
        }
        else
        {
            first.prev = newNode;
            newNode.next = first;
        }
        first = newNode;
    }
    public void insertAtLast(int data) //Insert At last position
    {
        node newNode = new node();
        newNode.data = data;

        if(isEmpty())
        {
            first = newNode;
        }
        else
            {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }

    public node deleteFirst()
    {
        node current = first;
        first = first.next;
        first.prev = null;
        return current;
    }

    public node deleteLast()
    {

            node current = last;
            last = last.prev;
            return current;
    }

    public int maxValue()
    {
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


    public void InsertAfter(int key, int data) //Insert After Number Function
    {
        node current = first;

        while (current != null)
        {
            node newNode = new node();

            if(current.data==key)
            {
                newNode.data=data;
                newNode.next = current.next;
                newNode.prev = current;
                newNode.next.prev = newNode;
                current.next = newNode;
            }
            current=current.next;
        }

    }
    public void InsertBefore(int key, int data) //Insert After Number Function
    {
        node current = first;

        while (current != null)
        {
            node newNode = new node();

            if(current.data==key)
            {
                newNode.data=data;
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
            current=current.next;
        }

    }


    public int minValue()
    {
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

    public void FindPosition(int data)
    {
        node current = first;
        int pos=1;
        while(current!=null)
        {
            if(current.data==data)
            {
                System.out.println("Found at Position: "+pos);
            }
            pos++;
            current = current.next;
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