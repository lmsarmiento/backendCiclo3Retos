/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetosCiclo3.RetosCiclo3.Repositorio;

import RetosCiclo3.RetosCiclo3.Interface.InterfaceHabitacion;
import RetosCiclo3.RetosCiclo3.Modelo.Habitacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LOURDESS
 */
@Repository
public class HabitacionRepositorio {
        @Autowired
    private InterfaceHabitacion crud5;
    
    public List<Habitacion> getAll(){
        return (List<Habitacion>) crud5.findAll();
    }
    
    public Optional <Habitacion> getHabitacion (int id){
        return crud5.findById(id);
    }
    
    public Habitacion save(Habitacion room){
        return crud5.save(room);
}
        public void delete(Habitacion room){
        crud5.delete(room);
    }
}
