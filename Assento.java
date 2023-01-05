package Aviao;

public class Assento {

    private int n;
    private char fileira;

    public Assento(int n, char fileira){
        this.n=n;
        this.fileira = fileira;
    }

    public int getN(){
        return n;

    }
    
    public char getFileira(){
        return fileira;
    }
}
