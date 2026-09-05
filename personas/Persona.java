package personas;

import poderes.*;
public class Persona{
    private int edad;
    protected  String nombre;
    private IPower Poder; 
    public Persona(){
        edad=48;
        nombre="anthony Fernandez";
    }
    public Persona(int pEdad,String pNombre){
        edad=pEdad;
        nombre=pNombre;
    }
    public Persona(String pNombre, int pEdad){
        edad=pEdad;
        nombre=pNombre;
        }
        public Persona(String pNombre){
        edad=0;
        nombre=pNombre;
        }
        public String getNombre(){
            return this.nombre;
        }
        public int getEdad(){
            return this.edad;
        }
        public void setEdad(int pEdad){
            this.edad=pEdad;
        }
    
    public void cantar(){
        System.out.println(
            "Nothing more I say"+ "\n"+
            "Nothing changes by words"+"\n"+
            "Nothing changes anyway"+"\n"+
            "Only time passes");
        }
    public void setPower(IPower pPoder){
        this.Poder=pPoder;
    }
    public void  lansarPoder(){
        this.Poder.dispararPoder();
    }
    }
