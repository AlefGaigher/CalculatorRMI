package com.mycompany.calculadorarmi;

import java.rmi.Naming;

public class CalculadoraClient {

    public static void main(String[] args) {
        try {
            Calculadora calculadora = (Calculadora) Naming.lookup("rmi://localhost/CalculadoraService");

            int resultadoSoma = calculadora.somar(5, 3);
            System.out.println("Resultado da soma: " + resultadoSoma);

            int resultadoSubtracao = calculadora.subtrair(10, 4);
            System.out.println("Resultado da subtração: " + resultadoSubtracao);
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.getMessage());
        }
    }
}
