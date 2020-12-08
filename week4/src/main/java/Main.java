

import java.io.IOException;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(4, null))));

        ListNode tail = new ListNode(999, null);
        ListNode longTail = new ListNode(998, new ListNode(997, null));

        ListNode case1 = ListNode.add(head, tail, 0);
//        assumeTrue(case1.toString().equals("[ 999 0 1 2 4 ]"));
        System.out.println("CASE 1 head:" + head.toString());
        System.out.println("CASE 1 tail:" + tail.toString());

        ListNode case2 = ListNode.add(head, longTail, 2);
        System.out.println("CASE 2 head:" + head.toString());
        System.out.println("CASE 2 tail:" + tail.toString());
//        assumeTrue(case2.toString().equals("[ 0 1 998 997 2 4 ]"));


        ListNode case3 = ListNode.add(tail, longTail, 1);
        System.out.println("CASE 3 head:" + tail.toString());
        System.out.println("CASE 3 tail:" + longTail.toString());
//        assumeTrue(case3.toString().equals("[ 999 998 997 ]"));

    }
}
