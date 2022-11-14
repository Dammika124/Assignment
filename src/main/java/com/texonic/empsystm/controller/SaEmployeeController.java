package com.texonic.empsystm.controller;

import com.texonic.empsystm.entity.SaEmployee;
import com.texonic.empsystm.service.SaEmpployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/viewEmployees")
public class SaEmployeeController {

    private SaEmpployeeService saEmpployeeService;

    public SaEmployeeController(SaEmpployeeService saEmpployeeService) {
        super();
        this.saEmpployeeService = saEmpployeeService;
    }

    //Get All Employee REST Api
    @GetMapping
    public List<SaEmployee> getAllSaEmployees(){
        return saEmpployeeService.getAllSaEmployees();
    }

    // build create employee REST API
    @PostMapping()
    public ResponseEntity<SaEmployee> saveEmployee(@RequestBody SaEmployee employee){
        return new ResponseEntity<SaEmployee>(saEmpployeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //Get Employee by Id
    @PostMapping("{id}")
    public ResponseEntity<SaEmployee> getEmployeeById(@PathVariable("id") int id){
        return new ResponseEntity<SaEmployee>(saEmpployeeService.getSaEmployeeById(id), HttpStatus.OK);
    }

    //check employee is exist
    @PostMapping("{id}")
    public ResponseEntity<SaEmployee> updateEmployee(@PathVariable("id") long id
            ,@RequestBody SaEmployee saEmployee){
        return new ResponseEntity<SaEmployee>(SaEmpployeeService.existingSaEmployee(saEmployee, (int) id), HttpStatus.OK);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){

        // delete employee from DB
        saEmpployeeService.deleteEmployee(id);

        return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
    }


}
