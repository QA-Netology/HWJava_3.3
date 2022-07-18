public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float amount = 1_000_000; // сумма кредита
        float percent = 9.99F; // процентная ставка, % годовых
        float term = 3; // год (а)
        float payment = service.calculate(amount, percent, term);
        String str = String.format ("Ежемесячный платёж: %.0f руб." , payment);
        System.out.println(str);
    }
}
