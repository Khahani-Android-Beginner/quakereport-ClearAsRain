package com.khahani.app.quakereport;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 7/22/2018.
 */

public class Utils {

    private final String JSON_DATA = "[{\"city\":\"Tehran\", \"magnitude\":2.5},{\"city\":\"Sistan\", \"magnitude\":5.5},{\"city\":\"Azarb\", \"magnitude\":3}]";

    public List<Earthquake> getEarthquakeFromJson(){

        List<Earthquake> result = new ArrayList<>();

        try {
            JSONArray root = new JSONArray(JSON_DATA);

            for (int i = 0; i < root.length(); i++) {
                JSONObject quake = new JSONObject(root.getJSONObject(i).toString());
                String city = quake.getString("city");
                double magnitude = quake.getDouble("magnitude");

                Earthquake earthquake = new Earthquake(city, (float)magnitude);
                result.add(earthquake);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return result;

    }
}
