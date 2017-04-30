package righthandrentals.righthandrentals;

public class Unit {

    private int unit_id;
    private int unit_rooms;
    private int unit_baths;
    private int unit_max_occupants;
    private String unit_pets;
    private int unit_price_monthly;
    private int unit_property_id;

    public Unit() {};

    public Unit(int unit_id, int unit_rooms, int unit_baths, int unit_max_occupants, String unit_pets, int unit_price_monthly, int unit_property_id){
        this.unit_id = unit_id;
        this.unit_rooms = unit_rooms;
        this.unit_baths = unit_baths;
        this.unit_max_occupants = unit_max_occupants;
        this.unit_pets = unit_pets;
        this.unit_price_monthly = unit_price_monthly;
        this.unit_property_id = unit_property_id;
    }

    public void setId(int unit_id) {
        this.unit_id = unit_id;
    }

    public int getId() {
        return unit_id;
    }

    public void setRooms(int unit_rooms) {
        this.unit_rooms = unit_rooms;
    }

    public int getRooms() {
        return unit_rooms;
    }

    public void setBaths(int unit_baths) {
        this.unit_baths = unit_baths;
    }

    public int getBaths() {
        return unit_baths;
    }

    public void setMaxOccupants(int unit_max_occupants) {
        this.unit_max_occupants = unit_max_occupants;
    }

    public int getMaxOccupants() {
        return unit_max_occupants;
    }

    public void setPets(String unit_pets) {
        this.unit_pets = unit_pets;
    }

    public String getPets() {
        return unit_pets;
    }

    public void setUnitPriceMonthly(int unit_price_monthly) {
        this.unit_price_monthly = unit_price_monthly;
    }

    public int getUnitPriceMonthly() {
        return unit_price_monthly;
    }

    public void setUnitPropertyId(int unit_property_id) {
        this.unit_property_id = this.unit_property_id;
    }

    public int getUnitPropertyId() {
        return unit_property_id;
    }
}
