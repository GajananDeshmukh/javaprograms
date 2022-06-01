package jdbcsqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCSQLDEMO {

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
            stmt = con.createStatement();
            String sql = "INSERT INTO STUDENT_INFO (NAME,MOBILENO,ADDRESS,PERCENTAGE)"
                    + "VALUES('GAJU',7888236288,'PUNE',79.88)";
            //query executions
            stmt.executeUpdate(sql);

            sql = "INSERT INTO STUDENT_INFO (NAME,MOBILENO,ADDRESS,PERCENTAGE)"
                    + "VALUES('jojo',8208785658,'a.bad',75.00)";
            //query executions
            stmt.executeUpdate(sql);
            stmt.close();
            con.commit();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName());
            System.exit(0);
        }
        System.out.println("VALUES INSERTED succesfully");
    }

}
