package edu.escuelaing.arep.Services;

import org.json.JSONObject;
import java.util.List;

public class JsonConstructor {

    public static JSONObject toJson(List<Double> list, double sum,double mean) {
        JSONObject jsObject = new JSONObject();
        jsObject.put("list", list);
        jsObject.put("sum", sum);
        jsObject.put("mean", mean);
        return jsObject;
    }

}
