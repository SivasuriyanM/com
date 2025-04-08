
public class mainSQ {

    public static void main(String[] args) throws StackException, Exception {
        // CustomStack stack = new CustomStack(4);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(4);
        // System.out.println(stack.peek());

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // CustomStack stack = new DynamicStack();
        // DynamicStack stack = new DynamicStack(4);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // System.out.println(stack.peek() + "peek");
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // CustomQueue queue = new CustomQueue(5);
        // // DynamicStack stack = new DynamicStack(4);
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);
        // queue.display();
        // System.out.println("Front  " + queue.front());
        // System.out.println(queue.remove() + " is Removed");
        // queue.display();
        // System.out.println(queue.remove() + " is Removed");
        // queue.display();
        // System.out.println(queue.remove() + " is Removed");
        // queue.display();
        CircularQueue queue = new CircularQueue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        System.out.println("Front  " + queue.front());

        System.out.println(queue.remove() + " is Removed");
        queue.display();
        queue.insert(5);

        System.out.println("Front  " + queue.front());

        System.out.println(queue.remove() + " is Removed");
        queue.display();
        queue.insert(4);

        System.out.println("Front  " + queue.front());

    }
}
