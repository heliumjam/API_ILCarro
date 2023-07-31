package tests;

import com.jayway.restassured.RestAssured;
import dto.UserDTO;
import helpers.RandomHelper;
import okhttpapi.AuthenticationController;
import okhttpapi.CarController;
import org.testng.annotations.BeforeSuite;

public class BaseTest {


    String email;
    String password = "aA12345$iI";
    UserDTO userDTO;
    AuthenticationController authenticationController = new AuthenticationController();
    CarController carcontroller = new CarController();
    RandomHelper randomHelper = new RandomHelper();

    String serialNumber;


    @BeforeSuite
    public void start(){
        email = randomHelper.generateRandomEmail();
        //authenticationController.setToken(email,password);
        userDTO = UserDTO.builder()
                .username(email)
                .password(password)
                .firstName("FirstNameDTO")
                .lastName("LastNameDTO")
                .build();
        authenticationController.setToken(userDTO);

       authenticationController.setPath();

    }

}
