
package profesiones;

import java.util.ArrayList;
import personas.Persona;
public class AgenteDeBolsa extends Persona{
    private int CanClientes;
    private ArrayList<Persona> Nombres=new ArrayList<>();
    private int Precio;

    public AgenteDeBolsa(String pNombre,int pEdad,int CanClientes, int Precio) {
        super(pNombre,pEdad);
        this.CanClientes = CanClientes;
        this.Precio = Precio;
    }

    public int getCanClientes() {
        return CanClientes;
    }

    public ArrayList<Persona> getNombres() {
        return Nombres;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setCanClientes(int pCanClientes) {
        this.CanClientes = pCanClientes;
    }

    public void setNombres(ArrayList<Persona> pNombres) {
        this.Nombres = pNombres;
    }

    public void setPrecio(int pPrecio) {
        this.Precio = pPrecio;
    }
    public void agregarNombre(Persona pNombre){
        this.Nombres.add(pNombre);
    }
    public void agregarNuevocliente(Persona pNombre){
        this.Nombres.add(pNombre);
        this.CanClientes+=1;
    }
    public boolean revisarCanClientes(){
        if(CanClientes==Nombres.size()){
            return true;
        }
        return false;
    }
}