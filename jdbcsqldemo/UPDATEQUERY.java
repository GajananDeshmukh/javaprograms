package jdbcsqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class UPDATEQUERY {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee_data", "postgres", "2603");
            con.setAutoCommit(false);
            System.out.println("detabase connection is open ");
            //create statement
            /* stmt=con.createStatement();
       CREATE TABLE table     String sql="CREATE TABLE STUDENT_INFO" + "(ROLL_NO SERIAL NOT NULL PRIMARY KEY," + 
                    "NAME TEXT NOT NULL," + "MOBILENO BIGINT NOT NULL," + 
                    "ADDRESS VARCHAR(50) NOT NULL," + 
                    "PERCENTAGE REAL NOT NULL)";*/
            //INSERT QUERY
            /* stmt = con.createStatement();
            String sql = "INSERT INTO STUDENT_INFO (NAME,MOBILENO,ADDRESS,PERCENTAGE)"
                    + "VALUES('GAJU',7888236288,'PUNE',79.88)";
            //query executions
            stmt.executeUpdate(sql);

            sql = "INSERT INTO STUDENT_INFO (NAME,MOBILENO,ADDRESS,PERCENTAGE)"
                    + "VALUES('jojo',8208785658,'a.bad',75.00)";
            //query executions
            stmt.executeUpdate(sql);*/
            
            //UPDATE QUERY
            stmt=con.createStatement();
                String sql="UPDATE STUDENT_INFO SET NAME='PARSHYA', MOBILENO=8208556569 WHERE ROLL_NO=1; ";
                stmt.executeUpdate(sql);
                con.commit();
            //select statment 
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT_INFO;");
            //for store in java
            while (rs.next()) {
                int roll_no = rs.getInt("ROLL_NO");//BECAUSE I WANT CALL ATTRIBUTE OF TABLE
                String name = rs.getString("NAME");
                String mobileno = rs.getString("mobileno");
                String address = rs.getString("address");
                double percentage = rs.getDouble("PERCENTAGE");
                //DISPLAY THE RESULT
                System.out.println("ROLL_NO = " + roll_no);
                System.out.println("NAME = " + name);
                System.out.println("MOBILE NO = " + mobileno);
                System.out.println("ADDRESS= " + address);
                System.out.println("PERCENTAGE = " + percentage);

                System.out.println("");
                
            }
            rs.close();
            stmt.close();
            con.commit();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName());
            System.exit(0);
        }
      // System.out.println("VALUES INSERTED succesfully");
    }

}
