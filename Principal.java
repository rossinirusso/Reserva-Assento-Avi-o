package Aviao;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o número do voô:");
        String voo = entrada.nextLine();
        
       Voo V = new Voo(voo);

       System.out.println("Deseja reservar um assento? (1:Sim | 2:Não):");
       int reservar = entrada.nextInt();

       while(reservar==1){
        System.out.println("Qual assento deseja reservar?");
        System.out.println("Coluna (1 a 20)");
        int coluna = entrada.nextInt();
        System.out.println("Fileira (A a E)");
        char fileira = entrada.next().charAt(0);
        
        V.addR(new Assento(coluna,fileira));
        System.out.println("Assento reservado com sucesso!");
        System.out.println("Deseja reservar outro assento?(1:Sim | 2:Não):");
        reservar = entrada.nextInt();

       }

      

        V.relatorio();

        
        
    }
    
}
