public class StringInit {
    public static void main(String[] args) {
        int a = 10;
        //Khai báo chuỗi bằng literal - cách thông thường
        String str1 = "Rikkei Academy";
        String str2 = "Rikkei Academy";
        String str5 = "Rikkei Academy";
        str5 = "Học viện Rikkei Academy";
        //Khai báo chuỗi qua lớp String
        String str3 = new String("Rikkei");
        String str4 = new String("Rikkei");
        String str6 = new String("Rikkei");
        //Các phương thức làm việc với chuỗi
        //1. length(): Trả về độ dài của chuỗi
        System.out.println("Độ dài của chuỗi str1: "+str1.length());
        //2. chartAt(index): Trả về ký tự tại vị trí index
        System.out.println("Ký tự có chỉ số 4 trong str1 là: "+str1.charAt(4));
        //3. str1.concat(str2): Nối chuỗi str1 với chuỗi str2 (+)
        System.out.println("str1 nối chuỗi str3: "+str1.concat(str3));
        //4. toUpperCase(): Viết hoa chuỗi
        System.out.println("Viết hoa chuỗi str1: "+str1.toUpperCase());
        //5. toLowerCase(): Viết thườn chuỗi
        System.out.println("Viết thường chuỗi str1: "+str1.toLowerCase());
        //6. trim(): Xóa khoảng trắng 2 đầu chuỗi
        String str7 = "     Rikkei Academy            ";
        System.out.println("Xóa khoảng trắng 2 đầu chuỗi str7: "+str7.trim());
        //7. str1.equal(str2): So sánh chuỗi str1 và str2, bằng --> true, không bằng --> false
        //Phân biệt so sánh == với equal trong so sánh chuỗi
        //== So sánh cả giá trị và kiểu dữ liệu (địa chỉ tham chiếu)
        //equals(): so sánh giá trị chuỗi, có phân biệt hoa thường
        System.out.println("So sánh chuỗi str1 và str2 với ==: "+(str1==str2));//true
        System.out.println("So sánh chuỗi str1 và str2 với equal(): "+(str1.equals(str2)));//true
        System.out.println("So sánh chuỗi str3 và str4 với ==: "+(str3==str4));//false
        System.out.println("So sánh chuỗi str3 và str4 với equal(): "+(str3.equals(str4)));//true
        //8. str1.equalsIgnoreCase(str2): so sánh chuỗi str1 và str2 không phân biệt hoa thường
        String str8 = "Học viện Rikkei";
        String str9 = "hỌc Viện RiKKei";
        System.out.println("So sánh 2 chuỗi với equalsIgnoreCase(): "+str8.equalsIgnoreCase(str9));
        //9. str1.compareTo(str2): So sánh chuỗi, trả vệ giá trị là độ chênh trong bảng mã ASCII
        String str10 = "ACCD";
        String str11 = "ABcD";
        System.out.println("So sánh chuỗi str10 và str11 với compare(): "+str10.compareTo(str11));
        //10. str1.startWith(str2): kiểm tra chuỗi str1 bắt đầu là chuỗi str2 hay không? Có -> true, không-> false
        System.out.println("Kiểm tra chuỗi str1 có bắt đầu là chuỗi Rik hay không: "+str1.startsWith("Rik"));
        //11. str1.endWith(str2): kiểm tra chuỗi str1 có kết thúc là chuỗi str2 hay không?
        System.out.println("Kiểm tra chuỗi str1 có kết thúc là demy hay không: "+str1.endsWith("demy"));
        //12. str1.contains(str2): Kiểm tra trong chuỗi str1 có chữa str2 hay không
        System.out.println("Kiểm tra chuỗi str1 có chứa chuỗi kkei hay không: "+str1.contains("kkei"));
    }

}
