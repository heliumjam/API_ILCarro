package tests;

import com.jayway.restassured.response.Response;
import dto.AddCarDTO;
import dto.BookedPeriodsListDTO;
import helpers.RandomHelper;
import org.testng.annotations.Test;

public class AddNewCarTests extends BaseTest{

    @Test
    public void addNewCarPositive(){

        AddCarDTO car = AddCarDTO.builder()
                .serialNumber(randomHelper.generateRandomString(10))
                .manufacture("opel")
                .model("corsa")
                .year("1990")
                .fuel("Petrol")
                .seats(2)
                .carClass("first")
                .pricePerDay(25)
                .about("blabla")
                .city("Tel Aviv")
                .build();

//32422234

        Response response = carcontroller.requestNewCar(car);

        response.then().assertThat().statusCode(200);

        }
        @Test
    public void addDuplicateCarTest(){
        String serialNumber = randomHelper.generateRandomString(10);
            AddCarDTO car = AddCarDTO.builder()
                    .serialNumber(serialNumber)
                    .manufacture("opel")
                    .model("corsa")
                    .year("1990")
                    .fuel("Petrol")
                    .seats(2)
                    .carClass("first")
                    .pricePerDay(25)
                    .about("blabla")
                    .city("Tel Aviv")
                    .build();


            Response response = carcontroller.requestNewCar(car);

            response.then().assertThat().statusCode(200);


             car = AddCarDTO.builder()
                    .serialNumber(serialNumber)
                    .manufacture("opel")
                    .model("corsa")
                    .year("1990")
                    .fuel("Petrol")
                    .seats(2)
                    .carClass("first")
                    .pricePerDay(25)
                    .about("blabla")
                    .city("Tel Aviv")
                    .build();
            response = carcontroller.requestNewCar(car);

            System.out.println("above 200");

            response.then().assertThat().statusCode(400);
            System.out.println("above 400");



        }

    }

