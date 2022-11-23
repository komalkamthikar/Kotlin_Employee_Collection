package com.axis.utility

import com.axis.modal.Employee

class EmployeeUtil {

    var Employeeinfo = mutableListOf<Employee>()

    init {

        Employeeinfo.add(Employee(101, "shiva", "IT", 56000))
        Employeeinfo.add(Employee(102, "riya", "Accounts", 45000))
        Employeeinfo.add(Employee(103, "Kushi", "HR", 40000))
        Employeeinfo.add(Employee(104, "sai", "Manager", 42000))
        Employeeinfo.add(Employee(105, "priyanka", "Accounts", 52000))


    }

    fun data(): MutableList<Employee> {
        return Employeeinfo
    }
}