package qa_guru;

import com.fasterxml.jackson.databind.ObjectMapper;
import qa_guru.model.UserInfo;
import org.junit.jupiter.api.Test;


import java.io.File;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JacksonTest {
    @Test
    void jacksonTest() throws Exception {
        ObjectMapper mapper = new ObjectMapper ();
        File file = new File("src/test/resources/jsonFile.json");
        UserInfo.User user = mapper.readValue(file, UserInfo.User.class);

        assertThat(user.name).isEqualTo("Joel");
        assertThat(user.phone).isEqualTo("1633572009");
        assertThat(user.pets.get(0).type).isEqualTo("cat");
        assertThat(user.pets.get(0).names.get(0)).isEqualTo("Rocky");
        assertThat(user.pets.get(0).names.get(1)).isEqualTo("Ollie");
        assertThat(user.pets.get(0).names.get(2)).isEqualTo("Finn");
        assertThat(user.pets.get(1).type).isEqualTo("dog");
        assertThat(user.pets.get(1).names.get(0)).isEqualTo("Daisy");
        assertThat(user.pets.get(1).names.get(1)).isEqualTo("Grace");
    }
}
