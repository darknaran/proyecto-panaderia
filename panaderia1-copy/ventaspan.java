import java.util.Scanner;
public class ventaspan
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroPanes = 0, opcionMenu = 0;
        Panaderia[] lospanes = new Panaderia[5];
        String nombrepan;
        double ventasuno, ventasdos, ventastres,ventascuatro,ventascinco,ventasseis,ventassiete;
        double promedio = 0;
        while(opcionMenu != 3){
            System.out.println("\nMenu de Opciones: ");
            System.out.println("1. Adicionar un tipo de pan: ");
            System.out.println("2. calcular Promedio de ventas: ");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
                System.out.println("Digite el nombre del pan:  ");
                nombrepan = sc.next();
                System.out.println("Digite la venta del dia lunes del  pan: ");
                ventasuno = sc.nextDouble();
                System.out.println("Digite la venta del dia Martes del  pan: ");
                ventasdos = sc.nextDouble();
                System.out.println("Digite la venta del dia Miercoles del  pan: ");
                ventastres = sc.nextDouble();
                System.out.println("Digite la venta del dia jueves del  pan: ");
                ventascuatro = sc.nextDouble();
                System.out.println("Digite la venta del dia Viernes del  pan: ");
                ventascinco = sc.nextDouble();
                System.out.println("Digite la venta del dia Sabado del  pan: ");
                ventasseis = sc.nextDouble();
                System.out.println("Digite la venta del dia Domingo del  pan: ");
                ventassiete = sc.nextDouble();
                Panaderia unPanaderia = new Panaderia(nombrepan,ventasuno,ventasdos,ventastres,ventascuatro,ventascinco,ventasseis,ventassiete);
                lospanes[numeroPanes] = unPanaderia;
                numeroPanes++;
            }
            else if(opcionMenu==2){
                for(int i = 0; i < numeroPanes; i++){
                    promedio = promedio + lospanes[i].calcularPromedio() / numeroPanes;       
                }
                System.out.println("\n El Promedio de la venta de panes  es: "+ promedio);
            }
        }
    
    }

}