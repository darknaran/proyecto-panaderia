public class Panaderia
{
    private final String nit;
    private String nombrePanaderia;
    private String direccion;
    private Pan[] panes;
    private int numpanes;
    
    public Panaderia(String nit,String nombrePanaderia,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombrePanaderia(nombrePanaderia);
        setDireccion(direccion);        
        panes = new Pan[5];
        numpanes = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreColegio(){
        return nombrePanaderia;
    }
    public void setNombrePanaderia(String nombrePanaderia){
        if(nombrePanaderia != null){
            this.nombrePanaderia = nombrePanaderia;
        }else{
            this.nombrePanaderia = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumpanes(){
        return numpanes;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numpanes; i++){
            promedio = promedio + panes[i].calcularPromedio() / numpanes;
        }
        return promedio;
    }
    
    public void adicionarPan( String nombre, double ventauno, double ventados, double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete){
        Pan se = new Pan( nombre, ventauno, ventados, ventatres,ventacuatro,ventacinco,ventaseis,ventasiete);
        panes[numpanes] = se;
        numpanes++;
    }
}  

