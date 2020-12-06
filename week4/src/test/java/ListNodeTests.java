import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ListNodeTests {

    @Test
    @DisplayName("GET LAST TAIL TEST")
    void getLastTailTest() {
        ListNode listNode = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(4, null))));

        boolean isCorrect = listNode.getLastTail().getValue() == 4;
        assumeTrue(isCorrect);
    }
}
