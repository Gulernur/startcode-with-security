package dat3.cars.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Rental(LocalDate rentalDate, double pricePrDay) {
        this.rentalDate = rentalDate;
        this.pricePrDay = pricePrDay;
    }
}
