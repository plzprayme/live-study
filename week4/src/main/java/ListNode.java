import org.w3c.dom.Node;

public class ListNode {

    public ListNode tail;
    public Integer value;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public ListNode(ListNode node) {
        tail = node.tail;
        value = node.value;
    }

    public ListNode(int value, ListNode tail) {
        this.value = value;
        this.tail = tail;
    }

    public static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
//        head =
        if (position == 0) {
            nodeToAdd.getLastTail().tail = head;
            return nodeToAdd;
        }

        add(head,nodeToAdd, 1, position);
        return head;
    }

    private static void add(ListNode head, ListNode nodeToAdd, int headPosition, int position) {
        if (headPosition != position) {
            add(head.tail, nodeToAdd, ++headPosition, position);
            return;
        }

        nodeToAdd.getLastTail().tail = head.tail;
        head.tail = nodeToAdd;
    }

    public ListNode duplicate() {
        ListNode cloneNode = new ListNode(value, null);

        if (tail != null) {
            tail.duplicate(cloneNode);
        }

        return cloneNode;
    }

    private void duplicate(ListNode cloneNode) {
        cloneNode.tail = new ListNode(this.value, null);

        if (tail != null) {
            tail.duplicate(cloneNode.tail);
        }
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
