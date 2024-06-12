import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarTarifa {
    public Tarifas buscarTarifas(String codigo) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/PONER-TU-KEY-AQUI/latest/" + codigo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar si la solicitud fue exitosa
            if (response.statusCode() == 200) {
                return new Gson().fromJson(response.body(), Tarifas.class);
            } else {
                System.out.println("La solicitud no fue exitosa. Código de estado: " + response.statusCode());
                return null;
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            return null;
        }
        catch (IOException | InterruptedException e) {
            System.out.println("Se produjo un error de E/S durante la solicitud: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            System.out.println("Se produjo un error en tiempo de ejecución: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
