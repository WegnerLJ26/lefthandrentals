package righthandrentals.righthandrentals;

public class Tenant {

    private int tenant_id;
    private String tenant_firstname;
    private String tenant_lastname;
    private String tenant_email;
    private String tenant_phone;
    private int tenant_unit_id;

    public Tenant() {};

    public Tenant(int tenant_id, String tenant_firstname, String tenant_lastname, String tenant_email, String tenant_phone, int tenant_unit_id) {
        this.tenant_id = tenant_id;
        this.tenant_firstname = tenant_firstname;
        this.tenant_lastname = tenant_lastname;
        this.tenant_email = tenant_email;
        this.tenant_phone = tenant_phone;
        this.tenant_unit_id = tenant_unit_id;
    }

    public void setId(int tenant_id){
        this.tenant_id = tenant_id;
    }

    public int getId() {
        return tenant_id;
    }

    public void setTenantFirstname(String tenant_firstname) {
        this.tenant_firstname = tenant_firstname;
    }

    public String getTenantsFirstname() {
        return tenant_firstname;
    }

    public void setTenantsLastname(String tenant_lastname) {
        this.tenant_lastname = tenant_lastname;
    }

    public String getTenantsLastname() {
        return tenant_lastname;
    }

    public void setEmail(String tenant_email) {
        this.tenant_email = tenant_email;
    }

    public String getEmail() {
        return tenant_email;
    }

    public void setPhone(String tenant_phone) {
        this.tenant_phone = tenant_phone;
    }

    public String getPhone() {
        return tenant_phone;
    }

    public void setTenantUnitId(int tenant_unit_id) {
        this.tenant_unit_id = tenant_unit_id;
    }

    public int getTenantUnitId() {
        return tenant_unit_id;
    }
}
