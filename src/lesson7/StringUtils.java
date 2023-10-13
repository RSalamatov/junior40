package lesson7;

public class StringUtils {

    // метод который принимает входящим параметром email
    // делает проверку на валидацию
    // и пишет на консоль корректный это email или нет

    public static void checkValidMain(String email) {
        // email = "gf@dgdfh"
        /** 1) Проверяем содержание собачки. Если ее нет -НЕ ВАЛИДНЫЙ
         *  2) Проверяем что собачка только лжга. Если ее нет - НЕ ВАЛИДНЫЙ
         *  3) Собачка должна стоять не в начале и не в конце. Если нет - НЕ ВАЛИДНЫЙ
         *  4) Должна быть хотя бы одна точка после @
         *  5) Точка после собачки не должна быть в начале или в конце +
         *  6) Email не может начинаться или заканчиваться с точки +
         *  7) Email содержит только латинские ьуквы. Если нет - НЕ ВАЛИДНЫЙ +
         *  8) Проверить содержит ли email пробелы. Если имеет -НЕ ВАЛИДНЫЙ +
         *  // добавить разные проверки на email
         */

        if (!email.contains("@")) {
            System.out.println("Не содержит собачку!!!");
            return;
        }

        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length > 2) {
            System.out.println("Собачек больше одной!!!");
            return;
        }

        if (email.startsWith("@") || email.endsWith("@")) {
            System.out.println("Email не может начинаться или заканчиваться с собачки!!!");
            return;

        }

        String lastPart = partsOfEmail[1];
        if (!lastPart.contains(".")) {
            System.out.println("Email не содержит точку во второй части после собачки!!!");
            return;
        }

        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("Email не может начинаться или заканчиваться с точки!!!");
            return;
        }

        if (lastPart.startsWith(".")) {
            System.out.println("Точка после собачки не должна быть в начале");
            return;

        }

        String regex = "^[a-zA-Z0-9]&[@/?|!#$%()]";
        if (!email.matches(regex)) {
            System.out.println("Email содержит не латинские буквы");
            return;
        }

        if (email.contains(" ")){
            System.out.println("Email не может содержать пробелы!!!");
            return;

        }
        System.out.println("Email подходит!!!");
    }

}
