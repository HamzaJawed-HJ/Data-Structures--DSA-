public class main
{

        public static void main(String[] args) throws Exception {
            Arrays array = new Arrays(5);
            SinglyList singlyList = new SinglyList();
            CircularList circularList = new CircularList();
            DoublyList doublyList = new DoublyList();
            StackLinkedList stackLinkedList = new StackLinkedList();
            StackArray stackArray = new StackArray(10);
            QueueArray queueArray = new QueueArray(10);
            CircularQueueArray circularQueueArray = new CircularQueueArray(5);
            QueueLinkedList queueLinkedList = new QueueLinkedList();


            singlyList.insertFirst(1);
            singlyList.insertFirst(2);
            singlyList.insertFirst(3);

            singlyList.displayList();

            singlyList.deleteFirst();

            singlyList.displayList();
            








        }

}
