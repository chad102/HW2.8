package org.employeeBook.Second;

import org.employeeBook.Employee;
import org.employeeBook.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/departments")
public class EmployeeController2 {
    private final EmployeeServiceImpl employeeServiceImpl;
    public EmployeeController2(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    }
}
