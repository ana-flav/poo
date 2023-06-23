package area;

import java.util.ArrayList;
import java.util.Scanner;

public class App_AreaCalculavel {
    public static void main(String[] args) {
        ArrayList <AreaCalculavel> figuras = new ArrayList<AreaCalculavel>();
        Scanner sc = new Scanner(System.in);
        String tipo;
        boolean flag = true;
        System.out.println("Diga as figuras que vc deseja inserir:");
        while(flag){
            tipo = sc.nextLine();
            tipo.toLowerCase();

            if(tipo.equals("circulo")){
                Circulo c = new Circulo(2);
                figuras.add(c);
            }else{
                if(tipo.equals("retangulo")){
                    Retangulo c = new Retangulo(6,3);
                    figuras.add(c);
                }else{
                    if(tipo.equals("quadrado")){
                        Quadrado c = new Quadrado(3);
                        figuras.add(c);
                        flag=false;
                    }
                }
            }
        }
        for(AreaCalculavel ac: figuras){
        System.out.println(ac.calculaArea());
    }

    }

    
}
