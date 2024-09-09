package Operation;

public class Sumar extends Operacion {


    @Override
    public void operar(float num1, float num2) {

        float resultado = num1 + num2;

        System.out.print("La suma es: "+resultado);
    }
}
