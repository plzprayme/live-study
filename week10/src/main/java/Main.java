public class Main {
    public static void main(String[] args) {
//        MyExtendThread t1 = new MyExtendThread();
//
//        Runnable r = new MyRunnableThread();
//        Thread t2 = new Thread(r);

        // main에서 발생시키면 main의 Stack Trace를 확인할 수 있다.
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        int a = 1;

//        Runnable r = new MyRunnableThread();
//        Thread t1 = new Thread(r);
//        Thread t2 = new Thread(r);
//
//        t1.start();
//        t2.start();

        Data d = new Data();
        MyExtendThread t1 = new MyExtendThread(d);
        MyExtendThread t2 = new MyExtendThread(d);
        t1.start();
        t2.start();

    }
}
