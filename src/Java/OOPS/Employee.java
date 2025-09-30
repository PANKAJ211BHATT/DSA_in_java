package Java.OOPS;

public class Employee {
    private String Name;
    private double Salary;
    private int ID;

    public Employee(String name , double Salary ,int ID){
        setName(name);
        setSalary(Salary);
        this.ID  = ID;
    }

    public String getName(){
        return Name;
    }

    public Double getSalary(){
        return Salary;
    }

    private void setName(String name){
        if(name != null && !name.trim().isEmpty() ){
            this.Name = name;
        }
    }


    private void setSalary(double salary){
        if(salary>0){
            this.Salary = salary;
        }
    }

    public static void main(String[] args) {
        Employee em = new Employee("pankaj bhatt", 2010.012,21);
        System.out.println( em.getName() +          " " +em.ID);


    }

}
