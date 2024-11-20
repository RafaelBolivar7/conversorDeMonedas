import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializar variables
        Scanner lectura  = new Scanner(System.in);
        int opcion = 0;

        //Instanciar la solicitud de Conversion
        SolicitudDeCambio solicitud = new SolicitudDeCambio();
        Calculo calculo = new Calculo(solicitud);




        while (true){
            System.out.println("""
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
                    """);
        }




    }
}
