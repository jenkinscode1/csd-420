import java.util.Random;

public class ThreeThreads {


    public static void main(String[] args) {
        Random r = new Random();

        /* Create three threads:
         * 1. Print random letters (a-z)
         * 2. Print random digits (0-9)
         * 3. Print random symbols (!, @, #, $, %, &, *)
         * Each thread should print 10,000 characters.
         */

        Thread letters = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    char c = (char) ('a' + r.nextInt(26));
                    System.out.print(c);
                }
            }
        });

        Thread digits = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    char c = (char) ('0' + r.nextInt(10));
                    System.out.print(c);
                }
            }
        });

        Thread symbols = new Thread(new Runnable() {



            public void run() {
                char[] s = {'!', '@', '#', '$', '%', '&', '*'};
                for (int i = 0; i < 10000; i++) {
                    char c = s[r.nextInt(s.length)];
                    System.out.print(c);
                }
            }
        });

        letters.start();
        digits.start();
        symbols.start();
    }
}