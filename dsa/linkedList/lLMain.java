
public class lLMain {

    public static void main(String[] args) {
        linkedList list = new linkedList();
        System.out.println("Insert Fisrt ");

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.display();
        System.out.println();
        System.out.println("Insert Last ");
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(8);

        list.display();
        System.out.println();
        System.out.println("Insert At Particular Index");
        list.insert(7, 7);
        list.display();
        System.out.println();
        System.out.println("Delete First");
        System.out.println("Deleted Value : " + list.deleteFirst());
        list.display();
        System.out.println();
        System.out.println("Delete Last");
        System.out.println("Deleted Value : " + list.deleteLast());
        list.display();
        System.out.println();
        System.out.println("Delete At Particular Index");
        System.out.println("Deleted Value : " + list.delete(5));
        list.display();
        System.out.println();

        System.out.println("Found Result : " + list.find(8));
        System.out.println();
        System.out.println("Doubly LinkedList ");

        doublyLL dlist = new doublyLL();
        dlist.insertFirst(3);
        dlist.insertFirst(2);
        dlist.insertFirst(1);
        dlist.insertFirst(0);
        dlist.display();

        System.out.println("Insert Last ");
        dlist.insertLast(4);
        dlist.display();
        System.out.println("Insert After Particular value ");
        dlist.insert(2, 25);
        dlist.display();

        System.out.println();
        System.out.println("Circular LinkedList ");
        circularLL cll = new circularLL();
        cll.insert(3);
        cll.insert(2);
        cll.insert(1);
        cll.insert(0);
        cll.display();
        System.out.println();
        System.out.println("Delete");

        cll.delete(0);
        cll.display();

    }

}
