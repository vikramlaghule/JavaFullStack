public class ReverseNumber {
    public static void main(String[] args) {

        int num=342;
        int temp=num;
        while (num!=0)
        {
            System.out.print(num%10);
            num=num/10;
            System.out.println(" : "+num);
        }

        //Storing that variable
        int ans=0;

        while (temp!=0)
        {
          ans=ans*10 + temp%10;
          temp=temp/10;
        }
        System.out.println(ans);
    }
}
