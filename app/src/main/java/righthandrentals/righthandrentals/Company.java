package righthandrentals.righthandrentals;

public class Company {

    private int company_id;
    private String company_name;
    private String company_address;
    private String company_state;
    private String company_city;
    private int company_zipcode;

    public Company() {};

    public Company(int company_id, String company_name, String company_address, String company_state, String company_city, int company_zipcode) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_address = company_address;
        this.company_state = company_state;
        this.company_city = company_city;
        this.company_zipcode = company_zipcode;
    }

   public void setId(int company_id) {
       this.company_id = company_id;
   }

   public int getId() {
       return company_id;
   }

   public void setName(String company_name) {
       this.company_name = company_name;
   }

   public String getName() {
       return company_name;
   }

   public void setAddress(String company_address) {
       this.company_address = company_address;
   }

   public String getAddress() {
       return company_address;
   }

   public void setState(String company_state) {
       this.company_state = company_state;
   }

   public String getState() {
       return company_state;
   }

   public void setCity(String company_city) {
       this.company_city = company_city;
   }

   public String getCity() {
       return company_city;
   }

   public void setZipcode(int company_zipcode) {
       this.company_zipcode = company_zipcode;
   }

   public int getZipcode() {
       return company_zipcode;
   }

}
