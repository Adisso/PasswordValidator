import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    //Return true when there is at least one number.
    static public boolean stringContainsNumber(String s){
        return Pattern.compile("\\d").matcher(s).find();
    }

    //Return true when password length is higher than 5 and lower than 10.
    static public boolean passwordLength(String s){
        if((s.length()<5)||(s.length()>10)){
            return false;
        }
        else
            return true;
    }

    // Return true when there is no whitespace.
    static public boolean stringContainsWhitespace(String s){
        return !Pattern.compile("\\s").matcher(s).find();
    }

    //Return true when there is at least one special character.
    static public boolean stringContainsSpecial(String s){
        return Pattern.compile("[&+@$#%]").matcher(s).find();
    }

    public static void main(String[] args) {

        String password;

        do {
            //Enter the password.
            System.out.println("Wpisz haslo: ");
            Scanner odczyt1 = new Scanner(System.in);
            password = odczyt1.nextLine();


            if(stringContainsNumber(password)==false){
                System.out.println("Musisz wykorzystac conajmniej jedna cyfre.");
            }

            if(passwordLength(password)==false){
                System.out.println("Haslo musi zawierac conajmniej 5 znakow i najwyzej 10.");
            }

            if(stringContainsWhitespace(password)==false){
                System.out.println("Haslo nie moze zawierac spacji.");
            }

            if(stringContainsSpecial(password)==false){
                System.out.println("Haslo musi zawierac conajmniej 1 znak specjalny.");
            }

        }while((passwordLength(password) && stringContainsWhitespace(password) && stringContainsNumber(password) && stringContainsSpecial(password)) == false);

        System.out.println("Haslo jest prawidlowe.");
    }
}
