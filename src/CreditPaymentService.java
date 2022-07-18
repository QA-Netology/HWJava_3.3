public class CreditPaymentService {
    public float calculate (float amount, float percent, float term) {
        float payment = (float) (amount * ((percent/12/100) / (1 - (Math.pow((1 + (percent/12/100)), -(term * 12))))));
        return payment;
    }
}
