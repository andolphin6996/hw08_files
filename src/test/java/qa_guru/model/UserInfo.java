package qa_guru.model;

import java.util.ArrayList;

public class UserInfo {
    public static class User {
        public String name;
        public String phone;
        public ArrayList<Pets> pets;

        public static class Pets {
            public String type;
            public ArrayList<String> names;
        }
    }
}

