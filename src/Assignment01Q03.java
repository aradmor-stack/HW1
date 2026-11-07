public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int ctr1 = 1;
        int ctr2 = 0;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                ctr1 += ctr2;
                if (ctr1 % 2 == 1) {
                    numOdd++;
                }
                System.out.print(ctr1 + " ");
            } else {
                ctr2 += ctr1;
                if (ctr2 % 2 == 1) {
                    numOdd++;
                }
                System.out.print(ctr2 + " ");
            }
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
