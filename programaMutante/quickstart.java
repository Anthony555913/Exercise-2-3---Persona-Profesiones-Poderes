package programaMutante;

import personas.*;
import poderes.*;
import profesiones.*;
public class quickstart {
    public static void main(String[] args) {
        System.out.println("Hello clase de Poo");
        Persona anthony=new Persona();
        Persona p1=new Persona("fernanda",(byte)22);
        System.err.println(anthony.getNombre());
        anthony.cantar();
        System.out.println("--------------------------");
        System.err.println(p1.getNombre());
        p1.cantar();
        System.out.println("--------------------------");
        System.out.println("edad de "+anthony.getNombre()+" "+anthony.getEdad());
        anthony.setEdad((byte)20);
        System.out.println("edad de "+anthony.getNombre()+" "+anthony.getEdad());
        Persona xzy =p1;
        System.out.println("edad de "+p1.getNombre()+" "+p1.getEdad());
        System.out.println("edad de "+xzy.getNombre()+" "+xzy.getEdad());
        xzy.setEdad((byte)20);
        System.out.println("edad de "+p1.getNombre()+" "+p1.getEdad());
        System.out.println("edad de "+xzy.getNombre()+" "+xzy.getEdad());
        Persona profesionales[] = new Persona[10];
        IPower poderesDisponibles[] = {new powerOndaExpanciva(), new PowerDispararRayo(),new PowerCrearTorre(),new PowerMulticlicacion(),new PowerRaigeki()};

        for (int i = 0; i < 10; i++) {
            int tipoProfesion = (int)Math.random();
            switch (tipoProfesion) {
                case 0:
                    profesionales[i] = new Doctor("Rpberto "+i,"cardiologia", "RPN",1000000,11000);
                    break;
                case 1:
                    profesionales[i] = new Bartender("carlos Santaana"+i, i+10,110000.0,8);
                    break;
                case 2:
                    profesionales[i] = new AgenteDeBolsa("Pedro Oscobar "+i, i+10,10,300000);
                    break;
                default:
                    profesionales[i] = new Doctor("Rpberto "+i,"cardiologia", "RPN",100000,11000);
            }
            profesionales[i].setPower(poderesDisponibles[(int)Math.random()*2]);
        }

        for(Persona p : profesionales) {
            System.out.println("Ataca "+p.getNombre());
            p.lansarPoder();
        }
    }
}
