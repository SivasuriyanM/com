
public class DynamicCircularQ extends CircularQueue {

    public DynamicCircularQ() {
        super();
    }

    public DynamicCircularQ(int size) {
        super(size); // this will call CustomStack(int size)
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            int temp[] = new int[data.length * 2];

            //Manual Copy
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            // System.arraycopy(data, 0, temp, 0, data.length);
            front = 0;
            end = data.length;
            data = temp;

        }
        return super.insert(item);
    }
}
