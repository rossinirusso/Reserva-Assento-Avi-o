package Aviao;

import java.util.ArrayList;

public class Voo {
    private String id;
    private ArrayList<Assento> A;

    public Voo(String id){
        this.id=id;
        A = new ArrayList<>();

    }

    public void addR(Assento x){
        A.add(x);
    }
    

    public void relatorio(){
        char fileiras[] = new char[]{'A','B','C','D','E','F'};
        int cont = 0;
        
        System.out.println("###### Assentos disponíveis ######");
        System.out.printf("Voo: %s",id);

        for(int i=1;i<=20;i++){
            System.out.println();
            for(int j=0;j<6;j++){
                cont = 0;
                System.out.print(" ");
                for (Assento a : A) {
                    if(a.getFileira()==fileiras[j]&&a.getN()==i){
                        System.out.print("X");
                        cont++;
                
                    }
                    
                    
                }
                if(cont==0){
                    System.out.printf("%d%s",i,fileiras[j]);
                }

            }
        }

    }
    
}
