import java.util.Scanner;
public class ventas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numpanes;
        Panes[] lospanes = new Panes[4];
        String nombre;
        double ventas1, ventas2, ventas3,ventas4,ventas5,ventas6,ventas7;
        double promedio = 0;
        
        System.out.println("Digite el numero de panes: ");
        numpanes = sc.nextInt();
        
        for(int i = 0; i < numpanes; i++){
            System.out.println("Digite el nombre del tipo de pan: ");
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
            Panes unpan = new Panes(nombre,ventas1,ventas2,ventas3,ventas4,ventas5,ventas6,ventas7);
            lospanes[i] = unpan;
        }
        for(int i = 0; i < numpanes; i++)
            promedio = promedio + lospanes[i].calcularPromedio() / numpanes;
        
        System.out.println("\n El promedio de notas es: " + promedio); 
    }
}
