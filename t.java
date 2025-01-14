import java.util.*;
class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name=name;
    }
    int work(){
        if(id == 1){
            return id;
        }
        else if(id == 2){
            return id;
        }
        else if(id == 3){
            return id;
        }
        else{
        return id;
        }
        
    }
    void getSalary(){
        if(id==1){
            System.out.println(name+ ", you have been paid 1000000Rs.");
        }
        else if(id==2){
            System.out.println(name+ ", you have been paid 100000Rs.");
        }
        else if(id==3){
            System.out.println(name+ ", you have been paid 10000Rs.");
        }
    }
}
class HRManger extends Employee{
    HRManger(int id, String name) {
        super(id, name);
        
    }
    int id;
    String name;
    @Override
    int work(){
        if(id == 1){
            return id+5;
        }
        else if(id == 2){
            return id+5;
        }
        else if(id == 3){
            return id+5;
        }
        else{
        return id+5;
        }
        
    }
    void getEmployee(){
        if(id==1){
            System.out.println(name+ ", was addes as a manager");
        }
        else if(id==2){
            System.out.println(name+ ", was added as a tech head");
        }
        else if(id==3){
            System.out.println(name+ ", was added as a manager");
        }
    }
}

public class t {
    
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            String name =s.nextLine();
            int id = s.nextInt();

            Employee b = new Employee(id,name);
            HRManger c = new HRManger(id,name);
            
   System.out.println(b.work());
            b.getSalary();
            System.out.println(c.work());
            c.getEmployee();
        }
    }
}
