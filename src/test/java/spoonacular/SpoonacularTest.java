package spoonacular;

import io.restassured.builder.RequestSpecBuilder;

import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import net.javacrumbs.jsonunit.JsonAssert;
import net.javacrumbs.jsonunit.core.Option;
import org.hamcrest.Matchers;



import io.restassured.RestAssured;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.rmi.RemoteException;

import static io.restassured.RestAssured.given;
import static java.nio.file.FileSystems.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;


public class SpoonacularTest {

}
    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    class SomeTest {

//        @BeforeAll
//        static void beforeAll() {
//            RestAssured.baseURI = "https://spoonacular.com";
//            RestAssured.requestSpecification  = new RequestSpecBuilder()
//                    .addParam("apiKey", "2bd3160148d549f6b0a7a969a0daffcb")
//                    .build();
//        }
        int numberId = 1303219;
        String userName = "your-users-name382";
        String hash = "44d5497543c815cae4a55de8c5340ef2a597d99a";
        String id;
        @Test
        public void aTest() {

            id = given()
                    .queryParam("hash", "44d5497543c815cae4a55de8c5340ef2a597d99a")
                    .queryParam("apiKey", "2bd3160148d549f6b0a7a969a0daffcb")
                    .body("{\n"
                            + "\"item\": \"1 package pasta\",\n"
                            + "\t\"query\": \"pasta\",\n"
                            + "\t\"parse\": true,"
                            + "}")
                    .when()
                    .post("https://api.spoonacular.com/mealplanner/" + userName + "/shopping-list/items")
                    .then()
                    .statusCode(200)
                    .body("cost", equalTo(96.43F))
                    .log()
                    .all()
                    .extract()
                    .jsonPath()
                    .get("id")
                    .toString();


//            RestAssured.given();
//            String actually;
//            actually = RestAssured.given()
//                    .param("hash", "44d5497543c815cae4a55de8c5340ef2a597d99a")
//                    .param("username", "your-users-name382")
//                    .body("{\n"
//                            + "\"item\": \"1 package pasta\",\n"
//                            + "\t\"query\": \"pasta\",\n"
//                            + "\t\"parse\": true,"
//                            + "}")
//                    .when()
//                    .post("/mealplanner/your-users-name382/shopping-list/items")
//                    .then()
//                    .statusCode(200)
//                    .body("cost", equalTo(96.43F))
//                    .log()
//                    .all()
//                    .extract()
//                    .jsonPath()
//                    .get()
//                    .toString();
        }


        @Test
        public void bTest() {
            id = given()
                    .queryParam("hash", "44d5497543c815cae4a55de8c5340ef2a597d99a")
                    .queryParam("apiKey", "2bd3160148d549f6b0a7a969a0daffcb")

                    .get("https://api.spoonacular.com/mealplanner/" + userName + "/shopping-list")
                    .then()
                    .statusCode(200)
//                    .body("cost", equalTo(96.43F))
                    .log()
                    .all()
                    .extract()
                    .jsonPath()
                    .get("id");


      }
//        @Test
//        public void сTest() {
//
//            id = given()
//                    .queryParam("hash", "44d5497543c815cae4a55de8c5340ef2a597d99a")
//                    .queryParam("apiKey", "2bd3160148d549f6b0a7a969a0daffcb")
//
//                    .delete("https://api.spoonacular.com/mealplanner/your-users-name382/shopping-list/items/"
//                            + numberId + "?hash=" + hash)
//                    .then()
//                    .statusCode(200)
//                    .body("status", equalTo("success"))
//                    .log()
//                    .all()
//                    .extract()
//                    .jsonPath()
//                    .get("id");
//
//        }
}
