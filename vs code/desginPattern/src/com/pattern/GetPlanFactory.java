package com.pattern;

public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DP")) {
            return new DomesticPlan();
        }
        if (planType.equalsIgnoreCase("CP")) {
            return new CommercialPlan();
        }
        if (planType.equalsIgnoreCase("IP")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
