package com.texonic.empsystm.repository;

import com.texonic.empsystm.entity.SaEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SaEmployeeRepository extends JpaRepository<SaEmployee, Integer> {

}
