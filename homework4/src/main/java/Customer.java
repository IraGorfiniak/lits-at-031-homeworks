import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Map;

public class Customer {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("phoneNumbers")
    private String[] phoneNumbers;
    @JsonIgnoreProperties("personalInformation")
    private Map<String, String> personalInformation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Map<String, String> getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(Map<String, String> personalInformation) {
        this.personalInformation = personalInformation;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- Employee Information-----\n");
        sb.append("ID: " + getId() + "\n");
        sb.append("Name: " + getName() + "\n");
        sb.append("Age: " + getAge() + "\n");
        sb.append("Phone Numbers: " + Arrays.toString(getPhoneNumbers()) + "\n");
        sb.append("Address: " + getAddress() + "\n");
        sb.append("Personal Information:" + getPersonalInformation() + "\n");
        sb.append("*****************************");
        return sb.toString();
    }
}
