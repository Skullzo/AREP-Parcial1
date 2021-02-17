package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Conexion {
	public String HTTPConnection(String lugar){
        StringBuilder rta = new StringBuilder();
        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+lugar+"appid=e628214cfe83ce10a80c350ba9ef00f0");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                rta.append(line);
            }
            bufferedReader.close();
        }catch (Exception e){

        }

        return rta.toString();
    }
}
