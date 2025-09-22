import java.util.ArrayList;

public class Session18 {

    public static class MyThread extends Thread {
        private String threadname;

        public MyThread(String threadname) {
            this.threadname = threadname;
        }
        public void login_started() {
            System.out.println("Login Started for = " + threadname);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
               System.out.println(threadname + "intrrupted");

            }

        }
        public void otp() {
            System.out.println("OTP Started for = " + threadname);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(threadname + "intrrupted");

            }
        }
        public void login_done() {
            System.out.println("Login Done for = " + threadname);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(threadname + "intrrupted");

            }
        }
        public void run() {
            login_started();
            otp();
            login_done();

           System.out.println(threadname + "Completed");
        }
    }

    public static class MyClass  {
        private String name;

        public MyClass(String name) {
            this.name = name;
        }
        public void login_started() {
            System.out.println("Login Started for = " + name);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(name + "intrrupted");

            }

        }
        public void otp() {
            System.out.println("OTP Started for = " + name);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(name + "intrrupted");

            }
        }
        public void login_done() {
            System.out.println("Login Done for = " + name);
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(name + "intrrupted");

            }

        }
        public void my_run() {
            login_started();
            otp();
            login_done();

            System.out.println(name + "Completed");
        }
    }

    public static void main(String[] args) {

        ArrayList<MyThread> Thread_name = new ArrayList<>();

        for(int i = 1; i <= 100000; i++)
            Thread_name.add(new MyThread("T" + i));

        for (MyThread new_thread : Thread_name)
             new_thread.start();


        //ArrayList<MyClass> my_name = new ArrayList<>();

        //for(int i = 1; i <= 100000; i++)
        //    my_name.add(new MyClass("T" + i));

        //for (MyClass new_name : my_name)
        //    new_name.my_run();


        //MyClass T4 = new MyClass("Sunidhi");
        //MyClass T5 = new MyClass("Varad");
        //MyClass T6 = new MyClass("Sachin");

        //T4.my_run();
        //T5.my_run();
        //T6.my_run();


    }
}
