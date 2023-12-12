package org.employeeBook.Second;

import org.employeeBook.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService2Impl {
    private final List<Employee> employees = new ArrayList<>();
    public Optional<Employee> getMaxSalaryInDep (int departmentId) {
        return employees.stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .max(Comparator.comparingInt(Employee::getSalary));
    }

    public Optional<Employee> getMinSalaryInDep (int departmentId) {
        return employees.stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary));
    }

    public List<Employee> printEmployeesInDep (int departmentId) {    /// ready?
        return employees.stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    List<Employee> printEmployeesAllDep() {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getDepartmentId))
                .collect(Collectors.toList());
    }

}
