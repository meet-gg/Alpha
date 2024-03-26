package Exception;

public class even_odd {
    private static boolean isOddTurn = true;

    public static void main(String[] args) {
        Thread odd = new Thread(new Odd());
        Thread even = new Thread(new Even());
        odd.start();
        even.start();
    }

    public static class Odd implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i += 2) {
                synchronized (even_odd.class) {
                    while (!isOddTurn) {
                        try {
                            even_odd.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    isOddTurn = false;
                    even_odd.class.notify();
                }
            }
        }
    }

    public static class Even implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 100; i += 2) {
                synchronized (even_odd.class) {
                    while (isOddTurn) {
                        try {
                            even_odd.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    isOddTurn = true;
                    even_odd.class.notify();
                }
            }
        }
    }
}
