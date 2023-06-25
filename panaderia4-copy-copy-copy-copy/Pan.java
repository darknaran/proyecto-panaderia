public class Pan
{
    private final String nombre;
    private double ventauno;
    private double ventados;
    private double ventatres;
    private double ventacuatro;
    private double ventacinco;
    private double ventaseis;
    private double ventasiete;
    public String getNombre(){
        return nombre;
    }
    
    public double getventauno(){
        return ventauno;
    }
    public void setventauno(double vetauno){
        if(ventauno >= 0) this.ventauno = ventauno;
        else this.ventauno = 0;
    }
    
    public double getventados(){
        return ventados;
    }
    public void setventados(double ventados){
        if(ventados >= 0) this.ventados = ventados;
        else this.ventados = 0;
    }
    
    public double getventatres(){
        return ventatres;
    }
    public void setventatres(double ventatres){
        if(ventatres >= 0) this.ventatres = ventatres;
        else this.ventatres = 0;
    }
    public void setventacuatro(double ventacuatro){
        if(ventacuatro >= 0) this.ventacuatro = ventacuatro;
        else this.ventacuatro = 0;
    }
    public void setventacinco(double ventacinco){
        if(ventacinco >= 0) this.ventacinco = ventacinco;
        else this.ventacinco = 0;
    }
     public void setventaseis(double ventaseis){
        if(ventaseis >= 0) this.ventaseis = ventaseis;
        else this.ventaseis = 0;
    }
     public void setventasiete(double ventasiete){
        if(ventasiete >= 0) this.ventasiete = ventasiete;
        else this.ventasiete = 0;
    }
    Pan( String nombre, double ventauno, double ventados, double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
        setventauno(ventauno);
        setventados(ventados);
        setventatres(ventatres);
        setventatres(ventacuatro);
        setventatres(ventacinco);
        setventatres(ventaseis);
        setventatres(ventasiete);
    }
    
    double calcularPromedio(){
        return (ventauno + ventados + ventatres + ventacuatro + ventacinco + ventaseis + ventasiete) / 7;
    }
}
