import java.util.Map;

public record Tarifas(String base_code,
                      Map <String, Double> conversion_rates) {
}
