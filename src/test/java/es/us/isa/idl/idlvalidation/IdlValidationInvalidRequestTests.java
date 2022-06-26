package es.us.isa.idl.idlvalidation;


import com.fasterxml.jackson.databind.ObjectMapper;
import idlanalyzer.analyzer.Analyzer;
import idlanalyzer.analyzer.OASAnalyzer;
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

import java.util.Map;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class IdlValidationInvalidRequestTests {
    private static final String SPEC_URL = "./src/test/resources/OASFile/openapi.yaml";
    private static final String OPERATION_PATH = "operationPath";
    private static final String OPERATION_TYPE = "operationType";
    private static final String PARAMETERS = "parameters";


    @Autowired
    private MockMvc mockMvc;

    // Testing GetSuccessful
    @Test
    void validRequestGetSuccessfulNoParams() throws Exception {
        String operationPath = "/noParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneParamBoolean() throws Exception {
        String operationPath = "/oneParamBoolean";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

        String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneParamString() throws Exception {
        String operationPath = "/oneParamString";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneParamInt() throws Exception {
        String operationPath = "/oneParamInt";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulNOneParamEnumString() throws Exception {
        String operationPath = "/oneParamEnumString";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneParamEnumInt() throws Exception {
        String operationPath = "/oneParamEnumInt";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyRequires() throws Exception {
        String operationPath = "/oneDependencyRequires";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyOr() throws Exception {
        String operationPath = "/oneDependencyOr";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyOnlyOne() throws Exception {
        String operationPath = "/oneDependencyOnlyOne";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyAllOrNone() throws Exception {
        String operationPath = "/oneDependencyAllOrNone";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyZeroOrOne() throws Exception {
        String operationPath = "/oneDependencyZeroOrOne";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyArithRel() throws Exception {
        String operationPath = "/oneDependencyArithRel";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyComplex() throws Exception {
        String operationPath = "/oneDependencyComplex";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyEnumParams() throws Exception {
        String operationPath = "/oneDependencyEnumParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyArithRelEnumParams() throws Exception {
        String operationPath = "/oneDependencyArithRelEnumParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulOneDependencyComplexEnumParams() throws Exception {
        String operationPath = "/oneDependencyComplexEnumParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial1() throws Exception {
        String operationPath = "/combinatorial1";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial2() throws Exception {
        String operationPath = "/combinatorial2";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial3() throws Exception {
        String operationPath = "/combinatorial3";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial4() throws Exception {
        String operationPath = "/combinatorial4";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial5() throws Exception {
        String operationPath = "/combinatorial5";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial6() throws Exception {
        String operationPath = "/combinatorial6";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();
        System.out.println(request);
        ObjectMapper mapper = new ObjectMapper();

        String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial7() throws Exception {
        String operationPath = "/combinatorial7";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial8() throws Exception {
        String operationPath = "/combinatorial8";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial9() throws Exception {
        String operationPath = "/combinatorial9";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void validRequestGetSuccessfulCombinatorial10() throws Exception {
        String operationPath = "/combinatorial10";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomInvalidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

}
