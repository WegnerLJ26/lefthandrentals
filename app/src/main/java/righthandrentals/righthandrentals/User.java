package righthandrentals.righthandrentals;

public class User {

    private int user_id;
    private String user_name;
    private String user_password;
    private int user_account_type;

    public User() {};

    public User(int user_id, String user_name, String user_password, int user_account_type) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_account_type = user_account_type;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserPassword(String user_password) {
        this.user_password = user_password;
    }

    public String getUserPassword() {
        return user_password;
    }

    public void setUserAccountType(int user_account_type) {
        this.user_account_type = user_account_type;
    }

    public int getUserAccountType() {
        return user_account_type;
    }

}
