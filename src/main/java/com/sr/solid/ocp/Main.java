package com.sr.solid.ocp;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Claim claim = new Claim("claim1", new BigDecimal(10000000));
        Customer customer = new Customer("customer1", 25, claim);
        HealthInsuranceSuveyor suveyor = new HealthInsuranceSuveyor();
        CustomerRelationshipManger customerRelationshipManger = new CustomerRelationshipManger(suveyor);


        if(suveyor.isClaimSurveyApproved(customer)){
            System.out.println("Claim is approved");
        }
        else{
            System.out.println("Claim is not approved");
        }
    }
}
