package helpers;

import java.util.Random;

public class RandomHelper {

    public String generateRandomEmail() {
        String allowedCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String domain = "mail.com";

        Random random = new Random();
        //StringBuilder sb = new StringBuilder();
        String email = "";
        int lenght = allowedCharacters.length();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(lenght);
            email = email + allowedCharacters.charAt(randomIndex);
            //sb.append(allowedCharacters.charAt(randomIndex));
        }

        email = email + "@" + domain;

        //sb.append('@').append(domains[random.nextInt(domains.length)]);

        return email;
    }

}