package demo.assesmentcapgemini;

import java.util.*;

public class Personalinfo {

    public static void main(String[] args) {
        String firstname, lastname, middlename;
        Scanner sc = new Scanner(System.in);
        System.out.println(" first name is ");
        firstname = sc.next();
        System.out.println(" middle name is ");
        middlename = sc.next();
        System.out.println(" last name is ");
        lastname = sc.next();
        System.out.println(" Recommended output is");
        System.out.println(firstname.toUpperCase() + " " + middlename.toUpperCase() + " " + lastname.toUpperCase());
    }
}
