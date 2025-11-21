package com.employee.portal.Services;

import com.employee.portal.EmployeeDto.AddressDto;
import com.employee.portal.EmployeeDto.CompaniesDto;
import com.employee.portal.EmployeeDto.EmployeeDto;
import com.employee.portal.EmployeeDto.TaskDto;
import com.employee.portal.Entities.Companies;
import com.employee.portal.Entities.Employee;
import com.employee.portal.Entities.Task;
import com.employee.portal.Pojo.EmployeePojo;
import com.employee.portal.Repositories.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class Services {
    private static Logger logger = LoggerFactory.getLogger(Services.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    public EmployeeDto addNewEmployee(EmployeePojo employeePojo){
        Employee employee = new Employee(employeePojo.getName(), employeePojo.getDop(), employeePojo.getMobile(),
                                employeePojo.getAddress(), employeePojo.getTask(), employeePojo.getCompanies());

        for(Task task : employeePojo.getTask()){
            task.setEmployee(employee);
        }

        Set<Companies> company = employeePojo.getCompanies();
        for(Companies companies: company){
            companies.getEmployee().add(employee);
        }
        logger.info("Saved the employee info");

        return toEmployeeDto(employeeRepo.save(employee));

    }
    public EmployeeDto toEmployeeDto(Employee employee){
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setDop(employee.getDop());
        dto.setAddress(employee.getAddress());

        if(employee.getTask()!= null){
          dto.setTask(employee.getTask().stream()
                  .map(e-> new TaskDto(e.getTaskName(),e.getTaskDesc()))
                  .toList());
        }

        if(employee.getCompanies() != null){
            dto.setCompanies(employee.getCompanies().stream()
                    .map(t -> new CompaniesDto(t.getCompanyName(),t.getAddress(),t.getContact()))
                    .collect(Collectors.toSet()));
        }
       return dto;
    }

    public EmployeeDto getEmployeeInfo(Long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if(employee.isPresent()){
            Employee employee1 = employee.get();
            return toEmployeeDto(employee1);
        }
        return null;

    }

    public String removeEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "successfully deleted";
    }

    public EmployeeDto updateEmployee(int Id,EmployeePojo employeePojo) {
        Employee employee = new Employee(Id, employeePojo.getName(), employeePojo.getDop(), employeePojo.getMobile(),
                employeePojo.getAddress(), employeePojo.getTask(), employeePojo.getCompanies());

        for(Task task : employeePojo.getTask()){
            task.setEmployee(employee);
        }

        Set<Companies> company = employeePojo.getCompanies();
        for(Companies companies: company){
            companies.getEmployee().add(employee);
        }
        logger.info("updated info");
        return toEmployeeDto(employeeRepo.save(employee));
    }
}
