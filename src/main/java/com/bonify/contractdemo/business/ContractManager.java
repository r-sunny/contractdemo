package com.bonify.contractdemo.business;

import com.bonify.contractdemo.service.Contract;
import com.bonify.contractdemo.serviceimpl.DslContract;
import com.bonify.contractdemo.serviceimpl.ElectricityContract;
import com.bonify.contractdemo.serviceimpl.RentContract;

public class ContractManager {

    /**
       Returns a contract object of specified type

        @param contractType type of the contract.

        @return {@link Contract} object

        @throws IllegalArgumentException if no contract with the specified type can be found.

     */
    public Contract getContract(String contractType) throws IllegalArgumentException{

        switch(contractType){

            case "electricity" :
                return new ElectricityContract();

            case "dsl" :
                return new DslContract();

            case "appartment_rent" :
                return new RentContract();
        }
        throw new IllegalArgumentException("Invalid contract type");
    }

    /**
        Prints the current contract type to the console.

        @param contract the contract to print.
     */
    public void printContract(Contract contract){

        contract.processContract();
    }
}
