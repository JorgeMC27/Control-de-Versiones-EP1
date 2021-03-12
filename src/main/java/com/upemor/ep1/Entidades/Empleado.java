package com.upemor.ep1.Entidades;

/**
@author JORGE
 **/
public class Empleado implements Operaciones{
    
    private String nombre;
    public String getNombre(){return nombre;}
    public void setNombre(String valor){nombre=valor;}
    
    private String apellido;
    public String getApellido(){return apellido;}
    public void setApellido(String valor){apellido=valor;}
    
    private String departamento;
    public String getDepartamento(){return departamento;}
    public void setDepartamento(String valor){departamento=valor;}
    
    private String cargo;
    public String getCargo(){return cargo;}
    public void setCargo(String valor){cargo=valor;}
    
    private String telefono;
    public String getTeléfono(){return telefono;}
    public void setTeléfono(String valor){telefono = valor;}
    
    private String email;
    public String getEmail(){return email;}
    public void setEmail(String valor){email=valor;}
    
    public Empleado(){
    }

    public Empleado(String nombre,String apellido,String departamento,String cargo,String telefono,String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento= departamento;
        this.cargo = cargo;
        this.telefono = telefono;
        this.email = email;   
    }
    
    @Override
    public String toCSV(){
        return nombre+","+apellido+","+departamento+","+cargo+","+telefono+","+email;
    }
}
