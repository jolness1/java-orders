package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServicesImpl {
    @Autowired
    PaymentRepository paymentrepos;

    @Override public Payment save(Payment payment)
    {
        return paymentrepos.save(payment);
    }
}
