package org.example;
import java.util.Scanner;
public class CalculaArea {

    public static float area(int a, int b){
        return a * b;
    }
    public static float area(int B, int c, int h){
        return ((B + c) * h)/2;
    }

    public static int calculaCarro(int custoFabrica, int porcDistri, int PercImp){
        int custoConsumidor = 0;

        int Distribuidor= 0;
        int ValorImpostos = 0;


        Distribuidor = (custoFabrica * porcDistri) / 100;
        System.out.println(Distribuidor + "DIstribuidora final");
        ValorImpostos = (custoFabrica * PercImp) / 100;
        System.out.println(ValorImpostos + "Imposto final");

        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
        return custoConsumidor;
    }
}
