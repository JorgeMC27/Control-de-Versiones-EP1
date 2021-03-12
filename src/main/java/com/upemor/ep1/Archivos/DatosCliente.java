
package com.upemor.ep1.Archivos;

import com.upemor.ep1.Entidades.Cliente;





/**
 *
 * @author JORGE
 */
public class DatosCliente extends AccesoDatos{
    private String rutaArchivo;
    public DatosCliente(){
        rutaArchivo = "C:/Users/JORGE/Desktop/CUATRI 5/FUNDAMENTOS DE PROGRAMACION ORIENTADA A OBJETOS/EP1/BDClientes.csv";
    }
    public DatosCliente(String ruta){
        rutaArchivo = ruta;
    }
    
    @Override
    public void leerObj(String linea, int cnt){
        String[] dts= linea.split(",");
               Cliente obj = new Cliente();
                   obj.setNombre(dts[0]);
                   obj.setApellido(dts[1]);
                   obj.setTelefono(dts[2]);
                   obj.setEmail(dts[3]);
                   
                   datos[cnt]=obj;
                cnt++;
    }
}
