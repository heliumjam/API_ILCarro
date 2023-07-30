package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@Builder
public class AddCarDTO {
    /*
      "serialNumber": "string",
  "manufacture": "string",
  "model": "string",
  "year": "string",
  "fuel": "string",
  "seats": 0,
  "carClass": "string",
  "pricePerDay": 0,
  "about": "string",
  "city": "string",
  "lat": 0,
  "lng": 0,
  "image": "string",
  "owner": "string",
  "bookedPeriods": [
    {
      "email": "string",
      "startDate": "2023-07-30",
      "endDate": "2023-07-30"
    }
  ]
     */
    String serialNumber;
    String manufacture;
    String model;
    String year;
    String fuel;
    int seats;
    String carClass;
    double pricePerDay;
    String about;
    String city;
    double lat;
    double lng;
    String image;
    String owner;
    BookedPeriodsListDTO bookedPeriods;
}
