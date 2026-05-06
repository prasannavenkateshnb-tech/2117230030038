import java.util.*;
class zoho{
    public int[] moveZeros(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }

        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        zoho obj =new zoho();
        int[] result=obj.moveZeros(arr);
        System.out.println("The array after moving zeros "+Arrays.toString(result));
    }
}