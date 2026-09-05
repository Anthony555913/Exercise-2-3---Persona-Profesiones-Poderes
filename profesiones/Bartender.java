package profesiones;

import personas.Persona;
public class Bartender extends Persona{
    private final  double  SueldoHOra=1749.00;
    private double  SuledoTotal;
    private int HorasTravajo;

    public Bartender(String pNombre,int pEdad,double pSuledoTotal, int pHorasTravajo) {
        super(pNombre,pEdad);
        this.SuledoTotal = pSuledoTotal;
        this.HorasTravajo = pHorasTravajo;
    }

    public double getSueldoHOra() {
        return SueldoHOra;
    }
    public double getSuledoTotal() {
        return SuledoTotal;
    }

    public void setSuledoTotal(double pSuledoTotal) {
        this.SuledoTotal = pSuledoTotal;
    }

    public int getHorasTravajo() {
        return HorasTravajo;
    }

    public void setHorasTravajo(int pHorasTravajo) {
        this.HorasTravajo = pHorasTravajo;
    }
    public void ClaSalario(){
        this.SuledoTotal= this.SueldoHOra*this.HorasTravajo;
    }
    public void calgarPropina(double pPropina){
        this.SuledoTotal+= pPropina;
    }
    public void Servir(){
        System.out.println("¿que quiere?");
    }
}