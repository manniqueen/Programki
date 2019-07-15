import java.util.*;
public class TextCaesarCipher {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Input the message : ");
        String cipherText = scanner.nextLine();
        System.out.println(" Enter the shift value : ");
        int shift = scanner.nextInt();
        String decryptMessage = "";
        for(int i=0; i < cipherText.length();i++)

        {

            char alphabet = cipherText.charAt(i);

            if(alphabet >= 'a' && alphabet <= 'z') {

                alphabet = (char) (alphabet + shift);


                if(alphabet < 'a') {

                    alphabet = (char) (alphabet-'a'+'z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            }

            else if(alphabet >= 'A' && alphabet <= 'Z') {

                alphabet = (char) (alphabet + shift);


                if (alphabet < 'A') {

                    alphabet = (char) (alphabet-'A'+'Z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else if (alphabet == ' '){
                alphabet = (char) (alphabet + shift);
                decryptMessage = decryptMessage + alphabet;


            }else {
                alphabet = (char) (alphabet + shift);

                decryptMessage = decryptMessage + alphabet;
            }
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}