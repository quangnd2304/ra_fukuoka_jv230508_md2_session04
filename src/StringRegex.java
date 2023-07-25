import java.util.Scanner;
import java.util.regex.Pattern;

public class StringRegex {
    public static void main(String[] args) {
        //Nhập vào 1 chuỗi mail, bắt định dạng chuỗi mail đó
        //1. Khai báo biểu thức Regex
        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào email của bạn: ");
        boolean checkEmail = true;
        String email;
        do {
            email = scanner.nextLine();
            if(Pattern.matches(emailRegex,email)){
                checkEmail = false;
            }else{
                System.err.println("Vui lòng nhập đúng định dạng email");
            }
        }while(checkEmail);
        System.out.println("Email của bạn là: "+email);
    }
}
