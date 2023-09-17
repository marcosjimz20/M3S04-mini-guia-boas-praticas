package org.example;

// TODO  Ex 2 - CodeReview 2: Faça um CodeReview (utilizando comentários indicando melhorias)
//  para o código do Slide “DRY (Don’t Repeat Yourself)” da Aula 1.

public class Exercicio2 {

    public static void main(String[] args) {

    }

// Para customizar é possível reduzir está lógica num método só, exemplo: usando um switch/case para especificar o tipo de serviço de cada um dos métodos
// Também é seria ótimo criar variaveis para cada serviço e onde cada uma receba seus respectivos valores, exemplo:
// public double TaxaServ = 10.00;
// public double Hosp = 350.00;
// public double Cafe = 30.00;
// public double Almoço = 70.00;
// public double Janta = 80.00;
// public double VIP = 500.00;
    public static int ServClasseD() {
        //TaxaServ + Hosp
        return 10+350;

// O tipo de retorno seria o seguinte: return TaxaServ + Hosp;
    }

    public static int ServClasseC() {
        //TaxaServ + Hosp + Cafe + Almoço
        return 10+350+30+70;

// O tipo de retorno seria o seguinte: return TaxaServ + Hosp + Cafe + Almoço;
    }

    public static int ServClasseB() {
        //TaxaServ + Hosp + Cafe + Almoço + Janta
        return 10+350+30+70+80;

// O tipo de retorno seria o seguinte: return TaxaServ + Hosp + Cafe + Almoço + Janta;
    }

    public static int ServClasseA() {
        //TaxaServ + Hosp + Cafe + Almoço + Janta + VIP
        return 10+350+30+70+80+500;

// O tipo de retorno seria o seguinte: return TaxaServ + Hosp + Cafe + Almoço + Janta + VIP;
    }



}
