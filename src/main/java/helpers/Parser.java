package helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import models.CustomerEnvelope;

import java.io.File;
import java.io.IOException;

/**
 * Created by evan on 7/1/16.
 */
public class Parser {

    public void parse() {
        final ObjectMapper mapper = new ObjectMapper(new YAMLFactory()); // jackson databind
        mapper.registerModule(new JodaModule());
        final File file = new File("src/main/resources/customers.yml");
        try {
            final CustomerEnvelope customers = mapper.readValue(file, CustomerEnvelope.class);
            System.out.println(customers);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

}
