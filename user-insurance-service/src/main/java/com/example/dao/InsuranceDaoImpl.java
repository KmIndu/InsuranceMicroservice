package com.example.dao;

import com.example.models.AddPolicyRequest;
import com.example.models.ApplyPolicyRequest;
import com.example.models.ProvideInfoRequest;
import com.example.models.RegisterCompanyRequest;
import com.example.models.UserInfoRequest;
import com.example.repo.PolicyRepository;
import com.example.entities.Policy;

import org.springframework.stereotype.Repository;

@Repository
public class InsuranceDaoImpl implements InsuranceDao {

    // User Operations

    @Override
    public String applyPolicy(ApplyPolicyRequest request) {
        return "Policy applied for user ";
    }

    @Override
    public String provideInfo(UserInfoRequest request) {
        return "Information provided for user ";
    }

    // Admin Operations

    @Override
    public String registerCompany(RegisterCompanyRequest request) {
        return "Company registered: ";
    }

    @Override
    public String addPolicy(AddPolicyRequest request) {
        return "Policy added: ";
    }

    // Owner Operations

    @Override
    public String provideInfoToBuyers(ProvideInfoRequest request) {
        return "Information provided to buyers for policy ";
    }

    @Override
    public String provideInfoToCompanies(ProvideInfoRequest request) {
        return "Information provided to companies for policy ";
    }
}
