package dat3.cars.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
//----------------------------
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp
    private LocalDateTime reservationDate;

    private LocalDate rentalDate;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Car car;

    public Reservation (Member member, Car car, LocalDate rentalDate) {
        this.rentalDate = rentalDate;
        this.member = member;
        this.car = car;
    }
}
