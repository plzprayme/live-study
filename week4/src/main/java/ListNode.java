public class ListNode {

    public ListNode tail;
    public int value;

    public ListNode(int value, ListNode tail) {
        this.value = value;
        this.tail = tail;
    }

    public static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        head = head.duplicate();
        nodeToAdd = nodeToAdd.duplicate();

        if (position == 0) {
            nodeToAdd.getLastTail().tail = head;
            return nodeToAdd;
        }

        head.add( nodeToAdd, position);
        return head;
    }

    private void add(ListNode nodeToAdd, int position) {
        if (1 != position) {
            tail.add(nodeToAdd, --position);
            return;
        }

        nodeToAdd.getLastTail().tail = tail;
        tail = nodeToAdd;
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
        ListNode clone = head.duplicate();
        if (positionToRemove == 0) {
            clone = head.tail;
            return clone;
        }

        clone.remove(positionToRemove);
        return clone;
    }

    private void remove(int positionToRemove) {
        if (positionToRemove != 1) {
            tail.remove(--positionToRemove);
            return;
        }

        tail = tail.tail;
    }

    public static boolean contains(ListNode head, ListNode nodeTocheck) {
        head = head.duplicate();
        nodeTocheck = nodeTocheck.duplicate();
        if (nodeTocheck.getSize() > head.getSize()) {
            return false;
        }

        for (int i = 0; i < head.getSize(); i++) {
            if (head.contains(nodeTocheck)) {
                return true;
            }

            head = head.tail;
        }

        return false;
    }

    private boolean contains(ListNode nodeTocheck) {
        if (nodeTocheck.tail == null) {
            return value == nodeTocheck.value;
        }

        if (value != nodeTocheck.value) {
            return false;
        }

        return tail.contains(nodeTocheck.tail);
    }

    @Override
    public String toString() {
        ListNode node = this;

        String result = "[ ";
        while (node != null) {
            result += node.value + " ";
            node = node.tail;
        }
        result += "]";

        return result;
    }
    public ListNode getLastTail() {
        return this.tail == null ? this : tail.getLastTail();
    }

    public int getSize() {
        return getSize(1);
    }

    private int getSize(int size) {
        return this.tail != null ? tail.getSize(++size) : size;

    }
}
