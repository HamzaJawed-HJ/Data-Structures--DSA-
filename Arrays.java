public class Arrays
{
    private int[] items;
    private int count;
    private int size;

    public Arrays(int length)
    {
        this.size = length;
        this.items = new int[size];
    }

    public void insert(int item)
    {
        if (items.length == count)
        {
            int[] newItems = new int[size * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index)
    {
        if (index < 0 || index >= count)
        {
            throw new IllegalArgumentException("Argument is not valid");
        }
        for (int i = index; i < size-1; i++)
        {
            items[i] = items[i + 1];
        }
        count--;
    }

    public void removeFirst()
    {
        if(count==0)
        {
            System.out.println("Array is Empty");
        }
        for(int i = 0; i<size-1;i++)
        {
            items[i] = items[i+1];
        }
        count--;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]+",");
        }
        System.out.print("]");
    }

    public void maximum() {
        int max = items[0];
        for (int i = 0; i < count; i++) {
            if (items[i] > max)
                max = items[i];

        }
        System.out.println("largest element present in array is " + max);
    }

    public void minimum() {
        int min = items[0];
        for (int i = 0; i > count; i++) {
            if (items[i] > min)
                min = items[i];

        }
        System.out.println("smallest element present in array is " + min);
    }

    public void product() {
        int product = items[0];
        for (int i = 0; i < count; i++) {
            product = items[i] * product;

        }
        System.out.println("product of all the numbers are " + product);
    }

    public void average() {
        float sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + items[i];


        }
        float avg = sum / count;
        System.out.println("average of all the numbers are " + avg);
    }

    public void reverse() {
        for (int i = count - 1; i >= 0; i--)
        {
            System.out.println(items[i]);
        }


    }

    public void even() {
        for (int i = 0; i < count; i++) {
            if (items[i] % 2 == 0) {
                System.out.println("even number is " + items[i]);
            }
        }

    }

    public void odd() {
        for (int i = 0; i < count; i++) {
            if (items[i] % 2 != 0) {
                System.out.println("odd number is " + items[i]);
            }
        }

    }

    public void swap(int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;


    }
    public void Prime_Number(){

        for (int i = 0; i <count; i++){
            boolean prime_flag = false;
            for (int j = 2; j <=9;j++){
                if(items[i] != j){
                    if (items[i] % j ==0){
                        prime_flag = false;
                        break;
                    }
                    prime_flag = true;
                }
            }
            if (prime_flag){
                System.out.println("Prime number:"+items[i]+"");
            }
        }

    }


}
