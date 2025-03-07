import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        var t = new Tiempo();
        var tn = new TiempoNoAnemico();

        //Clase Anémica
        DateTimeFormatter tiempocompleto = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        System.out.println("Fecha Completa: " + t.getFf().format(tiempocompleto));
        DateTimeFormatter tiempocorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha Corta: " + t.getFf().format(tiempocorto));

        //Clase No Anémica
        System.out.println("Tiempo no anemico corto: " + tn.TiempoCorto());
        System.out.println("Tiempo no anemico completo: " + tn.TiempoLargo());
    }
}