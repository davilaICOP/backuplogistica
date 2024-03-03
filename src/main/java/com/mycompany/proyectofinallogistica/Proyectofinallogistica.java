/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinallogistica;

import Controladoras.ControladoraCliente;
import Controladoras.ControladoraDetalleMante;
import Controladoras.ControladoraEmpleado;
import Controladoras.ControladoraEmpleadoViaje;
import Controladoras.ControladoraMantenimiento;
import Controladoras.ControladoraMarca;
import Controladoras.ControladoraPaquete;
import Controladoras.ControladoraParteDiario;
import Controladoras.ControladoraVehiculo;
import Controladoras.ControladoraViaje;
import Controladoras.ControladoraViajePaquete;
import java.util.Date;
import logisticaigu.Login;
import logisticaigu.Menu;
import logisticalogica.Cliente;
import logisticalogica.DetalleMantenimiento;
import logisticalogica.Empleado;
import logisticalogica.EmpleadoViaje;
import logisticalogica.Mantenimiento;
import logisticalogica.Marca;
import logisticalogica.Paquete;
import logisticalogica.ParteDiario;
import logisticalogica.Vehiculo;
import logisticalogica.Viaje;
import logisticalogica.ViajePaquete;
import logisticapersistencia.ClienteJpaController;

import logisticapersistencia.ControladoraPersistencia;
import logisticapersistencia.DetalleMantenimientoJpaController;
import logisticapersistencia.EmpleadoJpaController;
import logisticapersistencia.EmpleadoViajeJpaController;
import logisticapersistencia.LocalidadJpaController;
import logisticapersistencia.MantenimientoJpaController;
import logisticapersistencia.MantenimientoRealizadoJpaController;
import logisticapersistencia.MarcaJpaController;
import logisticapersistencia.PaqueteJpaController;
import logisticapersistencia.ParteDiarioJpaController;
import logisticapersistencia.ProvinciaJpaController;
import logisticapersistencia.RolUsuarioJpaController;
import logisticapersistencia.UsuarioJpaController;
import logisticapersistencia.VehiculoJpaController;
import logisticapersistencia.ViajeJpaController;
import logisticapersistencia.ViajePaqueteJpaController;


/**
 *
 * @author ULTRA
 */
public class Proyectofinallogistica {

    public static void main(String[] args) {
    /*Menu menu = new Menu();
    menu.setVisible(true);
     */
    
    /*ClienteJpaController cliente = new ClienteJpaController();
    DetalleMantenimientoJpaController detallemante = new DetalleMantenimientoJpaController();
    EmpleadoJpaController empleado = new EmpleadoJpaController();
    EmpleadoViajeJpaController empleadoviaje = new EmpleadoViajeJpaController();
    LocalidadJpaController localidad = new LocalidadJpaController();
    MantenimientoJpaController mante = new MantenimientoJpaController();
    MantenimientoRealizadoJpaController manterealizado = new MantenimientoRealizadoJpaController();
    MarcaJpaController marca = new MarcaJpaController();*/
    PaqueteJpaController paquete = new PaqueteJpaController();
    /*ParteDiarioJpaController partediario = new ParteDiarioJpaController();
    ProvinciaJpaController provincia = new ProvinciaJpaController();
    RolUsuarioJpaController rolusuario = new RolUsuarioJpaController();
    UsuarioJpaController usuario = new UsuarioJpaController();
    VehiculoJpaController vehiculo = new VehiculoJpaController();
    ViajeJpaController viaje = new ViajeJpaController();
    ViajePaqueteJpaController viajepaquete = new ViajePaqueteJpaController();*/
    
    }
}