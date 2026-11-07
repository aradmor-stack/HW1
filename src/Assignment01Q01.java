public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String currString = args[i];
            char c = currString.charAt(0);
            int Asciival = (int) c;
            if (Asciival % 5 == 0) {
                System.out.println(c);
            }

        }

    }
}
