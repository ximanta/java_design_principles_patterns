package com.sr.solid.ocp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerRelationshipManger {
    private final HealthInsuranceSuveyor healthInsuranceSuveyor;
    public boolean isClaimApproved(Customer customer){
        if(healthInsuranceSuveyor.isClaimSurveyApproved(customer)){
            return true;
        }
        else{
            return false;
        }
    }

}
