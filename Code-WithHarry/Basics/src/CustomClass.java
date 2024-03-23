class Employee{
    private String name;
    private int ID;

    public Employee(int id, String Name){
        ID = id;
        name = Name;
    }
//    public void SetData(int id, String Name){
//        this.name = Name;
//        this.ID = id;
//    }
    public void GetData(){
        System.out.println("Name of employee: " + name);
        System.out.println("ID of employee: " + ID);
    }
}


public class CustomClass {
    public static void main(String[] args) {
        Employee emp = new Employee(12, "Bhargava");
        //emp.SetData(12, "Harishchandra");
        emp.GetData();
    }
}
