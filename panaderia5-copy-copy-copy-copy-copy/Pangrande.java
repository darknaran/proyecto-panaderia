public class Pangrande{
    private final String nombre;
    private double ventasuno;
    private double ventasdos;
    private double ventastres;
    private double ventascuatro;
    private double ventascinco;
    private double ventasseis;
    private double ventassiete;
    public String getNombre(){
        return nombre;
    }
    
    public double getventasuno(){
        return ventasuno;
    }
    public void setventasuno(double ventasuno){
        if(ventasuno >= 0) this.ventasuno = ventasuno;
        else this.ventasuno = 0;
    }
    
    public double getventasdos(){
        return ventasdos;
    }
    public void setventasdos(double ventasdos){
        if(ventasdos >= 0) this.ventasdos = ventasdos;
        else this.ventasdos = 0;
    }
    
    public double getventastres(){
        return ventastres;
    }
    public void setventastres(double ventastres){
        if(ventastres >= 0) this.ventastres = ventastres;
        else this.ventastres = 0;
    }
    
      public double getventascuatro(){
        return ventascuatro;
    }
    public void setventascuatro(double ventascuatro){
        if(ventascuatro >= 0) this.ventascuatro = ventascuatro;
        else this.ventascuatro = 0;
    }
    
      public double getventascinco(){
        return ventascinco;
    }
    public void setventascinco(double ventascinco){
        if(ventascinco >= 0) this.ventascinco = ventascinco;
        else this.ventascinco = 0;
    }
    
    public double getventasseis(){
        return ventasseis;
    }
    public void setventasseis(double ventasseis){
        if(ventasseis >= 0) this.ventasseis = ventasseis;
        else this.ventasseis = 0;
    }
    
    public double getventassiete(){
        return ventassiete;
    }
    public void setventassiete(double ventassiete){
        if(ventassiete >= 0) this.ventassiete = ventassiete;
        else this.ventassiete = 0;
    }
    
    
    Pangrande(String nombre, double ventasuno, double ventasdos, double ventastres, double ventascuatro, double ventascinco, double ventasseis, double ventassiete){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
        setventasuno(ventasuno);
        setventasdos(ventasdos);
        setventastres(ventastres);
        setventascuatro(ventascuatro);
        setventascinco(ventascinco);
        setventasseis(ventasseis);
        setventassiete(ventassiete);
    }
    
    double calcularPromedio(){
        return (ventasuno + ventasdos + ventastres + ventascuatro + ventascinco +  ventasseis +  ventassiete) / 7;
    }
}
