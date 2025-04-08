
public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size); // this will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) throws StackException {
        if (this.isFull()) {
            int temp[] = new int[data.length * 2];

            //Manual Copy
            // for (int i = 0; i < data.length; i++) {
            //     temp[i] = data[i];
            // }
            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;

        }
        return super.push(item);
    }
}
