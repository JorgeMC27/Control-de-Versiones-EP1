
package com.upemor.ep1.Archivos;

import com.upemor.ep1.Entidades.Cliente;




/**
 *
 * @author JORGE
 */
public class DatosCliente extends AccesoDatos{
    private String rutaArchivo;
    public DatosCliente(){
        rutaArchivo = "C:/Users/JORGE/Desktop/CUATRI 5/FUNDAMENTOS DE PROGRAMACION ORIENTADA A OBJETOS/veterinaria/baseClientes.csv";
    }
    public DatosCliente(String ruta){
        rutaArchivo = ruta;
    }
    
    @Override
    public void leerObj(String linea, int cnt){
        String[] dts= linea.split(",");
               Cliente obj =new Cliente();
                  /* persona.setNombre(dts[0]);
                   persona.setApellido(dts[1]);
                   persona.setTelefono(dts[3]);
                   persona.setCorreo(dts[4]);
                   */
                   datos[cnt]=obj;
                cnt++;
    }
}
