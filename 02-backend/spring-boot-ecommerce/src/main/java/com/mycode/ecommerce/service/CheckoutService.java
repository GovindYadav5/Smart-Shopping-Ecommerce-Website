package com.mycode.ecommerce.service;

import com.mycode.ecommerce.dto.PaymentInfo;
import com.mycode.ecommerce.dto.Purchase;
import com.mycode.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
