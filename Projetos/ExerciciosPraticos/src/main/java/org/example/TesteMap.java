package org.example;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class TesteMap {



    public TesteMap() {

    }

    public static void funcaoMapa(){
        Map<String, Integer> estadosBrasil = new HashMap<>(){{
            put("PE", 9);
            put("AL", 8);
            put("CE", 10);
            put("RN", 7);

        }};
        System.out.println(estadosBrasil);
        System.out.println(estadosBrasil.get("PE"));
        estadosBrasil.put("PE", 2);
        System.out.println(estadosBrasil.get("PE"));

        if(!estadosBrasil.containsKey("PB")){
            estadosBrasil.put("PB", 6);
            System.out.println(estadosBrasil.get("PB"));
        }
        System.out.println(estadosBrasil.get("PE"));

        //----------------------------------------


        System.out.println("------------------------------------ \n");
        Set<String> estados = estadosBrasil.keySet();
        System.out.println(estados);

        Integer maiorPopulacao = Collections.max(estadosBrasil.values());

        Set<Map.Entry<String, Integer>> entries = estadosBrasil.entrySet();
        String estadoMaisPopuloso = "";

        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue().equals(maiorPopulacao))
                estadoMaisPopuloso = entry.getKey();
        }
        System.out.println("Estado mais populosoo é: "+ estadoMaisPopuloso);

        Integer menorPopulacao = Collections.min(estadosBrasil.values());
        String estadoMenosPopuloso = "";
        for(Map.Entry<String, Integer> entry : estadosBrasil.entrySet()){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado menos populoso é: "+estadoMenosPopuloso);
            }
        }

        Iterator<Integer> iterator = estadosBrasil.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("a soma é: " + soma);


        Iterator<Integer> iterator1 = estadosBrasil.values().iterator();

        while (iterator1.hasNext()){
           if(iterator1.next().equals(2)) iterator1.remove();
        }


        Map<String, Integer> estadosBrasil1 = new LinkedHashMap<>(){{
            put("PE", 9);
            put("AL", 8);
            put("CE", 10);
            put("RN", 7);

        }};
        System.out.println(estadosBrasil1);

        Map<String, Integer> estadosOrdenado = new TreeMap<>(){{
            put("PE", 20);
            put("AL", 10);
            put("CE", 30);
            put("RN", 40);
        }};
        System.out.println(estadosOrdenado);

        // n esta retornando um valor? o set no caso
        /*Set<Map.Entry<String, Integer>> set = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });
        for(Map.Entry<String, Integer> entry: set){
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }*/

        List<String> numerosAleatorios = Arrays.asList("1","4","2","7","9","3","6");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros elementos e coloque dentro de um Set:");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        System.out.println("Transforme esta lista de String em uma lista de números inteiros. ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        collectList
                .forEach(System.out::println);

        System.out.println("Pegue os numeors pares e maiores que 2 e coloqeu em uma lista: ");
        List<Integer> listParesMaioresque2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i ->(i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresque2);


        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        collectList.removeIf(integer ->(integer%2 != 0));

        System.out.println(collectList);
        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);



        //fim
    }}
