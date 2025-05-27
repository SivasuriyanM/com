
public class doublyLL {

    public Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }

        head = node;

    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        if (head == null) {
            head.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node prevs = find(after);
        if (prevs == null) {
            System.out.println("Node not found");
            return;
        }

        Node node = new Node(val);
        node.next = prevs.next;
        prevs.next = node;
        node.prev = prevs;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display() {
        Node cur = head;
        Node last = null;
        while (cur != null) {
            System.out.print(cur.val + " <-> ");
            last = cur;
            cur = cur.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while (last != null) {
            System.out.print(last.val + " <-> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public class Node {

        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
