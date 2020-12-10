import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ListNodeTests {

    ListNode head;
    ListNode tail;
    ListNode longTail;
    ListNode node1;
    ListNode node2;

    @BeforeEach
    void init() {
        head = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(4, null))));

        tail = new ListNode(999, null);
        longTail = new ListNode(998, new ListNode(997, null));

        node1 = new ListNode(0, null);
        node2 = new ListNode(0, new ListNode(1, null));
    }

    @Test
    @DisplayName("GET LAST TAIL TEST")
    void getLastTailTest() {
        boolean isCorrect = head.getLastTail().value == 4;
        assumeTrue(isCorrect);
    }

    @Test
    @DisplayName("ADD TEST")
    void addTest() {
        ListNode case1 = ListNode.add(head, tail, 0);
        assumeTrue(case1.toString().equals("[ 999 0 1 2 4 ]"));
        System.out.println("CASE 1 head:" + head.toString());
        System.out.println("CASE 1 tail:" + tail.toString());

        ListNode case2 = ListNode.add(head, longTail, 2);
        System.out.println("CASE 2 head:" + head.toString());
        System.out.println("CASE 2 tail:" + longTail.toString());
        assumeTrue(case2.toString().equals("[ 0 1 998 997 2 4 ]"));


        ListNode case3 = ListNode.add(tail, longTail, 1);
        System.out.println("CASE 3 head:" + tail.toString());
        System.out.println("CASE 3 tail:" + longTail.toString());
        assumeTrue(case3.toString().equals("[ 999 998 997 ]"));
}

    @Test
    @DisplayName("REMOVE TEST")
    void removeTest() {
        ListNode case1 = ListNode.remove(head, 0);
        assumeTrue(case1.toString().equals("[ 1 2 4 ]"));

        ListNode case2 = ListNode.remove(head, 1);
        System.out.println(case2);
        assumeTrue(case2.toString().equals("[ 0 2 4 ]"));

        ListNode case3 = ListNode.remove(head, 2);
        System.out.println(case3);
        assumeTrue(case3.toString().equals("[ 0 1 4 ]"));
    }

    @Test
    @DisplayName("CLONE TEST")
    void cloneTest() {
        ListNode case1 = head.duplicate();
        assumeTrue(case1.toString().equals(head.toString()));
        assumeTrue(case1.getClass() == head.getClass());
        assumeFalse(case1 == head);
    }

    @Test
    @DisplayName("GET SIZE TEST")
    void sizeTest() {
        assumeTrue(head.getSize() == 4);
        assumeTrue(tail.getSize() == 1);
    }

    @Test
    @DisplayName("CONTAIN TEST")
    void containtTest() {
        assumeTrue(ListNode.contains(head, node1));
        assumeTrue(ListNode.contains(head, node2));
        assumeFalse(ListNode.contains(node1, node2));
    }
}
