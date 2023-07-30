package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@Builder
public class BookedPeriodsDTO {
    String email;
    String startDate;
    //"2023-07-30",
    String endDate;
    //"2023-07-30"
}
