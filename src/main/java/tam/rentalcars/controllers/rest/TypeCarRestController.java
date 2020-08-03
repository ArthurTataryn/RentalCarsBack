package tam.rentalcars.controllers.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.rentalcars.model.TypeCar;
import tam.rentalcars.service.typecar.impls.TypeCarServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/type")
public class TypeCarRestController {

    TypeCarServiceImpl service;

    @Autowired
    public TypeCarRestController(TypeCarServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    List<TypeCar> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public TypeCar delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create") // name
    public TypeCar create(@RequestBody TypeCar typeCar){
        return service.create(typeCar);
    }

    @PutMapping("/update") // id, name
    public TypeCar update(@RequestBody TypeCar typeCar){
        return service.create(typeCar);
    }

    @GetMapping("/get/{id}")
    public TypeCar get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
