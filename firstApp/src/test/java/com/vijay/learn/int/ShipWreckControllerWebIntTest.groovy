package com.vijay.learn

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.http.HttpStatus
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.web.client.RestTemplate

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SBApplication.class)
class ShipWreckControllerWebIntTest {
    //Still have issue with the endpoint
    @Test
    void testListAll() throws IOException {
        RestTemplate restTemplate = new RestTemplate()
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:9090/api/v1/shipwrecks", String.class)

        assertThat(response.getStatusCode(), equalTo(HttpStatus.SC_OK))

        ObjectMapper objectMapper = new ObjectMapper()
        JsonNode responseJson = objectMapper.readTree(response.getBody())

        assertThat(responseJson.isMissingNode(), is(false))
        assertThat(responseJson.toString(), equalTo("[]"))

    }

}