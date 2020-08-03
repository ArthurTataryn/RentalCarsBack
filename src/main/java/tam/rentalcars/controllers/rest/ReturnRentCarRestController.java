package tam.rentalcars.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.rentalcars.model.ReturnRentCar;
import tam.rentalcars.service.returnrentcar.impls.ReturnRentCarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/return")
public class ReturnRentCarRestController {

    ReturnRentCarServiceImpl service;

    @Autowired
    public ReturnRentCarRestController(ReturnRentCarServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public List<ReturnRentCar> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public ReturnRentCar delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create") // RentCar, return cost, all cost
    public ReturnRentCar create(@RequestBody ReturnRentCar returnRentCar){
        return service.create(returnRentCar);
    }

    @PutMapping("/update") // ReturnRentCar id, RentCar, return cost, all cost
    public ReturnRentCar update(@RequestBody ReturnRentCar returnRentCar){
        return service.create(returnRentCar);
    }

    @GetMapping("/get/{id}")
    public ReturnRentCar get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
