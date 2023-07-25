import java.util.Scanner;

public class Array_Baitap1 {
    public static void main(String[] args) {
        /*
         * 1. Nhập số phần tử của mảng 1 chiều số nguyên
         * 2. Khởi tạo mảng
         * 3. Nhập giá trị các phần tử của mảng
         * 4. Nhập giá trị phần tử cần xóa trong mảng
         * 5. Thực hiện xóa các phần tử trong mảng và in mảng
         * */
        //Bước 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int arraySize = Integer.parseInt(scanner.nextLine());
        //Bước 2
        int[] arrInt = new int[arraySize];
        //Bước 3
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt[%d]=", i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        //Bước 4
        System.out.println("Nhập giá trị cần xóa trong mảng:");
        int deleteValue = Integer.parseInt(scanner.nextLine());
        //Bước 5: Thực hiện xóa tất cả các phần tử trong mảng có giá trị là deleteValue
        //5.1. Tìm các chỉ số các phần tử trong mảng bằng deleteValue --> mảng arrIndexDelete
        int[] arrIndexDelete = new int[arrInt.length];
        int cntElement = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i]==deleteValue){
                //Lưu chỉ số phần tử
                arrIndexDelete[cntElement] = i;
                //Tăng đếm các phần tử cần xóa
                cntElement++;
            }
        }
        //5.2. Xóa các phần tử trong mảng arrInt
        if (cntElement>0){
            //Thực hiện xóa
            //5.2.1. Khởi tạo mảng mới gồm arrInt.lengh - cntElement phần tử
            int[] arrIntNew = new int[arrInt.length-cntElement];
            //5.2.2. Copy toàn bộ các phần tử còn lại từ arrInt --> mảng mới
            int indexNew = 0;
            //Duyệt mảng arrInt để xóa
            for (int i = 0; i < arrInt.length; i++) {
                //Duyệt chỉ số phần tử để xóa xem i có phải là phần tử cần xóa hay không
                boolean checkIndexDelete = false;
                for (int j = 0; j < cntElement; j++) {
                    if (i==arrIndexDelete[j]){
                        checkIndexDelete = true;
                        break;
                    }
                }
                if (!checkIndexDelete){
                    //Phần tử i không phải phần tử phải xóa --> copy sang mảng mới
                    arrIntNew[indexNew] = arrInt[i];
                    indexNew++;
                }
            }
            //In ra giá trị các phần tử mảng mới
            System.out.println("Giá trị các phần tử trong mảng mới là: ");
            for (int i = 0; i < indexNew; i++) {
                System.out.printf("%d\t",arrIntNew[i]);
            }
            System.out.printf("\n");
            //In ra số phần tử của mảng mới
            System.out.println("Độ dài mảng sau khi xóa là: "+indexNew);
        }else{
            System.out.println("Không tìm thấy giá trị nào để xóa");
        }
    }
}
