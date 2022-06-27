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
class ValidRequestTests {
    private static final String SPEC_URL = "./src/test/resources/OASFile/openapi.yaml";
    private static final String OPERATION_PATH = "operationPath";
    private static final String OPERATION_TYPE = "operationType";
    private static final String PARAMETERS = "parameters";


    @Autowired
    private MockMvc mockMvc;

    // Testing GetSuccessful
    @Test
    void NoParams() throws Exception {
        String operationPath = "/noParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneParamBoolean() throws Exception {
        String operationPath = "/oneParamBoolean";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

        String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneParamString() throws Exception {
        String operationPath = "/oneParamString";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneParamInt() throws Exception {
        String operationPath = "/oneParamInt";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void NOneParamEnumString() throws Exception {
        String operationPath = "/oneParamEnumString";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneParamEnumInt() throws Exception {
        String operationPath = "/oneParamEnumInt";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyRequires() throws Exception {
        String operationPath = "/oneDependencyRequires";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyOr() throws Exception {
        String operationPath = "/oneDependencyOr";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyOnlyOne() throws Exception {
        String operationPath = "/oneDependencyOnlyOne";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyAllOrNone() throws Exception {
        String operationPath = "/oneDependencyAllOrNone";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyZeroOrOne() throws Exception {
        String operationPath = "/oneDependencyZeroOrOne";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyArithRel() throws Exception {
        String operationPath = "/oneDependencyArithRel";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyComplex() throws Exception {
        String operationPath = "/oneDependencyComplex";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void oneDependencyEnumParams() throws Exception {
        String operationPath = "/oneDependencyEnumParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyArithRelEnumParams() throws Exception {
        String operationPath = "/oneDependencyArithRelEnumParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void OneDependencyComplexEnumParams() throws Exception {
        String operationPath = "/oneDependencyComplexEnumParams";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial1() throws Exception {
        String operationPath = "/combinatorial1";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial2() throws Exception {
        String operationPath = "/combinatorial2";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial3() throws Exception {
        String operationPath = "/combinatorial3";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial4() throws Exception {
        String operationPath = "/combinatorial4";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial5() throws Exception {
        String operationPath = "/combinatorial5";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial6() throws Exception {
        String operationPath = "/combinatorial6";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();
        System.out.println(request);
        ObjectMapper mapper = new ObjectMapper();

        String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial7() throws Exception {
        String operationPath = "/combinatorial7";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial8() throws Exception {
        String operationPath = "/combinatorial8";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial9() throws Exception {
        String operationPath = "/combinatorial9";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Combinatorial10() throws Exception {
        String operationPath = "/combinatorial10";
        String operationType = "get";

        Analyzer analyzer = new OASAnalyzer("oas", SPEC_URL, operationPath, operationType, false);
        Map<String, String> request = analyzer.getRandomValidRequest();

        ObjectMapper mapper = new ObjectMapper();

		String parameters = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

        MultiValueMap<String, String> query = new LinkedMultiValueMap<>();
        query.add(OPERATION_PATH, operationPath);
        query.add(OPERATION_TYPE, operationType);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/validation")
                        .queryParams(query)
                        .queryParam(PARAMETERS, parameters))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
