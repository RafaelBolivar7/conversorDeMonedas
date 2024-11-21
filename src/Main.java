import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        GeneradorArchivos generador = new GeneradorArchivos();

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
                    7) Otras Solicitudes
                    8) Salir
                    
                    Elija una opción valida:
                    
                    ******************************************
                    """;

        while (opcion != 8){
            try{
                System.out.println(menu);
                opcion = Integer.parseInt(lectura.nextLine());

                //Crear la marca de tiempo
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcion){
                    case 1:
                        calculo.almacenaValores("USD", "ARS");
                        respuestas.add(formattedDate + " - " + calculo.getMensajeRespuesta());
                        generador.guardarJson(respuestas);
                        break;
                    case 2:
                        calculo.almacenaValores("ARS", "USD");
                        respuestas.add(formattedDate + " - " + calculo.getMensajeRespuesta());
                        generador.guardarJson(respuestas);
                        break;
                    case 3:
                        calculo.almacenaValores("USD", "BRL");
                        respuestas.add(formattedDate + " - " + calculo.getMensajeRespuesta());
                        generador.guardarJson(respuestas);
                        break;
                    case 4:
                        calculo.almacenaValores("BRL", "USD");
                        respuestas.add(formattedDate + " - " + calculo.getMensajeRespuesta());
                        generador.guardarJson(respuestas);
                        break;
                    case 5:
                        calculo.almacenaValores("USD", "COP");
                        respuestas.add(formattedDate + " - " + calculo.getMensajeRespuesta());
                        generador.guardarJson(respuestas);
                        break;
                    case 6:
                        calculo.almacenaValores("COP", "USD");
                        respuestas.add(formattedDate + " - " + calculo.getMensajeRespuesta());
                        generador.guardarJson(respuestas);
                        break;
                    case 7:
                        calculo.almacenaOtrosValores();
                        respuestas.add(formattedDate + " - " + calculo.getMensajeRespuesta());
                        generador.guardarJson(respuestas);
                    case 8:
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
