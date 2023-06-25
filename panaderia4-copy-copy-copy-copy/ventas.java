

import java.util.Scanner;
public class ventas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numPanes;
        Panaderia miPanaderia = new Panaderia("1480","IED MartinezSanches","Bosa");
        String nombre;
        double ventas1, ventas2, ventas3,ventas4,ventas5,ventas6,ventas7;
        double promedio = 0;
        
        System.out.println("Digite el numero de panes: ");
        numPanes = sc.nextInt();
        
        for(int i = 0; i < numPanes; i++){
            System.out.println("Digite el nombre del pan: ");
            nombre = sc.next();
            System.out.println("Digite las ventas del dia lunes: ");
            ventas1 = sc.nextDouble();
            System.out.println("Digite las ventas del dia martes: ");
            ventas2 = sc.nextDouble();            
            System.out.println("Digite las ventas del dia miercoles: ");
            ventas3 = sc.nextDouble();
            System.out.println("Digite las ventas del dia jueves: ");
            ventas4= sc.nextDouble();
            System.out.println("Digite las ventas del dia viernes: ");
            ventas5= sc.nextDouble();
            System.out.println("Digite las ventas del dia sabado: ");
            ventas6= sc.nextDouble();
            System.out.println("Digite las ventas del dia domingo: ");
            ventas7= sc.nextDouble();
            miPanaderia.adicionarPan(nombre, ventas1, ventas2, ventas3,ventas4,ventas5,ventas6,ventas7);
        }
        
        promedio = miPanaderia.calcularPromedioGeneral();        
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}
