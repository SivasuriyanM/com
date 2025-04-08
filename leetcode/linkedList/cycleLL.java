// Linked List Cycle -  Amazon and Microsoft /dsa/circularLL.java
// Lenght Of Cycle -Amazon and Microsoft /dsa/circularLL.java
// Detect Cycle
// Happy Number - Google
//find Middle of Linked List

public class cycleLL {

    public ListNode head;
    public ListNode singlehead;

    private ListNode tail;

    public cycleLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val) {
        ListNode ListNode = new ListNode(val);
        ListNode.next = singlehead;
        singlehead = ListNode;

        if (tail == null) {
            tail = singlehead;
        }

    }

    public void insert(int val) {
        ListNode ListNode = new ListNode(val);
        if (head == null) {
            head = ListNode;
            if (singlehead == null) {
                tail = ListNode;
            }
            // tail.next = ListNode;
            // ListNode.next = head;
            // tail = ListNode;

            // return;
        }
        tail.next = ListNode;
        ListNode.next = head;
        tail = ListNode;

    }

    public void delete(int val) {
        ListNode ListNode = head;
        if (ListNode == null) {
            return;
        }

        if (ListNode.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            ListNode n = ListNode.next;
            if (n.val == val) {
                ListNode.next = n.next;
            }
            ListNode = ListNode.next;
        } while (ListNode != head);

    }

    public void display() {

        ListNode tempt = singlehead;
        while (tempt != null) {
            System.out.print(tempt.val + " -> ");
            tempt = tempt.next;
            if (tempt == head) {
                break;
            }
        }
        ListNode temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
        }

        System.out.print("~" + getValue(head));
    }
// Linked List Cycle -  Amazon and Microsoft

    public boolean hasCycle(ListNode Head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Lenght Of Cycle -Amazon and Microsoft
    public int lenghtOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int size = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    size++;
                } while (temp != slow);
                return size;
            }
        }
        return size;

    }

    // Detect Cycle
    public ListNode detectCycle(ListNode head) {
        int lenght = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                lenght = lenghtOfCycle(slow);
                break;
            }
        }

        if (lenght == 0) {
            return null;
        }

        ListNode f = head;
        ListNode s = head;

        while (lenght > 0) {
            s = s.next;
            lenght--;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;

    }

    public int getValue(ListNode head) {
        return detectCycle(head).val;
    }

    //Happy Number - Google
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSqrt(slow);
            fast = findSqrt(findSqrt(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSqrt(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num = num / 10;
        }
        return ans;
    }

    //find Middle of Linked List
    public ListNode middleListNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public int getMidValue(ListNode head) {
        return middleListNode(head).val;
    }

}
