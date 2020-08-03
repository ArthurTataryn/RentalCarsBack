package tam.rentalcars.controllers.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tam.rentalcars.model.Fuel;
import tam.rentalcars.service.fuel.impls.FuelServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/fuel")
public class FuelRestController {

    FuelServiceImpl service;

    @Autowired
    public FuelRestController(FuelServiceImpl service) {
        this.service = service;
    }

    @PreAuthorize("hasAuthority('moder:read')")
    @RequestMapping("/list")
    List<Fuel> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public Fuel delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PreAuthorize("hasAuthority('admin:read')")
    @PostMapping("/create") // name
    public Fuel create(@RequestBody Fuel fuel){
        return service.create(fuel);
    }

    @PutMapping("/update") // id, name
    public Fuel update(@RequestBody Fuel fuel){
        return service.create(fuel);
    }

    @GetMapping("/get/{id}")
    public Fuel get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
