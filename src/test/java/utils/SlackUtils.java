package utils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class SlackUtils {

    public static void slackTestResult(String pretext, String titleTextPass, int countResultPass) {
        given().
                baseUri("https://hooks.slack.com/services/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").
                contentType(ContentType.JSON).
                when().body("{\n" +
                        "\t\"attachments\": [{\n" +
                        "\t\"icon_emoji\": \":mega:\",\n" +
                        "\t\t\"pretext\": \"" + pretext + "\",\n" +
                        "\t},\n" +
                        "{\t\t\"color\": \"#36a64f\",\n" +
                        "\t\t\"title\": \"" + titleTextPass + "\",\n" +
                        "\t\"text\": \"" + countResultPass + "\"\n" +
                        "\t},\n" +
                        "],\n" +
                        "\t\"username\": \"Tamaimam15\"\n" +
                        "}\n").post().
                then().statusCode(200);
    }
}
