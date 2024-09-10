package ProyectoConversorMonedas;

public record DTOMonedas(
        String base_code,
        String target_code,
        double conversion_rate
) {
}
