import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


     String userName = scanner.nextLine();

     boolean isValid = userName != null && userName.matches("[A-Za-z0-9_]+");

        Pattern pattern = Pattern.compile("[A-Za-z0-9_]+");

        if (isValid){
            System.out.println(userName);
        }else {
            System.out.println("Invalid username!");
        }


    }


    }

