package dat3.cars.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.cars.entity.Reservation;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationsResponse {

    int id;
    String memberUsername;
    int carId;
    String carBrand;

    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate rentalDate;

    public ReservationsResponse(Reservation reservation) {
        this.id = reservation.getId();
        this.memberUsername = reservation.getMember().getUsername();
        this.carId = reservation.getId();
        this.carBrand = reservation.getCar().getBrand();
    }
}
