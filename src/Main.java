import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializar variables
        Scanner lectura  = new Scanner(System.in);
        int opcion = 0;

        //Instanciar la solicitud de Conversion
        SolicitudDeCambio solicitud = new SolicitudDeCambio();
        Calculo calculo = new Calculo(solicitud);
        //GeneradorArchivos generador = new GeneradorArchivos();

        List<String> respuestas = new ArrayList<>();

        String menu = """
                    ******************************************
                    ¡Bienvenido/a al conversor de monedas!
                    1) Dólar =>> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real Brasileño
                    4) Real Brasileño =>> Dolar
                    5) Dólar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dolar
                    7) Salir
                    
                    Elija una opción valida:
                    
                    ******************************************
                    """;

        while (opcion != 7){
            try{
                System.out.println(menu);
                opcion = Integer.parseInt(lectura.nextLine());

                switch (opcion){
                    case 1:
                        calculo.almacenaValores("USD", "ARS");
                        respuestas.add(calculo.getMensajeRespuesta());
                        break;
                    case 2:
                        calculo.almacenaValores("ARS", "USD");
                        respuestas.add(calculo.getMensajeRespuesta());
                        break;
                    case 3:
                        calculo.almacenaValores("USD", "BRL");
                        respuestas.add(calculo.getMensajeRespuesta());
                        break;
                    case 4:
                        calculo.almacenaValores("BRL", "USD");
                        respuestas.add(calculo.getMensajeRespuesta());
                        break;
                    case 5:
                        calculo.almacenaValores("USD", "COP");
                        respuestas.add(calculo.getMensajeRespuesta());
                        break;
                    case 6:
                        calculo.almacenaValores("COP", "USD");
                        respuestas.add(calculo.getMensajeRespuesta());
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                }

            }  catch (NumberFormatException |InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");
            }
        }
        //generador.guardarJson(respuestas);
        System.out.println("¡Programa Finalizado!");
    }
}
