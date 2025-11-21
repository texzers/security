package com.employee.portal.Controller;

import com.employee.portal.Pojo.EmployeePojo;
import com.employee.portal.Services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private Services services;

    @PostMapping("/newEmployee")
    public ResponseEntity<?> newEmployee(@RequestBody EmployeePojo employeePojo){
        return ResponseEntity.ok(services.addNewEmployee(employeePojo));
    }

    @GetMapping("/getEmployeeInfo/{id}")
    public ResponseEntity<?> getEmployeeInfo(@PathVariable Long id){
        return ResponseEntity.ok(services.getEmployeeInfo(id));
    }

    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<?> deleteEmployee(@RequestParam("id") Long id){
        return ResponseEntity.ok(services.removeEmployee(id));
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<?> updateEmployee(@RequestParam("id") int Id, @RequestBody EmployeePojo employeePojo){
        return ResponseEntity.ok(services.updateEmployee(Id, employeePojo));
    }

}
