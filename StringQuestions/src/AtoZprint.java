public class AtoZprint {

    public static void main(String[] args) {
        char ch='A';
        while(ch<='Z')
        {
           // System.out.println(ch);
            ch++;
        }
        String name ="Virkam LaGhuLe";
        int left=0;
        while (left<name.length())
        {
            if(name.charAt(left)>='A'&& name.charAt(left)<='Z')
            {
                System.out.println(name.charAt(left));
            }
            left++;
        }

    }
}


