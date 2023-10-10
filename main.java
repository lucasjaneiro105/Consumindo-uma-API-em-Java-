import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite filme de sua preferencia para obter dados dele: ");
        var buscar = dados.nextLine();

        String local = "https://www.omdbapi.com/?t=" + buscar + "&apikey=6082dd47";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(local))
            .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
 }
  }
