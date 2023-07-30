package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.*;
@Getter
@ToString
@Setter
@Builder

public class BookedPeriodsListDTO {

    List<BookedPeriodsDTO> bookedPeriods = new ArrayList<>();
}
