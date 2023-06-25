import java.util.Scanner;
public class Ventas{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Panaderia miPanaderia = new Panaderia("1480","IED MartinezSanches","Bosa");
        String nombre;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de panes de tipo normal: ");
        int numPan1 = sc.nextInt();
        for(int i = 0; i < numPan1; i++){
            double ventas1,ventas2,ventas3,ventas4,ventas5,ventas6,ventas7;
            System.out.println("Digite el nombre del pan: ");
            nombre = sc.next();
            System.out.println("Digite las ventas del dia lunes: ");
            ventas1 = sc.nextDouble();
            System.out.println("Digite las ventas del dia martes: ");
            ventas2 = sc.nextDouble();
            System.out.println("Digite las ventas del dia miercoles: ");
            ventas3 = sc.nextDouble();
            System.out.println("Digite las ventas del dia jueves: ");
            ventas4 = sc.nextDouble();
            System.out.println("Digite las ventas del dia viernes: ");
            ventas5 = sc.nextDouble();
            System.out.println("Digite las ventas del dia sabado: ");
            ventas6 = sc.nextDouble();
            System.out.println("Digite las ventas del dia domingo: ");
            ventas7 = sc.nextDouble();
            miPanaderia.adicionarPannormal(nombre, ventas1,ventas2,ventas3,ventas4,ventas5,ventas6,ventas7);
        }
                
        System.out.println("Digite el numero de estudiantes de Colegio: ");
        int numpan2 = sc.nextInt();
        for(int i = 0; i < numpan2; i++){
            double ventas1,ventas2,ventas3,ventas4,ventas5,ventas6,ventas7;
            System.out.println("Digite el nombre del pan: ");
            nombre = sc.next();
            System.out.println("Digite las ventas del dia lunes: ");
            ventas1 = sc.nextDouble();
            System.out.println("Digite las ventas del dia martes: ");
            ventas2 = sc.nextDouble();
            System.out.println("Digite las ventas del dia miercoles: ");
            ventas3 = sc.nextDouble();
            System.out.println("Digite las ventas del dia jueves: ");
            ventas4 = sc.nextDouble();
            System.out.println("Digite las ventas del dia viernes: ");
            ventas5 = sc.nextDouble();
            System.out.println("Digite las ventas del dia sabado: ");
            ventas6 = sc.nextDouble();
            System.out.println("Digite las ventas del dia domingo: ");
            ventas7 = sc.nextDouble();
            miPanaderia.adicionarPandulce(nombre, ventas1,ventas2,ventas3,ventas4,ventas5,ventas6,ventas7);
        }
        
        System.out.println("Digite el numero de estudiantes de Tecnico: ");
        int numpan3 = sc.nextInt();
        for(int i = 0; i < numpan3; i++){
            double ventas1,ventas2,ventas3,ventas4,ventas5,ventas6,ventas7;            
            System.out.println("Digite el nombre del pan: ");
            nombre = sc.next();
            System.out.println("Digite las ventas del dia lunes: ");
            ventas1 = sc.nextDouble();
            System.out.println("Digite las ventas del dia martes: ");
            ventas2 = sc.nextDouble();
            System.out.println("Digite las ventas del dia miercoles: ");
            ventas3 = sc.nextDouble();
            System.out.println("Digite las ventas del dia jueves: ");
            ventas4 = sc.nextDouble();
            System.out.println("Digite las ventas del dia viernes: ");
            ventas5 = sc.nextDouble();
            System.out.println("Digite las ventas del dia sabado: ");
            ventas6 = sc.nextDouble();
            System.out.println("Digite las ventas del dia domingo: ");
            ventas7 = sc.nextDouble();           
            miPanaderia.adicionarPangrande(nombre, ventas1,ventas2,ventas3,ventas4,ventas5,ventas6,ventas7);
        }
        
        promedio = miPanaderia.calcularPromedioGeneral();
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}