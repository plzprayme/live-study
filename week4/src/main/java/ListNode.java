public class ListNode {



    private ListNode tail;
    private int value;

    public ListNode() {
    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode tail) {
        this.value = value;
        this.tail = tail;
    }

    public static ListNode add(ListNode head, ListNode nodeToAdd, int position) {

        if (position == 1) {
            nodeToAdd.getLastTail().tail = head.tail;
            head.tail = nodeToAdd;
            return head;
        }

        int headPosition = 0;
        while (position > headPosition) {

        }
//        head.setTail(nodeToAdd);
        return new ListNode();
    }

    public int getValue() {
        return value;
    }

    public ListNode getLastTail() {
        return this.tail == null? this : tail.getLastTail();
    }

    public static ListNode remove(ListNode head, int positionToRemove) {
        return new ListNode();
    }

    public static boolean contains(ListNode head, ListNode nodeTocheck) {
        return true;
    }
}
