package righthandrentals.righthandrentals;

public class Manager {

    //columns in the Manager table
    private int manager_id;
    private String manager_firstname;
    private String manager_lastname;

    //constructor
    public Manager () {};

    //constructor w/ args
    public Manager(int manager_id, String manager_firstname, String manager_lastname){
        this.manager_id = manager_id;
        this.manager_firstname = manager_firstname;
        this.manager_lastname = manager_lastname;
    }

    //setters and getters
    public void setId(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getId() {
        return manager_id;
    }

    public void setFirstname(String manager_firstname) {
        this.manager_firstname = manager_firstname;
    }

    public String getFirstname() {
        return manager_firstname;
    }

    public void setLastname(String manager_lastname) {
        this.manager_lastname = manager_lastname;
    }

    public String getLastname() {
        return manager_lastname;
    }

    @Override
    public String toString(){
        return manager_id + " " + manager_firstname + " " + manager_lastname;
    }


}
