package com.bonify.contractdemo.serviceimpl;

import com.bonify.contractdemo.service.Contract;

public class RentContract implements Contract {

    @Override
    public void processContract() {

        System.out.println("Processed apartment");
    }
}
