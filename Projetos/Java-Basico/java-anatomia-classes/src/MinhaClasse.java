import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
       // System.out.print("ola pessoal");
        //#region exemplos
        // Final bloqueia a var -------
        final String BR = "Brasil";
        //BR = "Brazil"; ~nao da~

        // Var pode ter letra, num de 0 a 9 e _ $
        // Nome da var n pode começar com número
        //ex:
        // int 1numero

        String primeiroNome = "Felipe";
        String segundoNome = "Fantato";

        String nomecompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomecompleto);
        int numero = 3;
        qualNumero(numero);
        //#endregion


        //inicia um objeto de scann
    Scanner scan = new Scanner(System.in);


        int qntPares = 0;
        int qntImpares = 0;
        int numeros;
    for(int i = 0; i < 3; i++){
        System.out.println("\n Número:");
        numeros = scan.nextInt();
        if(numeros % 2 == 0) qntPares++;
        else qntImpares++;

    }
    System.out.println("Quantidade Impares = " + qntImpares);
    System.out.println("Quantidade pares = " + qntPares);

    System.out.println("\n Fatorial de: ");
    int fatorialnum = 0;
    fatorialnum = scan.nextInt();
    int numFinal = 1;
    for(int i = fatorialnum; i > 0; i--){
        numFinal = numFinal * i;
    }
    System.out.println("o Fatorial é: " + numFinal);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    //#region Uso Switch
    private static void qualNumero(int numero){
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Numero entre 1 a 3");
                break;
            case 4:
                System.out.println("numero 4");
                break;
                
            default:
                System.out.println("Valor indefinido!");
                break;
        }
    }
    //#endregion
    
    
}
