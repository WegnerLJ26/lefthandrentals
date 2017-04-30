package righthandrentals.righthandrentals;

public class Property {

    private int property_id;
    private String property_address;
    private int property_company_id;
    private int property_manager_id;
    private int property_num_unit;
    private int property_num_empty_units;
    private String property_state;
    private int property_zipcode;
    private String property_city;

    public Property() {};

    public Property(int property_id, String property_address, int property_company_id, int property_manager_id, int property_num_unit, int property_num_empty_units, String property_state, int property_zipcode, String property_city) {
        this.property_id = property_id;
        this.property_address = property_address;
        this.property_company_id = property_company_id;
        this.property_manager_id = property_manager_id;
        this.property_num_unit = property_num_unit;
        this.property_num_empty_units = property_num_empty_units;
        this.property_state = property_state;
        this.property_zipcode = property_zipcode;
        this.property_city = property_city;
    }

    public void setId(int property_id) {
        this.property_id = property_id;
    }

    public int getId() {
        return property_id;
    }

    public void setAddress(String property_address) {
        this.property_address = property_address;
    }

    public String getAddress() {
        return property_address;
    }

    public void setCId(int property_company_id) {
        this.property_company_id = property_company_id;
    }

    public int getCId() {
        return property_company_id;
    }

    public void setMId(int property_manager_id) {
        this.property_manager_id = property_manager_id;
    }

    public int getMId() {
        return property_manager_id;
    }

    public void setNumUnit(int property_num_unit) {
        this.property_num_unit = property_num_unit;
    }

    public int getNumUnit() {
        return property_num_unit;
    }

    public void setNumEmptyUnit(int property_num_empty_units) {
        this.property_num_empty_units = property_num_empty_units;
    }

    public int getNumEmptyUnit() {
        return property_num_empty_units;
    }

    public void setState(String property_state) {
        this.property_state = property_state;
    }

    public String getState() {
        return property_state;
    }

    public void setZipcode(int property_zipcode) {
        this.property_zipcode = property_zipcode;
    }

    public int getZipcode() {
        return property_zipcode;
    }

    public void setCity(String property_city) {
        this.property_city = property_city;
    }

    public String getCity() {
        return property_city;
    }

}
