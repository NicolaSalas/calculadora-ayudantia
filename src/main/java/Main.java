import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


        private static double a;
        private static double b;
    static Calculadora calc1 = new Calculadora();
    static Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            completo:
            while(true){
            System.out.println("Bienvenido a la super hiper mega calculadora");
            cambiarValoresAyB();
            System.out.println("A: "+a+" B: "+b+" ¿Que operacion desea realizar\n");
            System.out.println("Las opciones son: ");
            System.out.println("1. Sumar A y B");
            System.out.println("2. Restar A y B");
            System.out.println("3. Multiplicar A y B");
            System.out.println("4. Divir A y B");
            System.out.println("5. Cambiar valores de A y B");

            String opcion = in.nextLine();

            switch (opcion){
                case "1": //sumar
                    hacerSuma();
                    break;
                case "2": //restar
                    hacerResta();
                    break;
                case "3": //multiplicar
                    hacerMultiplicacion();
                    break;
                case "4": //division
                    hacerDivision();
                case "5":
                    cambiarValoresAyB();
                    break;
                case "0":
                    System.out.println("adios");
                    break completo;

                default:
                    break;

            }
        }
    }
        public static void  cambiarValoresAyB(){
            try{
            System.out.println("Ingrese el valor de A");
            a = in.nextDouble();
            System.out.println("Ingrese el valor de B");
            b = in.nextDouble();
        }catch(Exception e){
                System.out.println("Error: entrada no valida");
                cambiarValoresAyB();
            }
            if(in.hasNextLine()) in.nextLine();
        }
        public static void hacerSuma(){
            //1. Validar si a y b son aptas para hacer la suma (si que fuera necesario)
            //2. usar metodo sumar callpasando los valores a y b, y almacenar el resultado
            //3. Mostrar en pantalla el resultado
            double resultado = calc1.sumar(a,b);
            System.out.println(a+"+"+b+"="+resultado);
        }
        public static void  hacerResta(){
            double resultado = calc1.restar(a,b);
            System.out.println(a+"-"+b+"="+resultado);
        }
    public static void  hacerDivision(){
        if(b == 0){
            System.out.println("Error: b no puede ser 0, cambia el valor de b ");
            return;
            //if(b != 0) {
            //      double resultado = calc1.division(a,b);
            //      System.out.println(a+"-"+b+"="+resultado);
            // }else(
    }
        double resultado = calc1.division(a,b);
        System.out.println(a+"-"+b+"="+resultado);
    }
    public static void  hacerMultiplicacion(){
        double resultado = calc1.multiplicacion(a,b);
        System.out.println(a+"-"+b+"="+resultado);

    }

}
