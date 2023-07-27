package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@Builder
public class ErrorDTO {
    /*
    {
  "timestamp": "2023-07-26T16:20:46.812Z",
  "status": 0,
  "error": "string",
  "message": {
    "additionalProp1": "string",
    "additionalProp2": "string",
    "additionalProp3": "string"
  },
  "path": "string"
}
     */
    String timestamp;
    int status;
    String error;
    MessageErrorDTO messageErrorDTO;
    String path;

}
