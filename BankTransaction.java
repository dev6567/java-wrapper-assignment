
public class BankTransaction {
    public static double remainingLimit(Double limit, double spent) {
        if (limit == null) return 0.0;
        return limit - spent;
    }

    public static void main(String[] args) {
        Double limit = 10000.0;
        double spent = 4500.0;
        System.out.println("Remaining Limit: " + remainingLimit(limit, spent));
        System.out.println("Null Limit: " + remainingLimit(null, spent));
    }
}
