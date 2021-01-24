public class MyRunnableThread implements Runnable {
    int instance = 0;

    @Override
    public void run() {
        int local = 0;
        String name = Thread.currentThread().getName();

        while (local < 3) {
            System.out.println(name + " Local i:" + ++local);
            System.out.println(name + " Instance i:" + ++instance);
            System.out.println();
        }
    }
}
