package best.dima.sandbox.parsejson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parser {

    public static void main(String [] args)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person user = mapper.readValue("{\"name\": \"John\"}", Person.class);
            System.out.println(user.getName()); //John
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
}
