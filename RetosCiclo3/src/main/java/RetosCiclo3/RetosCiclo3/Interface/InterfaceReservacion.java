/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RetosCiclo3.RetosCiclo3.Interface;

import RetosCiclo3.RetosCiclo3.Modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author LOURDESS
 */
public interface InterfaceReservacion extends CrudRepository<Reservacion,Integer>{
    
}
