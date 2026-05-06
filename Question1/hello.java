import java.util.*;
class hello{
    public int secondLargest(int[] arr){
        int n=arr.length;
        if(n<=1) return -1;
        int max=arr[0];
        int smax=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>smax){
                smax=arr[i];
            }
        }
        if(smax==Integer.MIN_VALUE) return max;
        return smax;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.of array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        hello obj=new hello();
        int result=obj.secondLargest(arr);
        System.out.println("The second largest is "+result);

       
    }
}