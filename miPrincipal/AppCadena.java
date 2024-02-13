package miPrincipal;
public class AppCadena{
    public static void menu() throws PosicionIlegalException  {
        System.out.println("***********************");
        System.out.println("OPERACIONES CON CADENA");
        System.out.println("***********************");
        Cadena c = new Cadena();
        c.agregarFinal('K');
        c.agregarFinal('a');
        c.agregarFinal('r');
        c.agregarFinal('e');
        c.agregarFinal('n');
        System.out.println("Valor de Cadena c :"+c.toString());
        System.out.println("Valor de Cadena c Invertida: " +c.invertir());
        c.borrarInicio();
        System.out.println("Valor de Cadena c :"+c);
    }
}