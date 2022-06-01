class Employee {
    float salary;
    
    Employee (float salary){
        this.salary=salary;
    }

    void Display() {
        System.out.println( " The salary of employee without bonus is " +salary);
        }
}
class Bonus extends Employee {
    float bonus;
    
    Bonus (float salary, float bonus){
        super(salary);
        this.bonus=bonus;
    }
    void Add(){
            salary += bonus;
    }
    void display(){
        System.out.println(" the salary of employee with bonus is " +salary);
    }
}
public class Singleinheritanceprogram {
    public static void main(String[] args) {
       
        Bonus b=new Bonus(55555.5f, 55.55f);
        b.Add();
        b.display();
    }
}
