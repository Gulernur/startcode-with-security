package dat3.cars.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.cars.entity.Reservation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationsResponse {

    private int id;
    private LocalDateTime reservationDate;
    private LocalDate rentalDate;

    public ReservationsResponse(Reservation reservation) {
        this.id = reservation.getId();
        this.reservationDate = reservation.getReservationDate();
        this.rentalDate = reservation.getRentalDate();
    }
}
