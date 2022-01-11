public class User extends JDBC {

    private String user_Name;
    private int user_password;

    //Getters.
    protected String getUser_Name() { return user_Name; }
    protected int getUser_password() {return user_password; }
    //Setters.
    protected void setUser_Name(String user_Name) { this.user_Name = user_Name; }
    protected void setUser_password(int user_password) {this.user_password = user_password; }

    //Empty Contstructor for the Users.
    public User(String name, int password) {
        setUser_Name(name);
        setUser_password(password);
    }
    

}
