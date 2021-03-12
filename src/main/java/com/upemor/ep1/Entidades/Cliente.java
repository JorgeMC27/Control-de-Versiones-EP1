package com.upemor.ep1.Entidades;

/**
 @author JORGE
 **/
public class Cliente implements Operaciones{
    
    private String nombre;
    public String getNombre(){return nombre;}
    public void setNombre(String valor){nombre=valor;}
    
    private String apellidos;
    public String getApellidos(){return apellidos;}
    public void setApellidos(String valor){apellidos=valor;}
    
    private String telefono;
    public String getTelefono(){return telefono;}
    public void setTelefono(String valor){telefono=valor;}
    
    private String email;
    public String getEmail(){return email;}
    public void setEmail(String valor){email=valor;}
    
    public Cliente(){
    }

    public Cliente(String nombre,String apellidos,String telefono,String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;   
    }
    
    @Override
    public String toString(){
        return nombre+" | "+apellidos+" | "+telefono+" | "+email;
    }
    
    public String toCSV(){
        return nombre+","+apellidos+","+telefono+","+email;
    }
}
