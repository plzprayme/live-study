public class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 기본형
    public double distanceFromOrigin() {
        return Math.sqrt(x*x + y*y);
    }

    // 이름은 같지만 매개변수가 다른 것
    public double distanceFromOrigin(Point p) {
        return Math.sqrt(p.x*x + p.y*y);
    }

    // 이름은 같지만 매개변수와 접근제어자가 다른 것
    // 단, 매개변수는 같으면서 접근제어자만 다를 수는 없다
    private double distanceFromOrigin(double x, double y) {
        return Math.sqrt(this.x*x + this.y*y);
    }

    // 이건 안된다는 뜻
//    public double distanceFromOrigin(double x, double y) {
//        return Math.sqrt(this.x*x + this.y*y);
//    }

    // static일 수도 있음
    static public double distanceFromOrigin(Point p1, Point p2) {
        return Math.sqrt(p1.x*p2.x + p1.y*p2.y);
    }


    @Override
    public String toString() {
        return "X: " + x + " Y: " + y;
    }

}
