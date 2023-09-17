package org.example;

//TODO  Ex 1 - CodeReview 1: Faça um CodeReview (utilizando comentários indicando melhorias)
// para o código do Slide “Regra de Escoteiro” da Aula 1.


public class Exercicio1 {
    public static void main(String[] args) {


// Trocar o nome do método "processo" dentro do console para outro que tenha mais sentido, como: "calcularPercentual"
        System.out.println("Valor percentual: " + processo(120, 20));
    }

    // Trocar o nome do método "processo" para: "calcularValorPercentual"
// Trocar o nome dos parâmetros para outros que tenham mais sentido, como: (double "pValor", double "pPercentual")
    public static double processo(double x, double y) {
        double resultado = 0;
        resultado = x * (y / 100);
        return resultado;

// A lógica deste método pode ser reduzida para um código mais enxuto, exemplo:
// return x * (y/100);
    }


}