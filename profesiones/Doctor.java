package profesiones;

import personas.Persona;
public class Doctor extends Persona{
    private String Especialidad;
    private String SeguroAsociado;
    private int PrecioConsulta;
    private int Ahorros;
    
    public Doctor(String pNombre,String pEspecialidad,String pSeguroAsociado,int pPrecioConsulta,int pAhorros){
        this.nombre=pNombre;
        this.Especialidad=pEspecialidad;
        this.SeguroAsociado=pSeguroAsociado;
        this.PrecioConsulta=pPrecioConsulta;
        this.Ahorros=pAhorros;
    }
    // Getter y Setter de Especialidad
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String pEspecialidad) {
        this.Especialidad = pEspecialidad;
    }

    public String getSeguroAsociado() {
        return SeguroAsociado;
    }

    public void setSeguroAsociado(String pSeguroAsociado) {
        this.SeguroAsociado = pSeguroAsociado;
    }

    // Getter y Setter de PrecioConsulta
    public int getPrecioConsulta() {
        return PrecioConsulta;
    }

    public void setPrecioConsulta(int pPrecioConsulta) {
        this.PrecioConsulta = pPrecioConsulta;
    }

    // Getter y Setter de Ahorros
    public int getAhorros() {
        return Ahorros;
    }

    public void setAhorros(int pAhorros) {
        this.Ahorros = pAhorros;
    }
    public void cobrar(){
        this.Ahorros+=this.PrecioConsulta;
    }
    public void seguro(){
        System.out.println("¿tiene seguto?");
    }
    public boolean  seguroRevision(String SeguroCliente){
        return this.SeguroAsociado.equals(SeguroCliente);
    }
}