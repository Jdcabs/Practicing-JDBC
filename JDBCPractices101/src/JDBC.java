import java.sql.*;

public class JDBC {
    Connection connect;
    Statement statement;
    ResultSet resultSet;
    
    public JDBC(){
        try{

        //Step 1.
        //Creating a Connection to the Database.
        final String jdbcUrl = "jdbc:sqlserver://DESKTOP-EJ6KFMO\\MSSQLSERVER:1433;databaseName=JDBCPRACTICES";
        final String username = "Johndavid";
        final String password = "Johndavid015";
        
        connect = DriverManager.getConnection(jdbcUrl, username, password);
        System.out.println("\t\nConnected to : " + jdbcUrl);
            
        }catch(Exception e){
            System.out.println("Something went wrong !" + e.getMessage());
        }
    }


    //M
    public void SelectAll(){
    try{    
    //Step 2.
    //Execute a Query.
    statement = connect.createStatement();
    String select_All = "SELECT * FROM TBL_USER";
    //Step 3.
    //Printing the data inside the table.
    resultSet = statement.executeQuery("SELECT * FROM TBL_USER");
    System.out.println("Executed Query: " + select_All);
    while(resultSet.next()){
            System.out.print(resultSet.getString("user_ID").trim());
            System.out.print(", ");
            System.out.print(resultSet.getString("user_Name").trim());
            System.out.print(", ");
            System.out.print(resultSet.getString("user_Password").trim());
            System.out.println(" ");
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }       
    }
            //Bonus.
            //Inserting data to the Table.
            ///statement.executeUpdate("INSERT INTO TBL_USER values" +
            //"( 0002,'Rafael', 321)" );
}
