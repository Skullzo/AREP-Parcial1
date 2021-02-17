package edu.escuelaing.arep.app;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 * Clase principal encargada de llevar a cabo la ejecucion de todo el programa.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (20 de Enero del 2021) 
 */
public class App {
    /**
     * Metodo principal main que se encarga del funcionamiento de toda la clase App.
     * @param args Parametro que indica la lista de los elementos a evaluar.
     */
	public static void main(String[] args) {
        port(getPort());
        get("/clima", (req, res) -> inputDataPage(req, res));
    }
    /**
     * Metodo encargado de obtener la media y la desviacion estandar (obtenida a traves de la varianza) de los datos ingresados.
     * @param elementos Parametro que indica los elementos de la lista.
     */
   /**
    * @param req Parametro que se encarga de almacenar la informacion de la peticion.
    * @param res Parametro que se encarga de almacenar la informacion de la respuesta del servidor.
    * @return pageContent Retorna la pagina HTML que contiene la interfaz de usuario.
    */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<title>Calculadora de Media y Desviacion Estandar</title>"
                + "<body style = \"background: url(https://blog.hdwallsource.com/wp-content/uploads/2017/05/desk-calculator-wallpaper-61252-63066-hd-wallpapers.jpg) no-repeat ; background-size: 100% 111%;\">"
                + "</body>"
                + "<body>"
                + "<div style=\"padding:30px; width:96.9%; background:#008000; color:white; font-size:500%; position:absolute ; top:0px ; left:0px\">"
        		+ "Calculadora"
        	    + "</div>"
                + "<form action=\"/results\">"
                + "<div style=\"padding:30px; width:96.9%; background:#005a80; color:white; font-size:150%; position:absolute ; top:150px ; left:0px\">"
        		+ "Ingrese los numeros separados por una coma sin espacios."
        	    + "</div>"
                + "<input style=\"width:500px ; font-size:150% ; position:absolute ; top:237px ; text-align:center; left:0px\" type=\"text\" name=\"Datos\">"
                + "<br><br>"
                + "<input style=\"width:508px ; font-size:150% ; position:absolute ; top:272px ; text-align:center; left:0px\" type=\"submit\" value=\"Calcular Media y Desviacion Estandar\">"
                + "</form>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "<br><br>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
   /**
    * Este metodo lee el puerto predeterminado segun lo especificado por la variable PORT en el entorno.
    * @return returns Retorna el puerto predeterminado si el heroku-port no esta configurado (es decir, en localhost).
    */
   static int getPort() {
       if (System.getenv("PORT") != null) {
           return Integer.parseInt(System.getenv("PORT"));
       }
       return 4567;
   }
}