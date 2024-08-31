package com.sr.solid.dip;

public class HealthInsuranceSuveyor{

    public boolean isClaimSurveyApproved(Customer customer) {
         if(customer.getClaim().getAmount().doubleValue() > 1000000 ){
             return false;
         }
         return true;
     }
}
