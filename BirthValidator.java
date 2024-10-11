public class BirthValidator {
    public static void main(String[] args) {

        String birthdayPattern = "^\\d{2}/\\d{2}/\\d{4}$";

        String[] birthdays = {"06/03/2077", "14/05/2013", "03/03/1364"};
    
        // for each birthday in birthdays
        for (String birthday : birthdays) {
            if (birthday.matches(birthdayPattern)){
                System.out.println(birthday + " is in the right form");
            } else {
                System.out.println(birthday + " is not in the right form");
            }
        } 
    }
}
