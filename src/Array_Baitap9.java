import java.util.Scanner;

public class Array_Baitap9 {
    public static void main(String[] args) {
        //Bước 1: Nhập số phần tử, khai báo mảng, nhập giá trị các phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[size];
        System.out.println("Nhập giá trị các phần tử:");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt[%d]=", i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        //Bước 2: Khai báo biến max = arrInt[0] và max2 = arrInt[0]
        int max = arrInt[0];
        int max2 = arrInt[0];
        //Bước 3: Duyệt mảng và tìm phần tử có giá trị lớn thứ 2
        //3.1. Duyệt mảng từ chỉ số i: 1 --> length-1
        for (int element : arrInt) {
            //3.2. Nếu max < arrInt[i] thì max = arrInt[i], max2 = max
            if (max < element) {
                max2 = max;
                max = element;
            } else {
                //3.3. Nếu max>=arrInt[i] thì kiểm tra tiếp max2<arrInt[i] --> max2=arrInt[i]
                if (max2 < element) {
                    max2 = element;
                }
            }
        }
        System.out.println("Giá trị phần tử lớn thứ 2 trong mảng là: " + max2);

    }
}
