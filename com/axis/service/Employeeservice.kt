package com.axis.service

import com.axis.modal.Employee
import com.axis.utility.EmployeeUtil
class Employeeservice{

    var emploessUtil= EmployeeUtil()

        fun viewAllEmployees(){
            var employees=emploessUtil.data()

            for(employee in employees){
                println("${employee.id} | ${employee.name} | ${employee.salary} | ${employee.department}" )

            }

        }

        fun addNewEmployee(employee: Employee):String{

            emploessUtil.data().add(employee)
            return "Successfullly Added!!"
        }

}

