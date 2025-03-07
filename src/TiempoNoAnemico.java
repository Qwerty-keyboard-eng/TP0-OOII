import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {
    private final LocalDate ffna;

    public TiempoNoAnemico() {
        ffna = LocalDate.now();
    }

    public String tiempoCorto() {
        DateTimeFormatter tcorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return ffna.format(tcorto);
    }

    public String tiempoLargo() {
        DateTimeFormatter tlargo = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        return ffna.format(tlargo);
    }
}
