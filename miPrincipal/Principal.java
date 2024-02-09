package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception{
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("*******************");
            System.out.println("TIPOS DE DATOS ABSTRACTOS");
            System.out.println("*************************");
            System.out.println("1) Rational");
            System.out.println("2) Matriz");
            System.out.println("3) Conjunto");
            System.out.println("4) Persona");
            System.out.println("5) Fecha");
            System.out.println("6) Cadena");
            System.out.println("7) Numerote");
            System.out.println("8) Cuenta cheques");
            System.out.println("9) Punto");
            System.out.println("10) Triangulo");
            System.out.println("");
            System.out.println("0) Salir");

            opc = consola.nextInt();
            switch(opc){
                case 1:
                    AppRational.menu();
                    break;
                case 2:
                    AppMatriz.menu();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    AppCadena.menu();
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                default:
                System.out.println("Valor incorrecto, intente de nuevo");
            }
        }while(opc != 0);
    }
}