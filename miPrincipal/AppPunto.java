package miPrincipal;
public class AppPunto{
    public static void menu(){
        System.out.println("****************************");
        System.out.println("    OPERACIONES CON PUNTO   ");
        System.out.println("****************************");
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        p1.leer();
        p1.despliega();
        p2.leer();
        p2.despliega();
        System.out.println("Distancia entre punto:"+);
    }
}