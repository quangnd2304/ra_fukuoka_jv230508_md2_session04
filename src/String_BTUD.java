import java.util.Scanner;

public class String_BTUD {
    public static void main(String[] args) {
        /*
        * Bài tập ứng dụng String
        * 1. Nhập vào chuỗi str1 (Literal), str2 (String) từ bàn phím bằng 2 cách
        * 2. In ra độ dài của 2 chuối str1 và str2
        * 3. So sánh 2 chuỗi str1 và str2 có phân biệt hoa thường và không phân biệt hoa thường
        * 4. Kiểm tra chuỗi str1 có bắt đầu là Rikkei và kết thúc là Academy hay không
        * 5. In ra kết quả của nối 2 chuỗi str1 và str2
        *
        * */
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi str1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi str2: ");
        String str2 = new String(scanner.nextLine());
        //2
        System.out.println("Độ dài chuỗi str1: "+str1.length());
        System.out.println("Đọ dài chuỗi str2: "+str2.length());
        //3.
        System.out.println("So sánh 2 chuỗi có phân biệt hoa thường: "+str1.equals(str2));
        System.out.println("So sánh 2 chuỗi không phân biệt hoa thường: "+str1.equalsIgnoreCase(str2));
        //4.
        System.out.println("Kiểm tra chuỗi str1 bắt đầu là Rikkei: "+str1.startsWith("Rikkei"));
        System.out.println("Kiểm tra chuỗi str1 kết thúc là Academy: "+str1.endsWith("Academy"));
        //5.
        System.out.println("Nối 2 chuỗi: "+str1.concat(str2));

    }
}
