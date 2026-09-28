public class one{

    static boolean flag= true;
    public static void main(String[] args) {
        Thread r= new Thread(()->{
            while (flag) {
                System.out.println("this thread shoud not stop");
            }
        });

        Thread t= new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag=false;
            System.out.println("This is executed");
        }
        );

        r.start();
        t.start();



    }
}