package es.us.isa.idl.idlvalidation;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class IdlValidationApplicationTests {

    private static final String OPERATION_PATH = "operationPath";
    private static final String OPERATION_TYPE = "operationType";
    private static final String PARAMETERS = "parameters";


    @Autowired
    private MockMvc mockMvc;

	// Testing GetSuccessful
    @Test
    void validRequestGetSuccessfulNoParams() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, String> parametersMap = new HashMap<>();
       // parametersMap.put("p1", "true");
        //	parametersMap.put("p2","a string");
        String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(parametersMap);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, "/noParams");
        query.add(OPERATION_TYPE, "get");

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

	@Test
	void validRequestGetSuccessfulOneParamString() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> parametersMap = new HashMap<>();
		 parametersMap.put("p1", "a String");
		//	parametersMap.put("p2","a string");
		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(parametersMap);

		MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
		query.add(OPERATION_PATH, "/oneParamString");
		query.add(OPERATION_TYPE, "get");

		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
						.queryParams(query)
						.queryParam(PARAMETERS, parameters))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	void validRequestGetSuccessfulOneParamInt() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> parametersMap = new HashMap<>();
		parametersMap.put("p1", "10");
		//	parametersMap.put("p2","a string");
		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(parametersMap);

		MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
		query.add(OPERATION_PATH, "/oneParamInt");
		query.add(OPERATION_TYPE, "get");

		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
						.queryParams(query)
						.queryParam(PARAMETERS, parameters))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
