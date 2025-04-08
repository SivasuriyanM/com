
public class MainSQ {

    public static void main(String[] args) throws StackException, Exception {
        QueueUsingStacks qUS = new QueueUsingStacks();
        qUS.add(1);
        qUS.add(2);
        qUS.add(3);

        System.out.println(qUS.remove());
        System.out.println(qUS.peek());

        qUS.addRemEff(1);
        qUS.addRemEff(2);
        qUS.addRemEff(3);
        System.out.println(qUS.removeEff());
        System.out.println(qUS.peekRemEff());
        System.out.println();

        // Scanner s = new Scanner(System.in);
        // int t = s.nextInt();
        // for(int i = 0; i<t;i++){
        //     int n = s.nextInt();
        //     int m = s.nextInt();
        //     int x = s.nextInt();
        //     int[] a = new int[n];
        //     int[] b = new int[m];
        //     for(int j = 0; j<n;j++){
        //         a[j] = s.nextInt();
        //     }
        //     for(int j = 0; j<n;j++){
        //         b[j] = s.nextInt();
        //     }
        // }
        int[] a = {4, 2, 2, 5, 1};
        int[] b = {2, 1, 8, 5};
        System.out.println(TwoStacksGame.twoStacks(10, a, b));
        System.out.println();
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println("LAH : " + LargestAreaHistogram.largestAreaHistogram(arr));
        System.out.println();
        System.out.println("Is valid : " + ValidParantheses.isValid("({]})"));
        System.out.println("Minimum add to make parantheses valid : " + ValidParantheses.minAddToMakeValid("(()"));
        System.out.println("Minimum add to make parantheses balance : " + ValidParantheses.minAddToMakebal("(())))"));

    }

}
