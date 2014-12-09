package server.calculator;

import java.rmi.Remote;

/**
 * Created by Squall on 08/12/2014.
 */
public interface CalculatorService extends Remote {

    public double echoCalc(int n1, int n2, String op);

}
