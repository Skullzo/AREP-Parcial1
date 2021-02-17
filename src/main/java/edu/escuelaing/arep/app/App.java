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
        String lugar = req.queryParams("lugar");
        System.out.println(lugar);
        Conexion cs = new Conexion();
        String j = cs.HTTPConnection(lugar);
        System.out.println(j);
        return j;
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