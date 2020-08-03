package tam.rentalcars.controllers.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tam.rentalcars.model.Color;
import tam.rentalcars.service.color.impls.ColorServiceImpl;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/color")
public class ColorRestController {

    ColorServiceImpl service;

    @Autowired
    public ColorRestController(ColorServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/list")
    List<Color> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public Color delete(@PathVariable("id")String id){
        return service.delete(id);
    }

    @PostMapping("/create") // name
    public Color create(@RequestBody Color color){
        return service.create(color);
    }

    @PutMapping("/update") // id, name
    public Color update(@RequestBody Color color){
        return service.create(color);
    }

    @GetMapping("/get/{id}")
    public Color get(@PathVariable("id")String id) {
        return service.get(id);
    }
}
