package car;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CarTestText {
    public static void main(String[] args) throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("Yellow", "Renault");
        objectMapper.writeValue(new File("out/car.json"), car);
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        Car car2 = objectMapper.readValue(json, Car.class);
        System.out.println(car2);
    }
}