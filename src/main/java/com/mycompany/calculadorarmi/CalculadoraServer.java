package com.mycompany.calculadorarmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {

    public static void main(String[] args) {
        try {
            Calculadora calculadora = new CalculadoraImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("CalculadoraService", calculadora);
            System.out.println("Servidor RMI pronto.");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
        }
    }
}
