import java.util.Scanner;
public class ventas
{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numeropanes;
            panes[] lospanes = new panes[4];
            String nombre;
            double ventas1, ventas2, ventas3, ventas4,ventas5, ventas6, ventas7;
            double promedio = 0;
            System.out.println("Digite la cantidad de panes a vender: ");
            numeropanes = sc.nextInt();
            
            for(int i = 0; i < numeropanes; i++){
                System.out.println("Digite nombre del pan: ");
                nombre = sc.next();
                System.out.println("Digite las ventas del dia lunes del pan: ");
                ventas1 = sc.nextDouble();
                System.out.println("Digite las ventas del dia Martes del pan: ");
                ventas2 = sc.nextDouble();
                System.out.println("Digite las ventas del dia Miercoles del pan: ");
                ventas3 = sc.nextDouble();
                System.out.println("Digite las ventas del dia jueves del pan: ");
                ventas4 = sc.nextDouble();
                System.out.println("Digite las ventas del dia Viernes del pan: ");
                ventas5 = sc.nextDouble();
                System.out.println("Digite las ventas del dia Sabado del pan: ");
                ventas6 = sc.nextDouble();
                System.out.println("Digite las ventas del dia Domingo del pan: ");
                ventas7 = sc.nextDouble();
                panes unpan = new panes();
                unpan.nombre = nombre;
                unpan.ventasuno = ventas1;
                unpan.ventasdos = ventas2;
                unpan.ventastres = ventas3;
                unpan.ventascuatro = ventas4;
                unpan.ventascinco = ventas5;
                unpan.ventasseis = ventas6;
                unpan.ventassiete = ventas7;
                lospanes[i] = unpan;
            }
            for(int i = 0; i < numeropanes; i++){
                double sum =(lospanes[i].ventasuno +lospanes[i].ventasdos +lospanes[i].ventastres +lospanes[i].ventascuatro +lospanes[i].ventascinco +lospanes[i].ventasseis +lospanes[i].ventassiete)/7;
                promedio = promedio + sum / numeropanes;
            }
            System.out.println("El promedio de panes vendidos es: "+ promedio);
    }
}
