
public class mainLL {

    public static void main(String[] args) {
        insertURLL list = new insertURLL();
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(5);

        System.out.println("Recurse Reverse");
        list.display();

        System.out.println();
        list.reverse(list.head);
        System.out.println("Iterative Reverse");
        // list.iReverse(list.head);
        list.display();

        System.out.println("Insert Using Recursion At Particular Index");
        list.insertRec(2, 2);
        list.insertRec(2, 2);
        list.insertRec(4, 5);
        list.insertRec(4, 5);
        list.display();
        System.out.println();
        list.reverseBetween(list.head, 2, 5);
        list.display();

        System.out.println();
        list.removeDup();
        list.display();
        System.out.println();
        insertURLL list2 = new insertURLL();
        list2.insertLast(0);
        list2.insertLast(7);
        list2.insertLast(9);
        list2.display();
        System.out.println();
        System.out.println("Merging Two List");
        insertURLL ans = insertURLL.merge(list, list2);
        ans.display();
        System.out.println();
        System.out.println("Circular Linked List");
        cycleLL cll = new cycleLL();
        cll.insertFirst(4);
        cll.insertFirst(5);
        cll.insertFirst(6);
        cll.insertFirst(7);
        cll.insert(41);
        cll.insert(3);
        cll.insert(2);
        cll.insert(1);
        cll.insert(0);
        cll.display();
        System.out.println();
        System.out.println("Delete");
        cll.delete(0);
        cll.display();
        System.out.println();
        System.out.println("Has Cycle or Not : " + cll.hasCycle(cll.head));
        System.out.println("Lenght of Cycle : " + cll.lenghtOfCycle(cll.head));
        System.out.println("Detect Cycle : " + cll.getValue(cll.head));
        System.out.println("Is Happy Number : " + cll.isHappy(19));
        System.out.println("Middle of Linked List : " + cll.getMidValue(list.head));
        System.out.println("Unsorted list");
        mergeSortLL mlist = new mergeSortLL();
        mlist.insertFirst(5);
        mlist.insertFirst(2);
        mlist.insertFirst(6);
        mlist.insertFirst(9);
        mlist.insertFirst(1);
        mlist.display();
        mlist.sortList(mlist.head);
        System.out.println();
        System.out.println("Merge Sort on List");
        mlist.display();
        System.out.println();
        System.out.println("Bubble Sort");
        bubbleSortLL bll = new bubbleSortLL();
        for (int i = 7; i > 0; i--) {
            bll.insertLast(i);
        }
        System.out.println("Before Sorting");
        bll.display();
        bll.sort();
        System.out.println();
        System.out.println("After Bubble Sorting");
        bll.display();
        System.out.println();

        insertURLL palList = new insertURLL();
        palList.insertLast(1);
        palList.insertLast(3);
        palList.insertLast(5);
        // palList.insertLast(5);
        palList.insertLast(3);
        palList.insertLast(1);
        palList.display();
        System.out.println();
        System.out.println("Is this Palindrome : " + palList.isPalindrome(palList.head));
        palList.reOrder(bll.head);
        bll.display();
        System.out.println();
        bll.deleteFirst();
        bll.display();
        System.out.println();
        System.out.println(bll.getSize());
        list.insertFirst(6);
        list.display();

        //Use one func at a time
        // System.out.println();
        // list.display(list.reverseKGroup(list.head, 2));
        // System.out.println();
        // list.display(list.reverseAlterNativeKGroup(list.head, 2));
        System.out.println();
        list.display(list.rotateLinkedList(list.head, 2));

        // one more to finish...
        // Succesfully Completed Linked List !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!......:)
    }
}
