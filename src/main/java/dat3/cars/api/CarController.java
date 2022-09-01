package dat3.cars.api;


import dat3.cars.dto.CarRequest;
import dat3.cars.dto.CarResponse;
import dat3.cars.dto.MemberRequest;
import dat3.cars.dto.MemberResponse;
import dat3.cars.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {

    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    //Security ADMIN ???
    @GetMapping
    List<CarResponse> getCars(){
        return carService.getCars();
    }

    //Security ADMIN ???
    @GetMapping(path = "/{id}")
    CarResponse getCarById(@PathVariable int id) throws Exception {
        return carService.findCarById(id);
    }

    @PostMapping // same as above when you are using @RestController
    CarResponse addCar(@RequestBody CarRequest body){
        CarResponse res = CarService.addCar(body);
        return res;
    }

    //Security USER/ADMIN ???
    @PutMapping("/{id}")
    ResponseEntity<Boolean> editCar(@RequestBody CarRequest body, @PathVariable int id){
        carService.editCar(body,id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    // Security ADMIN ????
    @DeleteMapping("/{id}")
    void deleteCarById(@PathVariable int id) {
        carService.deleteByUsername(id);
    }

}
