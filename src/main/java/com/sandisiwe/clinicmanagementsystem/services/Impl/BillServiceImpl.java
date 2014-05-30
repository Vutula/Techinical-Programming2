/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.services.Impl;

import com.sandisiwe.clinicmanagementsystem.domain.Bill;
import com.sandisiwe.clinicmanagementsystem.repository.BillRepository;
import com.sandisiwe.clinicmanagementsystem.services.BillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sandisiwe
 */


@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;
    
    
    @Override
    public List<Bill> getBillPaid() {
        return billRepository.findAll();
        }
    

  
}
