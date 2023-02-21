package DSA;
public class Main {
    public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(recursivebinarysearch(a,0,a.length,4));
}

    public static int recursiveLinearSearch(int[] a,int i,int x){
        int n=a.length-1;
        if(i>n)
            return -1;
        else if (a[i]==x)
            return i;
        else
            return recursiveLinearSearch(a,i+1,x);
    }

    public static int recursivebinarysearch(int[]a,int p,int r,int x){
        System.out.println("["+p+".... ...."+r+"]");
        int q;
        if(p>r)
            return -1;
        else{
            q=(p+r)/2;
            if(a[q]==x)
                return q;
            else if (a[q]>x)
                return recursivebinarysearch(a,p,q-1,x);
            else
                return recursivebinarysearch(a,q+1,r,x);
        }
    }




    public static int linearsearch(int a[],int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x)
                return i;
        }
        return -1;
    }


    public static int binarysearch(int[] a,int x){
        int p=0,q;
        int r=a.length-1;
        while (p<=r){
            q=(p+r)/2;
            if(a[q]==x)
                return q;
            else if (a[q]>x){
                r=q+1;
            }
            else {
                p=q+1;
            }
        }
        return -1;
    }

}

