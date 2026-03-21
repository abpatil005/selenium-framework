package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.util.List;
import java.util.Map;

public class JsonUtils {

    public static List<Map<String, String>> getTestData(String fileName) {

        try {
            String path = System.getProperty("user.dir")
                    + "/src/test/resources/testdata/" + fileName;

            ObjectMapper mapper = new ObjectMapper();

            return mapper.readValue(
                    new File(path),
                    new TypeReference<List<Map<String, String>>>() {}
            );

        } catch (Exception e) {
            throw new RuntimeException("Failed to read JSON file", e);
        }
    }
}