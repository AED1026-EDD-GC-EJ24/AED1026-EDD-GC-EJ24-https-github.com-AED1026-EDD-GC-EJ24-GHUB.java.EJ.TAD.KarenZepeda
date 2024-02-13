package miPrincipal;

public class Conjunto{
    static int M = 20;
    private Object cto[];
    private int cardinal;
    private int capacidad;

    public Conjunto(){
        cto = new Object[M];
        cardinal =0;
        capacidad = M;
    }
    //Determinar si el conjunto esta vacio
    public boolean esVacio(){
        return (cardinal==0);
    }
    //Añadir un elemento si no esta en el cojunto
    public void añadir(Object elemento){
        if (!pertenece(elemento)){
            //verificar si hay posiciones libres, sino amplio el conjunto
            if(cardinal == capacidad){
                Object [] nuevoCto;
                nuevoCto = new Object[capacidad+M];
                for (int k=0;k<capacidad; k++){
                    nuevoCto[k]=cto[k];
                }
                capacidad+=M;
                cto = nuevoCto;
            }
            cto[cardinal++] = elemento;
        }
    }
    public void retirar(Object elemento){
        if(pertenece(elemento)){
            int k=0;
            //busca en que posicion se encuentra el elemento
            while(!cto[k].equals(elemento))
                k++;
            //desde el elememto k hasta la ultima posicion muevo los elementos una posicion a la izquierda
            for(;k<cardinal; k++)
                cto[k]= cto[k+1];
            cardinal--;
            
        }
    }
    //Buscar si un elemento pertenece al conjunto
    public boolean pertenece(Object elemento){
        int k=0;
        boolean encontrado = false;
        while(k<cardinal && !encontrado){
            encontrado = cto[k].equals(elemento);
            k++;
        }
        return encontrado;
    }
    public int cardinal(){
        return this.cardinal;
    }
    //Operacion de union de dos conjuntos
    public Conjunto union(Conjunto c2){
        Conjunto u= new Conjunto();
        for(int k =0; k<cardinal;k++)
            u.cto[k]=this.cto[k];
        u.cardinal = cardinal;
        for(int k=0; k<c2.cardinal;k++)
            u.añadir(c2.cto[k]);
        return u;
    }
    public Object elemento(int n) throws Exception{
        if (n<=cardinal)
           return cto[--n];
        else
           throw new Exception("Fuera de Rango");
        
    }

}