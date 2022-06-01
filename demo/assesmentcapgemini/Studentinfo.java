package demo.assesmentcapgemini;

class student1 {

    private String firstname;
    private String lastname, mainsubject;
    private int classyear;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setMainsubject(String mainsubject) {
        this.mainsubject = mainsubject;
    }

    public String getMainsubject() {
        return mainsubject;
    }

    public void setClassyear(int classyear) {
        this.classyear = classyear;
    }

    public int getClassyear() {
        return classyear;
    }

    public void display() {
        System.out.println("First name is " + firstname);
        System.out.println("Last name is " + lastname);
        System.out.println("main subject  is " + mainsubject);
        System.out.println("class year   is " + classyear);
    }
}

class student2 {

    private String firstname;
    private String lastname, mainsubject;
    private int classyear;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setMainsubject(String mainsubject) {
        this.mainsubject = mainsubject;
    }

    public String getMainsubject() {
        return mainsubject;
    }

    public void setClassyear(int classyear) {
        this.classyear = classyear;
    }

    public int getClassyear() {
        return classyear;
    }

    public void display() {
        System.out.println("First name is " + firstname);
        System.out.println("Last name is " + lastname);
        System.out.println("main subject  is " + mainsubject);
        System.out.println("class year   is " + classyear);
    }
}

public class Studentinfo {

    public static void main(String[] args) {
        student1 s1 = new student1();
        System.out.println("info of student no.1 is ");
        s1.setFirstname(" gajanan ");
        s1.setLastname(" deshmukh ");
        s1.setMainsubject("math");
        s1.setClassyear(22);
        s1.display();
        System.out.println("info of student no.2 is ");
        student2 s2 = new student2();
        s2.setFirstname(" prashant ");
        s2.setLastname(" sable ");
        s2.setMainsubject(" eng ");
        s2.setClassyear(21);
        s2.display();
    }
}
