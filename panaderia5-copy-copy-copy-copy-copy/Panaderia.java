public class Panaderia
{
    private final String nit;
    private String nombrePanaderia;
    private String direccion;
    private Pannormal[] pan1;
    private Pandulce[] pan2;
    private Pangrande[] pan3;    
    private int numpan1;
    private int numpan2;
    private int numpan3;    
    
    public Panaderia(String nit,String nombreColegio,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombrePanaderia(nombrePanaderia);
        setDireccion(direccion);        
        pan1 = new Pannormal[4];
        pan2 = new Pandulce[5];
        pan3 = new Pangrande[3];        
        numpan1 = 0;
        numpan2 = 0;
        numpan3 = 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombrePaderia(){
        return nombrePanaderia;
    }
    public void setNombrePanaderia(String nombrePanderia){
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
    
    public int getNumPan1(){
        return numpan1;
    }
    
    public int getNumPan2(){
        return numpan2;
    }
    
    public int getNumPan3(){
        return numpan3;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numpan1; i++){
            promedio = promedio + pan1[i].calcularPromedio() / numpan1;
        }
        for(int i = 0; i < numpan2; i++){
            promedio = promedio + pan2[i].calcularPromedio() / numpan2;
        }
        for(int i = 0; i < numpan3; i++){
            promedio = promedio + pan3[i].calcularPromedio() / numpan3;
        }
        return promedio / 3;
    }
    public void adicionarPannormal( String nombre, double ventasuno, double ventasdos, double ventastres, double ventascuatro, double ventascinco, double ventasseis, double ventassiste){
        pan1[numpan1] = new Pannormal( nombre,  ventasuno, ventasdos,ventastres,ventascuatro,ventascinco,ventasseis,ventassiste);
        numpan1++;
    }
    
    public void adicionarPandulce(String nombre, double ventasuno, double ventasdos, double ventastres,double ventascuatro, double ventascinco,double ventasseis, double ventassiste){
        pan2[numpan2] = new Pandulce( nombre,  ventasuno, ventasdos,ventastres,ventascuatro,ventascinco,ventasseis,ventassiste);
        numpan2++;
    }
    
    public void adicionarPangrande(String nombre, double ventasuno, double ventasdos, double ventastres,double ventascuatro, double ventascinco,double ventasseis, double ventassiste){
        pan3[numpan3] = new Pangrande( nombre,  ventasuno, ventasdos,ventastres,ventascuatro,ventascinco,ventasseis,ventassiste);
        numpan3++;
    }
}    

