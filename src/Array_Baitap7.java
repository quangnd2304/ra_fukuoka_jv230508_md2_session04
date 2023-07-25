import java.util.Scanner;

public class Array_Baitap7 {
    public static void main(String[] args) {
        //Bước 1: Nhập số phần tử, khởi tạo mảng, nhập giá trị các phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng 2 chiều: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng 2 chiều: ");
        int col = Integer.parseInt(scanner.nextLine());
        float[][] arrFloat = new float[row][col];
        System.out.println("Nhập giá trị các phần tử mảng 2 chiều: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrFloat[%d][%d]=", i, j);
                arrFloat[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        //Bước 2: Tính tổng các phần tử trên đường chéo chính
        //2.1. Kiểm tra ma trận có phải vuông hay không
        if (row == col) {
            //2.2. Khởi tạo biến tổng
            float sumChinh = 0;
            float sumPhu = 0;
            float sumBien = 0;
            //2.3. Duyệt các phần tử của mảng
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    //2.4. Chỉ số dòng = chỉ số cột --> PT nằm trên chéo chính --> cộng vào tổng
                    if (i==j){
                        sumChinh+=arrFloat[i][j];
                    }
                    if (i+j==row-1){
                        sumPhu+=arrFloat[i][j];
                    }
                    if (i==0||i==row-1||j==0||j==col-1){
                        sumBien+=arrFloat[i][j];
                    }
                }
            }
            //2.4. In ra giá trị tổng
            System.out.println("Tổng các phần tử nằm trên đường chéo chính: "+sumChinh);
            System.out.println("Tổng các phần tử nằm trên đường chéo phụ: "+sumPhu);
            System.out.println("Tổng các phần tử nằm trên đường biên: "+sumBien);
        } else {
            System.out.println("Ma trận không phải ma trận vuông, không có đường chéo chính");
        }
    }
}
