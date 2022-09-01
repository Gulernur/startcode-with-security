package dat3.cars.service;

import dat3.cars.dto.CarRequest;
import dat3.cars.dto.CarResponse;
import dat3.cars.dto.MemberRequest;
import dat3.cars.dto.MemberResponse;
import dat3.cars.entity.Car;
import dat3.cars.entity.Member;
import dat3.cars.repository.CarRepository;
import dat3.cars.repository.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class CarServiceMockitoTest {

    @Mock
    CarRepository carRepository;

    @Autowired
    CarService carService;

    @BeforeEach
    public void setup() {
        carService = new CarService(carRepository);
    }

    @Test
    void getCars() {
        Mockito.when(carRepository.findAll()).thenReturn(List.of(
                new Car("Honda", "something", 1500, 50),
                new Car("Mazda", "something2", 7000, 25)
        ));
        List<CarResponse> cars = carService.getCars();
        assertEquals(2, cars.size());
    }

    @Test
    void addCar() {
        Car c = new Car("Honda", "something", 1500, 50);
        //If you wan't to do this for Car you have to manually set the id. REMEMBER there is NO real database
        Mockito.when(carRepository.save(any(Car.class))).thenReturn(c);
        CarRequest request = new CarRequest(c);
        CarResponse found = carService.addCar(request);
        assertEquals(0, found.getId());
    }

    @Test
    void findCarById() {
        Car c = new Car("Honda", "something", 1500, 50);
        c.setId(1000);
        Mockito.when(carRepository.findById(1000)).thenReturn(Optional.of(c));
        CarResponse response = carService.findCarById(1000);
        assertEquals(1000, response.getId());
    }

    @Test
    void editCar() {
        /*CarRequest request = new CarRequest(new Car("Honda", "something", 1500, 50));
        carService.editCar(request,5);
        //find m1 and verify that address has been changed
        CarResponse response = carService.findCarById(5);
        assertEquals("Toyota", response.getBrand());
        assertEquals("hahahaha", response.getModel());
        assertEquals(5000, response.getPricePrDay());
        assertEquals(80, response.getBestDiscount());*/
    }

    @Test
    void deleteByUsername() {
    }
}