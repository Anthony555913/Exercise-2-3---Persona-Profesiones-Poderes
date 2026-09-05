# Exercise-2-3---Persona-Profesiones-Poderes
quickstart esta empaquetado en programaMutante, este es el programa principal y en donde se ejecuta el programa. esta crea variables de las diversas clases empaquetadas en profesiones y utiliza la interface IPower para así para ejecutar dispararPoder()
Persona esta empaquetado en personas. esta es la clase padre de todas las clases empaquetadas en profesiones. sus atributos son: edad un int, nombre un string protected debido a que la clase nombre utiliza el atributo directamente y Poder que utiliza a la interfase IPower. tiene dos constructores para de edad y nombre o nombre y edad, los setter and getter, lansarPoder utiliza dispararPoder y cantar muestra un String
AgenteDeBolsa, Bartender, Doctor estan empaquetado en Profesiones sus atributos hacen referencia a cosas de las mismas y todas son clases hijas de Persona  
IPower es una interfase empaquetada en poderes que es utilizada por todas las clases que comiensan por Power
todas las clases que comiencen con Power están empaquetadas en poderes utilizan la interface Ipower como único método y todas devuelven un string
#codigo mermaid
classDiagram
    direction TB

    namespace personas {
        class Persona {
            -int edad
            #String nombre
            -IPower Poder
            +Persona()
            +Persona(int pEdad, String pNombre)
            +Persona(String pNombre, int pEdad)
            +Persona(String pNombre)
            +getNombre() String
            +getEdad() int
            +setEdad(int pEdad) void
            +cantar() void
            +setPower(IPower pPoder) void
            +lansarPoder() void
        }
    }

    namespace poderes {
        class IPower {
            <<interface>>
            +dispararPoder() void
        }

        class PowerCrearTorre {
            +dispararPoder() void
        }

        class PowerDispararRayo {
            +dispararPoder() void
        }

        class PowerMulticlicacion {
            +dispararPoder() void
        }

        class powerOndaExpanciva {
            +dispararPoder() void
        }

        class PowerRaigeki {
            +dispararPoder() void
        }
    }

    namespace profesiones {
        class Doctor {
            -String Especialidad
            -String SeguroAsociado
            -int PrecioConsulta
            -int Ahorros
            +Doctor(String pNombre, String pEspecialidad, String pSeguroAsociado, int pPrecioConsulta, int pAhorros)
            +getEspecialidad() String
            +setEspecialidad(String pEspecialidad) void
            +getSeguroAsociado() String
            +setSeguroAsociado(String pSeguroAsociado) void
            +getPrecioConsulta() int
            +setPrecioConsulta(int pPrecioConsulta) void
            +getAhorros() int
            +setAhorros(int pAhorros) void
            +cobrar() void
            +seguro() void
            +seguroRevision(String SeguroCliente) boolean
        }

        class Bartender {
            -double SueldoHOra
            -double SuledoTotal
            -int HorasTravajo
            +Bartender(String pNombre, int pEdad, double pSuledoTotal, int pHorasTravajo)
            +getSueldoHOra() double
            +getSuledoTotal() double
            +setSuledoTotal(double pSuledoTotal) void
            +getHorasTravajo() int
            +setHorasTravajo(int pHorasTravajo) void
            +ClaSalario() void
            +calgarPropina(double pPropina) void
            +Servir() void
        }

        class AgenteDeBolsa {
            -int CanClientes
            -ArrayList~Persona~ Nombres
            -int Precio
            +AgenteDeBolsa(String pNombre, int pEdad, int CanClientes, int Precio)
            +getCanClientes() int
            +setCanClientes(int pCanClientes) void
            +getNombres() ArrayList~Persona~
            +setNombres(ArrayList~Persona~ pNombres) void
            +getPrecio() int
            +setPrecio(int pPrecio) void
            +agregarNombre(Persona pNombre) void
            +agregarNuevocliente(Persona pNombre) void
            +revisarCanClientes() boolean
        }
    }

    namespace programaMutante {
        class quickstart {
            <<main>>
            +main(String[] args) void$
        }
    }

    Persona <|-- Doctor
    Persona <|-- Bartender
    Persona <|-- AgenteDeBolsa

    IPower <|.. PowerCrearTorre
    IPower <|.. PowerDispararRayo
    IPower <|.. PowerMulticlicacion
    IPower <|.. powerOndaExpanciva
    IPower <|.. PowerRaigeki

    Persona "1" o-- "0..1" IPower : Poder
    AgenteDeBolsa "1" o-- "*" Persona : Nombres

    quickstart ..> Persona : usa
    quickstart ..> IPower : usa
    quickstart ..> Doctor : crea
    quickstart ..> Bartender : crea
    quickstart ..> AgenteDeBolsa : crea
