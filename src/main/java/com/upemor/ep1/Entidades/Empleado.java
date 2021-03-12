package com.upemor.ep1.Entidades;

/**
@author JORGE
 **/
public class Empleado {
    
    private String nombre;
    public String getNombre(){return nombre;}
    public void setNombre(String valor){nombre=valor;}
    
    private String apellidos;
    public String getApellidos(){return apellidos;}
    public void setApellidos(String valor){apellidos=valor;}
    
    private String departamento;
    public String getDepartamento(){return departamento;}
    public void setDepartamento(String valor){departamento=valor;}
    
    private String cargo;
    public String getCargo(){return cargo;}
    public void setCargo(String valor){cargo=valor;}
    
    private String teléfono;
    public String getTeléfono(){return teléfono;}
    public void setTeléfono(String valor){teléfono=valor;}
    
    private String email;
    public String getEmail(){return email;}
    public void setEmail(String valor){email=valor;}
}
