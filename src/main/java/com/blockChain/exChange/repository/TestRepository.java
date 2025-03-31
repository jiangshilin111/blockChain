package com.blockChain.exChange.repository;

import com.blockChain.exChange.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestRepository extends JpaRepository<Test, Integer>,JpaSpecificationExecutor<Test>{
}
