 class Employee{
    private String name;
    private int Id;

    Employee(String name, int id){
        this.name = name;
        this.Id = id; 
    }

    public int getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("hari",23);
        Employee emp2 = new Employee("baban",34);
        Employee emp3 = new Employee("chagan",23);

        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());

        System.out.println(emp3.getId());
        System.out.println(emp3.getName());  
    }
}
