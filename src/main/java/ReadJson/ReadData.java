package ReadJson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;


public class ReadData {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser= new JSONParser();

        FileReader fileReader = new FileReader("src/Jsonfiles/employee.json");
        Object obj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject)obj;


        String firstname = (String) jsonObject.get("firstName");
        System.out.println("FIRSTNAME"+" "+firstname);

        JSONArray array = (JSONArray)((JSONObject) obj).get("address");
        for (int i =0;i<array.size();i++){
            JSONObject address = (JSONObject) array.get(i);

            String street = (String) address.get("street");
            String city = (String) address.get("city");
            String state = (String) address.get("state");

            System.out.println("Address   " +i+"..!");
            System.out.println("Street   "+street);
            System.out.println("City   "+city);
            System.out.println("State   "+state);
        }


    }



}
