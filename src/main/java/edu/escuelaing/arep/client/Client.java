package edu.escuelaing.arep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws IOException{
        URL url = new URL("https://arepparcial1.herokuapp.com/solucion");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        String inputString = "11.0,565.44,87.9,55.5,148.32,789.11,999.0,18.0";
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = inputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String resp = null;
            while ((resp = br.readLine()) != null) {
                response.append(resp.trim());
            }
            System.out.println(response.toString());

        }
    }
}
