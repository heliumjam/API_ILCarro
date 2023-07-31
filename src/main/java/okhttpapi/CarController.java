package okhttpapi;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import dto.AddCarDTO;
import dto.ResponseMessageDto;

public class CarController extends BaseAPI{
    Response responseAddNewCar;
    public Response requestNewCar(AddCarDTO addCarDTO){
        return RestAssured.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoiczh2M3Bra20ybkBtYWlsLmNvbSIsImlzcyI6IlJlZ3VsYWl0IiwiZXhwIjoxNjkxMzM4NTAyLCJpYXQiOjE2OTA3Mzg1MDJ9.rrKf7SqqTcPL6JwYjKuddicjcr5ubBkmHqhLImDpwbg")
                .body(addCarDTO)
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/cars");

    }

    public Response requestNewCarUnauthorized(AddCarDTO addCarDTO){
        return RestAssured.given()
                .header("Authorization", "dfsdfsadfsadf")
                .body(addCarDTO)
                .contentType(ContentType.JSON)
                .when()
                .post("/v1/cars");

    }

    public Response requestDeleteCar(String serialNumber){
        return RestAssured.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoiczh2M3Bra20ybkBtYWlsLmNvbSIsImlzcyI6IlJlZ3VsYWl0IiwiZXhwIjoxNjkxMzM4NTAyLCJpYXQiOjE2OTA3Mzg1MDJ9.rrKf7SqqTcPL6JwYjKuddicjcr5ubBkmHqhLImDpwbg")
                .contentType(ContentType.JSON)
                .when()
                .delete("/v1/cars/"+serialNumber);

    }

}

