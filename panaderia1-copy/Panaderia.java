public class Panaderia
{
    String nombre;
    double ventasuno;
    double ventasdos;
    double ventastres;
    double ventascuatro;
    double ventascinco;
    double ventasseis;
    double ventassiete;
    Panaderia(String nombre, double venatasuno, double ventasdos, double ventastres,double ventascuatro,double ventascinco,double ventasseis, double ventassiete){
        this.nombre = nombre;
        this.ventasuno = ventasuno;
        this.ventasdos = ventasdos ;
        this.ventastres = ventastres;
        this.ventastres = ventascuatro;
        this.ventastres = ventascinco;
        this.ventastres = ventasseis;
        this.ventastres = ventassiete;
        
    }
    
    double calcularPromedio(){
        return (ventasuno + ventasdos + ventastres + ventascuatro + ventascinco + ventasseis + ventassiete) / 7;
    }
}
