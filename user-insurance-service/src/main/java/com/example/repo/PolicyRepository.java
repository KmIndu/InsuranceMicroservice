package com.example.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Policy;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, Long> {
}

