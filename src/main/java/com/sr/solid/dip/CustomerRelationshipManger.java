package com.sr.solid.dip;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerRelationshipManger {
    private final HealthInsuranceSuveyor healthInsuranceSuveyor;
    private final EmailNotifier emailNotifier;

    public boolean isClaimApproved(Customer customer){
        boolean status=healthInsuranceSuveyor.isClaimSurveyApproved(customer);
        if(status){
            emailNotifier.notifyCustomer(status);
            return true;
        }
        else{
            emailNotifier.notifyCustomer(status);
            return false;
        }
    }

}
