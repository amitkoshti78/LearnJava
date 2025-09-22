public class Session17 {

    public static class MyThread extends Thread {
        private String threadname;

        public MyThread(String threadname) {
            this.threadname = threadname;
        }

        public void run(){
            for (int i = 0; i < 10; i++) {
                System.out.println(threadname + " i = " + i);
                try {
                    Thread.sleep(500);
                } catch(InterruptedException e) {
                    System.out.println(threadname + "intrrupted");

                }
            }
            System.out.println(threadname + "Completed");
        }
    }

    public static void main(String[] args) {
        MyThread T1 = new MyThread("Thread 1");
        MyThread T2 = new MyThread("Thread 2");
        MyThread T3 = new MyThread("Thread 3");

        T1.start();
        T2.start();
        T3.start();


    }
}
