/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

//import com.crio.qcalc.ScientificCalculator;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
              //standard calc
        // System.out.println(new App().getGreeting());
        // StandardCalculator calc = new StandardCalculator();
        // calc.add(1,1);
        // System.out.println("Addition: "+calc.getResult());
        // calc.clearResult();
        // calc.printResult();
        // calc.multiply(3,4);
        // System.out.println("Multiplication: "+calc.getResult());
        // calc.clearResult();
        // calc.printResult();

             //Scientific calc
        ScientificCalculator sc_calc = new ScientificCalculator();
        System.out.println(new App().getGreeting());
        System.out.println("Cube: "+sc_calc.cubeOf(3.0));
        int result= sc_calc.modulo(5, 2);
        System.out.println("modulo =" + result);

    }
}
