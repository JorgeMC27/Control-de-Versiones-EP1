
package com.upemor.ep1.Archivos;

import com.upemor.ep1.Entidades.Empleado;
import com.upemor.ep1.Entidades.Operaciones;
import java.io.IOException;




/**
 *
 * @author JORGE
 */
public class DatosEmpleado extends AccesoDatos{
    private String rutaArchivo;
    public DatosEmpleado(){
        rutaArchivo = "C:/Users/JORGE/Desktop/CUATRI 5/FUNDAMENTOS DE PROGRAMACION ORIENTADA A OBJETOS/EP1/BDEmpleados.csv";
    }
    public DatosEmpleado(String ruta){
        rutaArchivo = ruta;
    }
    
    @Override
    public void leerObj(String linea, int cnt){
        String[] dts= linea.split(",");
               Empleado obj =new Empleado();
                   obj.setNombre(dts[0]);
                   obj.setApellido(dts[1]);
                   obj.setDepartamento(dts[2]);
                   obj.setCargo(dts[3]);
                   obj.setTeléfono(dts[4]);
                   obj.setEmail(dts[5]);
                   
                   datos[cnt]=obj;
                cnt++;
    }

  
}
