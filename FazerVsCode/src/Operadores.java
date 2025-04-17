public class Operadores {
    // Classe static
    
// Operadores Ariméticos

    // Soma
    public static float add(float x, float y ){
        return x+y;
    }

    // Subtração
    public static float sub(float x, float y ){
        return x-y;
    }

    // Multiplicação
    public static float mult(float x, float y ){
        return x*y;
    }

    // Divisão
    public static float div(float x, float y ){
        return x/y;
    }
    // Resto
    public static float mod(float x, float y ){
        return x%y;
    }
    
    
    
// Operadores atribuição
    // Adiciona 1 no x
    public static float addOne(float x){
        x += 1;
        return x;
    }
    // Subtrai 1 no x
    public static float subOne(float x){
        x -= 1;
        return x;
    }
    // Multplica x por 2
    public static float multTwo(float x){
        x *= 2;
        return x;
    }
    // Divide x por 2
    public static float divTwo(float x){
        x /= 2;
        return x;
    }
    


// Operadores lógicos
    // Verifica se x e y é maior que 0
    public static boolean and(float x, float y){
        return x > 0 & y > 0;
    }
    // Verifica se x ou y é maior que 0
    public static boolean or(float x, float y){
        return x > 0 | y > 0;
    }
    // Verifica se apenas uma condição é verdadeira
    public static boolean exclusion(float x, float y){
        return x > 0 ^ y > 0;
    }
    // Verifica se x não é maior que 0
    public static boolean not(float x){
        return !(x > 0);
    }


// Operadores de comparação
    // Verifica se x é maior que y
    public static boolean maior(float x, float y ){
        return x>y;
    }
    // Verifica se x é maior igual que y
    public static boolean maiorIgual(float x, float y ){
        return x>=y;
    }
    // Verifica se x é menor que y
    public static boolean menor(float x, float y ){
        return x<y;
    }
    // Verifica se x é menor igual que y
    public static boolean menorIgual(float x, float y ){
        return x<=y;
    }
    // Verifica se x é igual que y
    public static boolean igual(float x, float y ){
        return x==y;
    }
    // Verifica se x é diferente que y
    public static boolean diferente(float x, float y ){
        return x!=y;
    }

    
    
}
