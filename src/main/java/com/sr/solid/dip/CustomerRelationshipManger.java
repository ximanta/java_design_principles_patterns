package com.sr.solid.dip;

public class CustomerRelationshipManger {
    private HealthInsuranceSuveyor healthInsuranceSuveyor;
    private EmailNotifier emailNotifier;
    public CustomerRelationshipManger(HealthInsuranceSuveyor healthInsuranceSuveyor, EmailNotifier emailNotifier){
        this.healthInsuranceSuveyor = healthInsuranceSuveyor;
        this.emailNotifier = emailNotifier;
    }
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
