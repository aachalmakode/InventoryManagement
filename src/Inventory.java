import java.io.FileReader;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class Inventory {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(".//src/Inventory.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray inventory = (JSONArray) jsonObject.get("Inventory");
            System.out.println(inventory);

        } catch (Exception e) {

            e.printStackTrace();
        }

    }


}
