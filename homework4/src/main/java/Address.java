import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zipcode")
    private int zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipcode;
    }

    public void setZipCode(int zipCode) {
        this.zipcode = zipCode;
    }
    @Override
    public String toString(){
        return getStreet() + ", "+getCity()+", "+getZipCode();
    }
}
