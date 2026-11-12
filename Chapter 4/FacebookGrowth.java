public class FacebookGrowth {
    public static void main(String[] args) {
        double users = 1.0;
        int months = 0;

        while (users < 1.5) {
            users *= 1.04;
            months++;
        }

        System.out.println("Months to reach 1.5 billion users: " + months);

        users = 1.0;
        months = 0;

        while (users < 2.0) {
            users *= 1.04;
            months++;
        }

        System.out.println("Months to reach 2 billion users: " + months);
    }
}
