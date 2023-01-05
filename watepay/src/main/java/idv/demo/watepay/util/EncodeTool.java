package idv.demo.watepay.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EncodeTool {

    public String createHashCode(Object jsonObj){

        ObjectMapper objMapper = new ObjectMapper();
        try {
            // User Object 轉 json
            String json = objMapper.writeValueAsString(jsonObj);

        }catch(Exception ex){

        }

        return "todo";
    }
}
