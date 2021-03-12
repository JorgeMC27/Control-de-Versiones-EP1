
package com.upemor.ep1.Archivos;

import com.upemor.ep1.Entidades.Operaciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author JORGE
 **/
public abstract class AccesoDatos {
    
    protected Operaciones[] datos;
    public Operaciones[] getDatos(){return datos;}
    
    protected String rutaArchivo;
    protected File archivo;
    public abstract void leerObj(String valor, int cnt);
    
    public boolean cargarDatos(){
       
        try{
            File archivo = new File (rutaArchivo);
            FileReader fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);

            int cnt=0;
            String linea;
            while((linea = br.readLine())!=null){
                cnt++;
            }
            datos = new Operaciones[cnt];
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            cnt=0;
            while((linea = br.readLine())!=null){
               leerObj(linea,cnt);
            }   
        }catch(IOException ex){
            System.out.println("HA OCURRIDO UN ERROR "+ex);
        }
        
        return true;
    }
    
    public boolean guardarDatos() throws IOException{
        
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
            fw = new FileWriter(rutaArchivo);
            pw = new PrintWriter(fw);
            
            for(Operaciones obj:datos){
                pw.println(obj.toCSV());
            }
            fw.close();
            cargarDatos();
            return true;
        }catch(IOException ex){
            System.out.println("Ocurrio un error: "+ex);
            throw ex;
        }
      
      
    }
    
}
