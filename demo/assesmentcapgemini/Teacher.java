
package demo.assesmentcapgemini;

import java.time.chrono.ThaiBuddhistDate;

public class Teacher extends Person{
    double salary;
int stryear;
int yrexp;
public Teacher(double salary,int stryear, int yrexp, String firstname,String lastname)
{ 
    super(firstname, lastname);
    this.salary=salary;
    this.stryear=stryear;
    this.yrexp=yrexp;

}
public double getsalary(){
    return salary=salary;
}
public int  stryear(){
    return stryear=stryear;
}
public int yrexp(){
    return yrexp=yrexp;
}
}