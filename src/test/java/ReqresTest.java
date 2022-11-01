
import org.testng.annotations.Test;

import java.util.List;
import static io.restassured.RestAssured.given;



public class ReqresTest {
    public final static String URL = "https://reqres.in/";

    @Test
    public void checkAvatarContainsIdTest() {

        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then()
                .log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        int i = 0;
    }
}
