import java.util.Scanner;

public class App {
    


    public static void main(String[] args) throws Exception {
        
        // Operadores Aritiméticos
        System.out.println("O resultado é: " + Operadores.add(10, 5));
        System.out.println("O resultado é: " + Operadores.sub(10, 5));
        System.out.println("O resultado é: " + Operadores.mult(10, 5));
        System.out.println("O resultado é: " + Operadores.div(10, 5));
        
        // Operadores de Atribuição
        System.out.println();
        System.out.println(10.0 + " + 1: " + Operadores.addOne(10));
        System.out.println(10.0 + " - 1: " + Operadores.subOne(10));
        System.out.println(10.0 + " * 2: " + Operadores.multTwo(10));
        System.out.println(10.0 + " / 2: " + Operadores.divTwo(10));

        
        // Operadores Logicos
        System.out.println();
        System.out.println("X e Y é maior que 0: " + Operadores.and(10, 15));
        System.out.println("X ou Y é maior que 0: " + Operadores.or(10, 15));
        System.out.println("X ou apenas Y é maior que 0: " + Operadores.exclusion(10, 15));
        System.out.println("X não é maior que 0: " + Operadores.not(10));
        

        // Operadores de Comparação
        System.out.println();
        System.out.println("X é maior que Y: " + Operadores.maior(10, 15));
        System.out.println("X é maior igual que Y: " + Operadores.maiorIgual(10, 15));
        System.out.println("X é menor que Y: " + Operadores.menor(10, 15));
        System.out.println("X é menor igual que Y: " + Operadores.menorIgual(10, 15));
        System.out.println("X é igual que Y: " + Operadores.igual(10, 15));
        System.out.println("X é diferente que Y: " + Operadores.diferente(10, 15));
    }
}
