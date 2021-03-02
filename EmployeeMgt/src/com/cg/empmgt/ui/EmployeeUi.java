package com.cg.empmgt.ui;
import com.cg.empmgt.entities.Employee;
import com.cg.empmgt.exceptions.*;
import com.cg.empmgt.service.*;
import java.util.Collection;
import java.util.List;

public class EmployeeUi {
	private IEmployeeService service = new EmployeeServiceImp();

    public static void main(String[] args) {
        EmployeeUi app = new EmployeeUi();
        app.start();
    }

    public void start() {
    	try {
        Employee mounika = service.addEmployee("mounika", "CSE");
        display(mounika);
        Employee ram=service.addEmployee("ram","ECE");
        display(ram);

        Employee madhuri=service.addEmployee("madhuri","Mech");
        display(madhuri);

        Employee fetchedStudent=service.findById(mounika.getId());
        System.out.println("displaying fetched student for id="+mounika.getId());
        display(fetchedStudent);

        System.out.println("displaying all students");
        List<Employee>list= service.findAll();
        displayAll(list);
    	
    }catch(InvalidIdException e){
        System.out.println(e.getMessage());
        
    }
    catch(InvalidDeptException e){
        System.out.println(e.getMessage());
       
    }
    catch(InvalidNameException e){
       System.out.println(e.getMessage());
         e.printStackTrace();
    }
    catch(Exception e){
        System.out.println("something went wrong");
        
    }
    }
    public void displayAll(Collection<Employee> employees){
        for(Employee employee:employees){
            display(employee);
        }
    }

    public void display(Employee employee){
        System.out.println(employee.getId()+"-"+employee.getName()+"-"+"-"+ employee.getDepartment());
    }
}

