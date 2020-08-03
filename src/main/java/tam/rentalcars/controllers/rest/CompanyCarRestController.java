package tam.rentalcars.controllers.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.rentalcars.model.*;
import tam.rentalcars.service.companycar.impls.CompanyCarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/company")
public class CompanyCarRestController {

    CompanyCarServiceImpl service;

    @Autowired
    public CompanyCarRestController(CompanyCarServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    List<CompanyCar> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public CompanyCar delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create") // Class->CAR{ brand, model, type, mileage, transmission, year, door, name fuel, color}, cost, license number plates, rental price
    public CompanyCar create(@RequestBody CompanyCar companyCar){
        return service.create(companyCar);
    }

    @PutMapping("/update") // id company, Class->CAR{ id car, brand, model, type, mileage, transmission, year, door, name fuel, color}, cost, license number plates, rental price, repair, rent
    public CompanyCar update(@RequestBody CompanyCar companyCar){
        return service.create(companyCar);
    }

    @GetMapping("/get/{id}")
    public CompanyCar get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
