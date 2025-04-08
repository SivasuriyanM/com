
// Insert Using Recursion Linklist
// Remove Duplicates from sorted List
// Merge Two Sorted List
public class insertURLL {

    public ListNode head;
    private ListNode tail;
    private int size;

    public insertURLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        ListNode ListNode = new ListNode(val);
        ListNode.next = head;
        head = ListNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        ListNode ListNode = new ListNode(val);
        tail.next = ListNode;
        tail = ListNode;

        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        ListNode ListNode = new ListNode(val, temp.next);
        temp.next = ListNode;

        size++;
    }

    //Insert Using Recursion Linklist
    public void insertRec(int val, int index) {
        ListNode ListNode = new ListNode(val);
        ListNode temp = head;
        if (index == 0) {
            insertFirst(val);
            size++;
        }
        rec(ListNode, index - 1, temp);

    }

    private ListNode rec(ListNode ListNode, int index, ListNode temp) {
        if (index == 0) {
            ListNode.next = temp.next;
            temp.next = ListNode;
            size++;
            return ListNode;
        }
        rec(ListNode, index - 1, temp.next);
        return null;
    }

    // Remove Duplicates from sorted List
    public void removeDup() {
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                current.next = current.next.next;
                size--;
            }
            current = current.next;
        }

    }

    //Merge Two Sorted List
    public static insertURLL merge(insertURLL first, insertURLL second) {
        ListNode f = first.head;
        ListNode s = second.head;

        insertURLL ans = new insertURLL();

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;

    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.val;

        ListNode temp = get(size - 2);

        // ListNode temp = head;
        // while (temp.next != tail) {
        //     temp = temp.next;
        // }
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        ListNode prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;

        return val;
    }

    public ListNode find(int value) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public ListNode get(int index) {
        ListNode ListNode = head;
        for (int i = 0; i < index; i++) {
            ListNode = ListNode.next;
        }
        return ListNode;
    }

    public ListNode middleListNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Reverse LL using Recursion
    public void reverse(ListNode node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    //Iterative Reverse -google
    public ListNode iReverse(ListNode node) {
        if (size < 2) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = curr.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;

    }

    //Reverse LL in specific range -google, fb, ms
    public ListNode reverseBetween(ListNode node, int left, int right) {
        if (left == right) {
            return node;
        }

        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;

        return head;

    }

    // reverse in k nodes in LL
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while (true) {

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            if (current == null) {
                break;
            }
            prev = newEnd;
        }

        return head;
    }

    // reverse in AlterNative k nodes in LL
    public ListNode reverseAlterNativeKGroup(ListNode head, int k) {
        if (k <= 1 || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            for (int i = 0; i < k && current != null; i++) {
                prev = current;
                current = current.next;
            }

        }

        return head;
    }

    //Rotate Linked List - FB, Twitter, google
    public ListNode rotateLinkedList(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

    //Palindrome in LL - Google, MS, FB, LinkedIn, Amazon and Apple
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleListNode(head);
        ListNode headSecond = iReverse(mid);
        ListNode reverseHead = headSecond;

        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                return false;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        iReverse(reverseHead);

        return head == null || headSecond == null;

    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void reOrder(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleListNode(head);
        ListNode hs = iReverse(mid);
        ListNode hf = head;

        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if (hf != null) {
            hf.next = null;
        }

    }

}
