/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetosCiclo3.RetosCiclo3.Web;

import RetosCiclo3.RetosCiclo3.Modelo.Habitacion;
import RetosCiclo3.RetosCiclo3.Servicios.ServiciosHabitacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LOURDESS
 */
@RestController
@RequestMapping("/api/Room")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class HabitacionWeb {
    @Autowired
    private ServiciosHabitacion servicio;
    @GetMapping("/all")
    public List<Habitacion> getHabitacion(){
        return servicio.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Habitacion> getHabitacion(@PathVariable("id") int roomId){
        return servicio.getHabitacion(roomId);
    }
    
    /**
     *
     * @param room
     * @return
     */
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion save(@RequestBody Habitacion room){
        return servicio.save(room);
    }
    /**
     * 
     * @param room
     * @return 
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion update(@RequestBody Habitacion room) {
        return servicio.update(room);
    }
    /**
     * 
     * @param roomId
     * @return 
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int roomId) {
        return servicio.deleteHabitacion(roomId);
    }  
}
