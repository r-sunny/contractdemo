package com.bonify.contractdemo;

import com.bonify.contractdemo.business.ContractManager;
import com.bonify.contractdemo.service.Contract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContractdemoApplication {

    static Contract contract;

    public static void main(String[] args) {

        SpringApplication.run(ContractdemoApplication.class, args);
        ContractManager contractManager = new ContractManager();
        contract = contractManager.getContract(args[0]);
        contractManager.printContract(contract);
    }
}
