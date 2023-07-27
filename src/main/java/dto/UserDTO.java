package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Builder
@Getter
public class UserDTO {
    /*
    {
  "username": "string",
  "password": "29N;A3kx/D'dT>97FCS/to\\{kRiCxp06):C1>yM06uFZ| n7YA[Y= wlVo#rD*bi@$aaG<dPy6 g2k^",
  "firstName": "string",
  "lastName": "string"
}
     */
    String username;
    String password;
    String firstName;
    String lastName;
}
