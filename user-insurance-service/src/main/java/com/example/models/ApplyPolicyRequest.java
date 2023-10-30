package com.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplyPolicyRequest {

    private Long policyId;
    private String userId;
    private int age;
    private String city;
    private String medicalHistory;
    private boolean tobaccoUser;
    private boolean alcoholConsumer;
}
