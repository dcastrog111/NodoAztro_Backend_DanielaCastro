package Operation;

public class Dividir extends Operacion{


    @Override
    public void operar(float num1, float num2) {

        if(num2 == 0){
            System.out.print("La división es: NO SE PUEDE DIVIDIR POR CERO");
        } else{
            float resultado = num1 / num2;
            System.out.print("La división es: "+resultado);
        }


    }
}
