package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int cont = 0;
      //  float aux = 0;
      //  Scanner leitor = new Scanner(System.in);
       // List<Float> list = new ArrayList<Float>();
       // float nPositivos = 0;
      //  float media = 0;
      //  int i2 = 0;
      //  while( i2 < 6 ){

      //          aux = Float.parseFloat(leitor.next());
      //          list.add(aux);
       //      i2++;
//
       // }

       // for(int i = 0; i< list.size(); i++){
       //     if(list.get(i) > 0){
       ///         cont++;
       //         nPositivos += list.get(i);
       //     }
       // }
       // media = nPositivos/ cont;
       // System.out.println(cont + " valores positivos");
       // System.out.println(String.format("%.1f", media));
        //metodu();
       // metodo2();
        TesteMap.funcaoMapa();
    }

    public static void metodu(){

        double h = 1;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (double i = 1; i <= n; i++) {
            System.out.println("" +h);
            h += (1/i);
        }
        int r = (int)Math.floor(h);
        //System.out.print(h);
        if(n == 1){
            System.out.println(1);
        }else{
            System.out.println(r);
        }
    }
    public static void metodo2(){
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
            if (i == N) System.out.println(anterior);
            else System.out.print(anterior + " ");


            proximo = anterior + atual;
            anterior = atual;
            atual =  proximo;
        }

    }






}
