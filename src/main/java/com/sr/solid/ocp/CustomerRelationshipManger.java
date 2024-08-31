package com.sr.solid.ocp;

public class CustomerRelationshipManger {
    private HealthInsuranceSuveyor healthInsuranceSuveyor;
    public CustomerRelationshipManger(HealthInsuranceSuveyor healthInsuranceSuveyor){
        this.healthInsuranceSuveyor = healthInsuranceSuveyor;
    }
    public boolean isClaimApproved(Customer customer){
        if(healthInsuranceSuveyor.isClaimSurveyApproved(customer)){
            return true;
        }
        else{
            return false;
        }
    }

}
