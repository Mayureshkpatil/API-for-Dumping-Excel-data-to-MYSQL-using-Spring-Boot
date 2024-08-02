package com.api.controller;

import com.api.entity.Employee;
import com.api.helper.Helper;
import com.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            this.employeeService.save(file);
            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to DB"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload an Excel file");
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable String id) {
        Optional<Employee> employee = this.employeeService.getEmployeeById(id);
        return employee.isPresent() ? ResponseEntity.ok(employee.get()) : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable String id, @RequestBody Employee employeeDetails) {
        Optional<Employee> employee = this.employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            Employee emp = employee.get();
            emp.setName(employeeDetails.getName());
            // Set other fields as needed
            Employee updatedEmployee = this.employeeService.updateEmployee(emp);
            return ResponseEntity.ok(updatedEmployee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable String id) {
        Optional<Employee> employee = this.employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            this.employeeService.deleteEmployee(id);
            return ResponseEntity.ok("Employee deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
    }
}
