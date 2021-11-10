/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetosCiclo3.RetosCiclo3.Repositorio;

import RetosCiclo3.RetosCiclo3.Interface.InterfaceReservacion;
import RetosCiclo3.RetosCiclo3.Modelo.Reservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LOURDESS
 */
@Repository
public class ReservacionRepositorio {
        @Autowired
    private InterfaceReservacion crud4;

    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }
    public Optional<Reservacion> getReservacion(int id){
        return crud4.findById(id);
    }
    public Reservacion save(Reservacion reservation){
        return crud4.save(reservation);
    }
    public void delete(Reservacion reservation){
        crud4.delete(reservation);
    }
}
