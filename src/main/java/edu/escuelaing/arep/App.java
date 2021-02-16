package edu.escuelaing.arep;

import edu.escuelaing.arep.Services.Control;
import edu.escuelaing.arep.Services.JsonConstructor;
import org.json.JSONObject;
import spark.Request;
import spark.Response;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
        post("/solucion",(req, res) -> {

            res.status(200);
            res.type("application/json");
            List<Double> elementos = new ArrayList<Double>();
            String[] data = req.body().split(",");
            for (String a : data) {
                elementos.add(Double.parseDouble(a));
            }
            Control control = new Control(elementos);

            List<Double> ord = control.bubbleSort();
            double sum = control.sumatoria(),mean = control.mean();
            return JsonConstructor.toJson(ord,sum,mean);
        });
    }

    /**
     *
     * @param req Tiene la informacion de la petición.
     * @param res Tiene la información con la respuesta del servidor.
     * @return pageContent Contiene la pagina html.
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<title> Ordenamiento </title>"
                + "<body>"
                + "<h1>Ordenamiento de una lista de elementos </h1>"
                + "<form action=\"/results\">"
                + "Por favor ingrese los datos separados por una coma(\",\"):<br>"
                + "<input type=\"text\" name=\"Datos\">"
                + "<br><br>"
                + "<input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     *
     * @param req Tiene la informacion de la petición.
     * @param res Tiene la información con la respuesta del servidor.
     * @return pageResponse Contiene la pagina html.
     */
    private static JSONObject resultsPage(Request req, Response res) {
        String data = req.queryParams("Datos");
        String[] lista  = data.split(",");
        List elementos = new ArrayList<Double>();
        for (String a : lista) {
            elementos.add(Double.parseDouble(a));
        }
        JSONObject a = calcular(elementos);
        System.out.println(a);
        return a;
    }

    public static JSONObject calcular(List<Double> elementos){
        Control control = new Control(elementos);

        List<Double> ord = control.bubbleSort();
        double sum = control.sumatoria(),mean = control.mean();
        return JsonConstructor.toJson(ord,sum,mean);
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
