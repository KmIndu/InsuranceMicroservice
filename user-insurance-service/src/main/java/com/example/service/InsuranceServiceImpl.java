package com.example.service;

import com.example.dao.InsuranceDao;
import com.example.entities.Policy;
import com.example.models.AddPolicyRequest;
import com.example.models.ApplyPolicyRequest;
import com.example.models.ProvideInfoRequest;
import com.example.models.RegisterCompanyRequest;
import com.example.models.UserInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    private InsuranceDao insuranceDao;

    // User Operations

    @Override
    public String applyPolicy(ApplyPolicyRequest request) {
        return insuranceDao.applyPolicy(request);
    }

    @Override
    public String provideInfo(UserInfoRequest request) {
        return insuranceDao.provideInfo(request);
    }

    // Admin Operations

    @Override
    public String registerCompany(RegisterCompanyRequest request) {
        return insuranceDao.registerCompany(request);
    }

    @Override
    public String addPolicy(AddPolicyRequest request) {
        return insuranceDao.addPolicy(request);
    }

    // Owner Operations

    @Override
    public String provideInfoToBuyers(ProvideInfoRequest request) {
        return insuranceDao.provideInfoToBuyers(request);
    }

    @Override
    public String provideInfoToCompanies(ProvideInfoRequest request) {
        return insuranceDao.provideInfoToCompanies(request);
    }
}
