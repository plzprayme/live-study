public class MyExtendThread extends Thread {
    Data d;

    public MyExtendThread(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        int local = 0;


        while (local < 3) {
            System.out.println(getName() + " Local i: " + ++local);
            System.out.println(getName() + " Instance i: " + ++d.instance);
            System.out.println();
        }
    }
}
