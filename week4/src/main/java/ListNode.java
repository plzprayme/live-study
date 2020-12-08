public class ListNode {

    public ListNode tail;
    public int value;

    public ListNode(int value, ListNode tail) {
        this.value = value;
        this.tail = tail;
    }

    public static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (position == 0) {
            nodeToAdd.getLastTail().tail = head;
            return nodeToAdd;
        }

        ListNode clone = head;
        while (position != 1) {
            --position;
            clone = clone.tail;
        }

        nodeToAdd.getLastTail().tail = clone.tail;
        clone.tail = nodeToAdd;

        return head;
    }

    public static ListNode remove(ListNode head, int positionToRemove) {
        if (positionToRemove == 0) {
            return head.tail;
        }

        ListNode clone = head;
        while (positionToRemove != 1) {
            --positionToRemove;
            clone = clone.tail;
        }

        clone.tail = clone.tail.tail;
        return head;
    }

    public static boolean contains(ListNode head, ListNode nodeTocheck) {
        return true;
    }

    @Override
    public String toString() {
        ListNode node = this;

        String result = "[ ";
        while (node != null) {
            result +=  node.value + " ";
            node = node.tail;
        }
        result += "]";

        return result;
    }

    public ListNode getLastTail() {
        return this.tail == null? this : tail.getLastTail();
    }

    public int getSize() {
        return getSize(1);
    }

    private int getSize(int size) {
        return this.tail != null? tail.getSize(++size) : size;

    }
}
