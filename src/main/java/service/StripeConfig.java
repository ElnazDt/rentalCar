package service;

import com.stripe.Stripe;

public class StripeConfig {
    public static void initialize() {
        Stripe.apiKey = "sk_test_private key goes here";
    }
}
