package miPrincipal;
public class Matriz{
    private int n,m;
    private int matriz[][];

    public Matriz(){
        matriz = new int[10][10];
        n = 10;
        m = 10;
    }
    public Matriz(int n, int m) throws PosicionIlegalException{
        if(n<0 || m<0){
            throw new PosicionIlegalException();
        }
        matriz = new int[n][m];
        this.n=n;
        this.m=m;


    }
}