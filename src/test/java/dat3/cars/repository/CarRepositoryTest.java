package dat3.cars.repository;

import dat3.cars.entity.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;

    static int c1;

    /*@BeforeAll
    public static void setupData(@Autowired CarRepository carRepository){
        Car car = new Car("Toyota", "corola", 1000, 50);
        carRepository.save(car);
        c1 = car.getId();
    }

    @Test
    public void testFindById(){
        Car found = carRepository.findById(c1).get();
        assertEquals(c1, found.getId());
    }

    @Test
    public void testFindByBrand(){
        Car found = carRepository.findCarByBrand("Toyota");
        assertEquals(c1, found.getId());
    }*/


}