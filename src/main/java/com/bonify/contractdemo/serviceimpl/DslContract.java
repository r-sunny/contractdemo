package com.bonify.contractdemo.serviceimpl;

import com.bonify.contractdemo.service.Contract;

public class DslContract implements Contract {

    @Override
    public void processContract() {

        System.out.println("Processed dsl");
    }
}
