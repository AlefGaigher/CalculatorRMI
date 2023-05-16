package com.mycompany.calculadorarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    int somar(int a, int b) throws RemoteException;
    int subtrair(int a, int b) throws RemoteException;
}
