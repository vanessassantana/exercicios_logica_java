package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 3){
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            System.out.println("Digite a sua opção");
            opcao = teclado.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
