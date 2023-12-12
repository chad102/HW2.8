package org.employeeBook.Second;

import org.employeeBook.Employee;
import org.employeeBook.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class EmployeeController2 {
    private final EmployeeService2Impl employeeService2Impl;
    public EmployeeController2(EmployeeService2Impl employeeService2Impl) {
        this.employeeService2Impl = employeeService2Impl;
    }
@GetMapping(path = "/max-salary")
    public Optional<Employee> getMaxSalaryInDep(@RequestParam("departmentId") int departmentId) {
        return employeeService2Impl.getMaxSalaryInDep(departmentId);
    }
@GetMapping(path = "/min-salary")
    public Optional<Employee> getMinSalaryInDep(@RequestParam("departmentId") int departmentId) {
        return employeeService2Impl.getMinSalaryInDep(departmentId);
    }
@GetMapping(path = "/all")
    public List<Employee> printAllDep(@RequestParam("departmentId") int departmentId) {
        return employeeService2Impl.printEmployeesInDep(departmentId);
}
@GetMapping(path = "/all")
    public List<Employee> printEmployeesAllDep(@RequestParam(defaultValue = "departmentId") int departmentId) {
        return employeeService2Impl.printEmployeesAllDep();
}
}
