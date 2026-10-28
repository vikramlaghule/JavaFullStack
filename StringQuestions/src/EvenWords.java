public class EvenWords {

    public static void main(String[] args) {
        String name="Hello world java programming is very gooda";

        String []words=name.split(" ");

        for (String word:words)
        {
            if(word.length()%2==0)
            {
                System.out.println(word);
            }
        }
    }
}
