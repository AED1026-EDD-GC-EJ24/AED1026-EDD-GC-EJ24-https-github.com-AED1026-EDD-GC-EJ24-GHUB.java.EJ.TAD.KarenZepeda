package miPrincipal;
public class AppConjunto{
    public static void menu() throws Exception{
        System.out.println("********************************");
        System.out.println("    Operaciones con conjuntos   ");
        System.out.println("********************************");
        Conjunto A = new Conjunto();
        if(A.esVacio())
            System.out.println("El conjunto A esta vacio");
        System.out.println("El conjunto A tiene "+A.cardinal()+" elementos");
        //Añadir elementos al conjunto
        A.añadir("A");
        A.añadir("B");
        A.añadir("C");
        if(A.esVacio())
            System.out.println("El conjunto A esta vacio");
        else 
            System.out.println("El conjunto A no esta vacio");
        System.out.println("El conjunto A tiene "+A.cardinal()+" elementos");
        Conjunto B= new Conjunto();
        B.añadir("E");
        B.añadir("F");
        if(B.esVacio())
            System.out.println("El conjunto B esta vacio");
        else 
            System.out.println("El conjunto B no esta vacio");
        System.out.println("El conjunto B tiene "+B.cardinal()+" elementos");
        Conjunto C= new Conjunto();
        C=A.union(B);
        System.out.println("El conjunto C tiene "+C.cardinal()+" elementos");
        C.retirar("A");
        System.out.println("El conjunto C tiene "+C.cardinal()+" elementos");
        System.out.println("Elemento 1= "+ C.elemento(1));
        System.out.println("Elemento 1= "+ C.elemento(2));
        System.out.println("Elemento 1= "+ C.elemento(3));
        System.out.println("Elemento 1= "+ C.elemento(4));
        System.out.println("Elemento 1= "+ C.elemento(5));
    }
}