package com.texonic.empsystm.service.impl;

import com.texonic.empsystm.entity.SaEmployee;
import com.texonic.empsystm.repository.SaEmployeeRepository;
import com.texonic.empsystm.service.SaEmpployeeService;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaEmployeeServiceImpl implements SaEmpployeeService {

    private SaEmployeeRepository saEmployeeRepository;

    public SaEmployeeServiceImpl(SaEmployeeRepository saEmployeeRepository) {
        super();
        this.saEmployeeRepository = saEmployeeRepository;
    }
    @Override
    public List<SaEmployee> getAllSaEmployees() {
        return saEmployeeRepository.findAll();
    }

    @Override
    public SaEmployee saveEmployee(SaEmployee employee) {
        return saEmployeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {

    }


    @Override
    public SaEmployee getSaEmployeeById(int id) {

        return SaEmployeeRepository.findById(id);
    }

    public <Saemployee> Saemployee existingSaEmployee(SaEmployee Saemployee, long id) {

        // we need to check whether employee with given id is exist in DB or not
        Saemployee existingEmployee = (Saemployee) SaEmployeeRepository.findById((int) id);
        return existingEmployee;
    }

    public void deleteSaEmployee(long id) {

        // check whether a employee exist in a DB or not
        SaEmployeeRepository.findById((int) id);
        saEmployeeRepository.deleteById((int) id);
    }

}
