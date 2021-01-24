public class MyException extends Exception {
    public MyException() {
        super();
    }

    public void printError() {
        System.out.println("MyError 발동!");
    }
}
