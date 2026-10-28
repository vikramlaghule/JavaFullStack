public class Palindrome {
    public static void main(String[] args) {
        String name = "965569";
        int left = 0;
        int right = name.length() - 1;
        boolean flag = true;
        while (left<right) {

            if (name.charAt(left) != name.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}