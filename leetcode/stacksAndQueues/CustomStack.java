
public class CustomStack {

    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE); // this call the parameter constructor with the default_size value as size
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Con't push element into the stack, Stack is full!!");
        }

        data[++ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can't pop element from the stack, Stack is empty!!");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can't peek element from the stack, Stack is empty!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " <- ");

        }
        System.out.println("LAST");

    }
}
