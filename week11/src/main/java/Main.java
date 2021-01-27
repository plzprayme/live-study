import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Week w1 = Week.FRIDAY;
        Week w2 = Week.FRIDAY;
        Week w3 = Week.MONDAY;
//        System.out.println(w1.hashCode());
//        System.out.println(w2.hashCode());
//        System.out.println(w3.hashCode());
//
//        System.out.println(Arrays.toString(Week.values()));
//
//        for (Week a : Week.values()) {
//            System.out.println(a.ordinal());
////            System.out.println(Enum.valueOf(Week.class, a.toString()));
//        }


        EnumSet<Week> es = EnumSet.allOf(Week.class);
        System.out.println(es);

        EnumSet es2 = EnumSet.of(Week.MONDAY);
        System.out.println(es2);




    }
}
