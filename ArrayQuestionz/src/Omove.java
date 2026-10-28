public class Omove {
    public static void main(String[] args) {
        int arr[]={12,5,6,5,8,0,8,2,1};

        int len=arr.length;

        for(int i=1;i<arr.length-1;i++)
        {
            int temp=0;
           if(arr[i]==0)
           {
               temp=arr[i];
               arr[i]=arr[i-1];
               arr[i-1]=temp;
           }
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
