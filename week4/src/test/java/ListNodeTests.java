import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ListNodeTests {

    ListNode head;
    ListNode tail;
    ListNode longTail;

    @BeforeEach
    void init() {
        head = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(4, null))));

        tail = new ListNode(999, null);
        longTail = new ListNode(998, new ListNode(997, null));
    }

    @Test
    @DisplayName("GET LAST TAIL TEST")
    void getLastTailTest() {
        boolean isCorrect = head.getLastTail().value == 4;
        assumeTrue(isCorrect);
    }

    @Test
    @DisplayName("ADD CORRECT? ")
    void addTEST() {
        ListNode case1 = ListNode.add(head, tail, 0);
        assumeTrue(case1.toString().equals("[ 999 0 1 2 4 ]"));

        ListNode case2 = ListNode.add(head, longTail, 2);
        assumeTrue(case2.toString().equals("[ 0 1 998 997 2 4 ]"));
    }
}
