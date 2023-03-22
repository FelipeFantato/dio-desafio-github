package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DIO {

    //public static void main(String[] args) throws IOException {

        double media = 0;
        double x;



        public static void faztudo(){
            int cont = 0;
            float aux = 0;
            Scanner leitor = new Scanner(System.in);
            List<Float> list = new ArrayList<Float>();
            float nPositivos = 0;
            float media = 0;

            for(int i = 0; i <= 6; i++){
                aux = Float.parseFloat(leitor.next());
                list.add(aux);
            }

            for(int i = 0; i<= list.size(); i++){
                if(list.get(i) > 0){
                    cont++;
                    nPositivos += list.get(i);
                }
            }
            media = nPositivos/ cont;
            System.out.println(cont + " valores positivos");
            System.out.println(String.format("%.1f", media));
        }

    }

