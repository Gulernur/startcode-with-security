package dat3.cars.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private LocalDate rentalDate;
    private double pricePrDay;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Car car;

    public Rental(LocalDate rentalDate, double pricePrDay) {
        this.rentalDate = rentalDate;
        this.pricePrDay = pricePrDay;
    }
}
