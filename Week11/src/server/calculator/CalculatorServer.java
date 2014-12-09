package server.calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Squall on 08/12/2014.
 */
public class CalculatorServer extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServer() throws RemoteException
    {

    }

    @Override
    public double echoCalc(int n1, int n2, String op)
    {
        System.out.println("Sent Calculator Reference to Client");
        return 4.4; //temp
    }

    public double compute(int n1, int n2, String op)
    {
        switch (op)
        {

        }
    }

}
