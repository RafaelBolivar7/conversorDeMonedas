import java.util.Scanner;

public class Calculo {
    private String monedaOrigen;
    private String monedaDestino;
    private double monto;

    Scanner lectura = new Scanner(System.in);
    SolicitudDeCambio solicitud;

    public Calculo(SolicitudDeCambio solicitud){
        this.solicitud = solicitud;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getMonto() {
        return monto;
    }

    public void almacenaValores(String monedaOrigen, String monedaDestino){
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;

        System.out.println("Ingrese el valor que desea convertir: ");
        this.monto = Double.parseDouble(lectura.nextLine());
    }
     public String getMensajeRespuesta(){
         String respuesta = getMonto() + " " +getMonedaOrigen().toUpperCase()+ " equivale a: "+ solicitud.realizaCambio(getMonedaOrigen(), getMonedaDestino(), getMonto()) + " " + getMonedaDestino().toUpperCase();
         System.out.println(respuesta);
         return respuesta;
     }
}
