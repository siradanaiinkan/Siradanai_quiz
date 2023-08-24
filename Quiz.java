class Employee {
    public String id; 
    public String name; 
    public int Experience;
    public double Base_Salary;

    public Employee(String id,String name,int Experience,double Base_Salary) {
        this.id = id; 
        this.name = name; 
        this.Experience = Experience; 
        this.Base_Salary = Base_Salary;
        
    }
    public String getID(){
        return id;
    }
    public void setID(String newID){
        id = newID;
    }
    public String getName() {
        return name; 
    }
    public void setName(String newName) {
        name = newName;
    }
    public int Experience(){
        return Experience; 
    }    
    public void setExperience(int newExperience) {
        Experience = newExperience;
    }
    public double getBase_Salary(){
        return Base_Salary;
    }
    public void setBase_Salary(double newBase_Salary) {
        Base_Salary = newBase_Salary;
    }
    public void showDetails(){
        System.out.println("ID:"+this.id); 
        System.out.println("Name:"+this.name);
        System.out.println("Experience:"+this.Experience+"years"); 
        System.out.println("Base Salary:"+this.Base_Salary+"Bath");     
    } 
    public double getSalary(){
        return Base_Salary+ (Experience / 100);
    } 
}
    class Manager extends Employee{
        public Manager(String id,String name,int Experience,double Base_Salary) { 
        super(id, name, Experience, Base_Salary);
        
        }
    }
public class Quiz {
    public static void main(String[] args){
        Employee BOOK = new Employee("A21", "Siradanai inkan", 3, 50000);
        Manager Ajan = new Manager("M01", "Ajan deaw", 8, 60000);

        System.out.println("ข้อมูลลูกค้า:");
        BOOK.showDetails();
        System.out.println("Salary: " + BOOK.getSalary());
        System.out.println();

        System.out.println("ข้อมูลผู้จัดการ:");
        Ajan.showDetails();
        System.out.println("Salary: " + Ajan.getSalary());
    } 
}