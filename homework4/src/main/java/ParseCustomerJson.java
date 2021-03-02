import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParseCustomerJson {
    public static void main (String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try{
            Customer customer = mapper.readValue(new File("C:\\Users\\i.gorfiniak\\IdeaProjects\\lits-at-031-homeworks\\homework4\\src\\main\\java\\customer.json"), Customer.class);
            System.out.println(customer);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
