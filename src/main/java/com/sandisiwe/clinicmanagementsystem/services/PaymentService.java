/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services;

import com.sandisiwe.clinicmanagementsystem.domain.Payment;
import java.util.List;

/**
 *
 * @author sandisiwe
 */
public interface PaymentService {
    public List<Payment> getPaymentMade();
}