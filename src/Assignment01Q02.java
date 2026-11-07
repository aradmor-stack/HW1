public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += (1.0 / (i * 2 + 1));
            } else {
                sum -= (1.0 / (i * 2 + 1));
            }
        }
        approxPi = 4.0 * sum;
        System.out.println(approxPi + " " + actualPi);
    }
}
