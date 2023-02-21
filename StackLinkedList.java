public class StackLinkedList
{
    private node first;

    public StackLinkedList()
    {
        this.first = null;
    }
    public  boolean isEmpty()
    {
        return (first==null);
    }
    public int peek()
    {
        return first.data;
    }
    public void PrintStackList()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
        }
        while(!isEmpty())
        {
            System.out.println(pop());
        }
    }

    public void Push(int data)
    {
        node extraNode = first;
        first = new node();
        first.data = data;
        first.next = extraNode;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty");
        }
        int data = first.data;
        first = first.next;
        return data;

    }
}
