package com.texonic.empsystm.service;

import com.texonic.empsystm.entity.SaEmployee;

import java.util.List;
import java.util.Optional;

public interface SaEmpployeeService {

    static SaEmployee existingSaEmployee(SaEmployee saEmployee, int id) {
        return saEmployee;
    }

    List<SaEmployee> getAllSaEmployees();

    SaEmployee getSaEmployeeById(int id);

    SaEmployee saveEmployee(SaEmployee employee);

    void deleteEmployee(long id);
}
