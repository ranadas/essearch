package com.rdas.es.resource

import com.rdas.es.ESSearchMainApplication
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

//@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(ESSearchMainApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieSearchResourceTest {
    @Autowired
    lateinit var movieSearchResource: MovieSearchResource

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun whenCalled_ControllerIsNotNull() {
        assertNotNull(movieSearchResource)
    }

    @Test
    fun whenHelloCalled_shouldReturnHello() {
        val result = testRestTemplate
            .getForEntity("/movie/hello", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "Hello, World")
    }
}