package edu.escuelaing.arep.app;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * Clase encargada de llevar a cabo la conexion con el API de OpenWeatherMap.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (17 de Febrero del 2021) 
 */
public class Conexion {
	/**
     * Metodo principal main que se encarga del funcionamiento de toda la clase App.
     * @param lugar Parametro que indica el lugar recolectado de la API.
     * @return rta Retorna el JSON recolectado de la API, la cual en la clase principal App se encarga de desplegarla en la pantalla en formato JSON.
     */
	public String HTTPConnection(String lugar){
        StringBuilder rta = new StringBuilder();
        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+lugar+"&appid=e628214cfe83ce10a80c350ba9ef00f0");
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