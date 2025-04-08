//Implement Queue using Stacks

public class QueueUsingStacks {

    private CustomStack stackOne;
    private CustomStack stackTwo;

    public QueueUsingStacks() {
        stackOne = new CustomStack();
        stackTwo = new CustomStack();
    }
    //Insertion Efficient Method

    public void add(int item) throws Exception {
        stackOne.push(item);
    }

    public int remove() throws Exception {

        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        stackTwo.display();
        int removed = stackTwo.pop();

        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        return removed;
    }

    public int peek() throws Exception {

        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        stackTwo.display();

        int peeked = stackTwo.peek();

        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        return peeked;
    }

    // removal Efficient 
    public int removeEff() throws Exception {
        stackOne.display();
        return stackOne.pop();
    }

    public void addRemEff(int item) throws Exception {
        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }

        stackOne.push(item);

        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }

    }

    public int peekRemEff() throws Exception {
        stackOne.display();

        return stackOne.peek();
    }
}
