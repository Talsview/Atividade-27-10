package model;

public class Calculadora{
    public double dividir(double num1, double num2) throws ArithmeticException {
        if(num2 == 0){
            throw new ArithmeticException("Não e possivel dividir por zero!");
        }
         return num1 / num2;
    }
    public double multiplicar(double num1, double num2) throws ArithmeticException {
      return num1 * num2;
    }
    public double Adição(double num1, double num2) throws ArithmeticException {
         return num1 + num2;
    }
    public double Subtração(double num1, double num2) throws ArithmeticException {
        if(num1 < num2){
            throw new ArithmeticException("O primeiro numero nao pode ser menor que o segundo");
        }   
         return num1 - num2;
    }
}