package com.example.dao;

import com.example.models.AddPolicyRequest;
import com.example.models.ApplyPolicyRequest;
import com.example.models.ProvideInfoRequest;
import com.example.models.RegisterCompanyRequest;
import com.example.models.UserInfoRequest;
import com.example.entities.Policy;

public interface InsuranceDao {

    // User Dashboard Operations
    String applyPolicy(ApplyPolicyRequest request);
    String provideInfo(UserInfoRequest request);

    // Admin Dashboard Operations
    String registerCompany(RegisterCompanyRequest request);
    String addPolicy(AddPolicyRequest request);

    // Owner Dashboard Operations
    String provideInfoToBuyers(ProvideInfoRequest request);
    String provideInfoToCompanies(ProvideInfoRequest request);
}
