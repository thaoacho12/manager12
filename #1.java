#1
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Sử dụng Scanner để nhập năm sinh từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = scanner.nextInt();
        
        // Bước 2: Tính tuổi bằng cách trừ năm hiện tại (2023) cho năm sinh
        int tuoi = LocalDate.now().getYear() - namSinh;
        
        // Bước 3: In tuổi ra màn hình
        System.out.println("Tuổi của bạn là: " + tuoi);
        
        // Đóng Scanner sau khi sử dụng
        scanner.close();
#2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Nhập vào hai số nguyên a và b từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        // Bước 2: Tính tổng của a và b
        int tong = a + b;

        // Bước 3: Tính hiệu của a và b
        int hieu = a - b;

        // Bước 4: Tính tích của a và b
        int tich = a * b;

        // Bước 5: Tính thương của a và b
        // Cần kiểm tra nếu b khác 0 để tránh lỗi chia cho 0
        double thuong = 0;
        if (b != 0) {
            thuong = (double) a / b;
        }

        // Bước 6: In ra tổng, hiệu, tích và thương của a và b
        System.out.println("Tổng của a và b là: " + tong);
        System.out.println("Hiệu của a và b là: " + hieu);
        System.out.println("Tích của a và b là: " + tich);
        System.out.println("Thương của a và b là: " + thuong);
    }
}
#3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Nhập tên sản phẩm, số lượng và đơn giá từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        // Bước 2: Tính tổng tiền cho sản phẩm
        double tongTien = soLuong * donGia;

        // Bước 3: Tính thuế VAT
        double thueVAT = 0.1 * tongTien;

        // Bước 4: In ra tên sản phẩm, tổng tiền và thuế VAT phải trả
        System.out.println("Tên sản phẩm làlà: " + tenSanPham);
        System.out.println("Tổng tiền làlà: " + tongTien);
        System.out.println("Thuế VAT làlà: " + thueVAT);
    }
}
#4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập điểm và hệ số của ba môn từ bàn phím
        System.out.println("Nhập điểm và hệ số của ba môn Toán, Lý, Hóa:");
        System.out.print("Điểm môn Toán: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Hệ số môn Toán: ");
        double heSoToan = scanner.nextDouble();

        System.out.print("Điểm môn Lý: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Hệ số môn Lý: ");
        double heSoLy = scanner.nextDouble();

        System.out.print("Điểm môn Hóa: ");
        double diemHoa = scanner.nextDouble();
        System.out.print("Hệ số môn Hóa: ");
        double heSoHoa = scanner.nextDouble();

        // Bước 2: Tính điểm trung bình
        double diemTrungBinh = (diemToan * heSoToan + diemLy * heSoLy + diemHoa * heSoHoa) / (heSoToan + heSoLy + heSoHoa);

        // Bước 3: In ra điểm trung bình của học sinh
        System.out.println("Điểm trung bình của học sinh là: " + diemTrungBinh);

        scanner.close();
    }
}
#5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập bán kính của đường tròn từ bàn phím
        System.out.print("Nhập bán kính của đường tròn: ");
        double banKinh = scanner.nextDouble();

        // Bước 2: Tính chu vi và diện tích của hình tròn
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * Math.pow(banKinh, 2);

        // Bước 3: In ra chu vi và diện tích của hình tròn
        System.out.println("Chu vi của hình tròn là: " + chuVi);
        System.out.println("Diện tích của hình tròn là: " + dienTich);

        scanner.close();
    }
}
#6
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số xe từ bàn phím
        System.out.print("Nhập số xe của bạn (tối đa 5 chữ số): ");
        String soXe = scanner.nextLine();

        // Kiểm tra độ dài của số xe, không được vượt quá 5 chữ số
        if (soXe.length() > 5) {
            System.out.println("Số xe không hợp lệ. Vui lòng nhập lại.");
            return;
        }

        // Tạo một HashSet để lưu trữ các chữ số khác nhau trong số xe
        HashSet<Character> chuSo = new HashSet<>();

        // Duyệt qua từng ký tự trong số xe và thêm vào HashSet
        for (char ch : soXe.toCharArray()) {
            chuSo.add(ch);
        }

        // In ra số nút
        System.out.println("Số nút của số xe " + soXe + " là: " + chuSo.size());

        scanner.close();
    }
}
#7
public class Main {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = i++ + j++; // Tính toán biểu thức và tăng i và j sau khi giá trị của chúng được sử dụng
        System.out.println("Giá trị của a: " + a); // In ra giá trị của a
        System.out.println("Giá trị của i sau khi tăng: " + i); // In ra giá trị của i sau khi tăng lên
        System.out.println("Giá trị của j sau khi tăng: " + j); // In ra giá trị của j sau khi tăng lên
    }
}
#b
public class Main {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = i++ + ++j; // Tính toán biểu thức và tăng j trước khi sử dụng giá trị của nó
        System.out.println("Giá trị của a: " + a); // In ra giá trị của a
        System.out.println("Giá trị của i sau khi tăng: " + i); // In ra giá trị của i sau khi tăng lên
        System.out.println("Giá trị của j sau khi tăng: " + j); // In ra giá trị của j sau khi tăng lên
    }
}
#c
public class Main {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = ++i + j++; // Tính toán biểu thức và tăng i trước khi sử dụng giá trị của nó
        System.out.println("Giá trị của a: " + a); // In ra giá trị của a
        System.out.println("Giá trị của i sau khi tăng: " + i); // In ra giá trị của i sau khi tăng lên
        System.out.println("Giá trị của j sau khi tăng: " + j); // In ra giá trị của j sau khi tăng lên
    }
}
#d
public class Main {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = ++i + ++j; // Tính toán biểu thức và tăng i và j trước khi sử dụng giá trị của chúng
        System.out.println("Giá trị của a: " + a); // In ra giá trị của a
        System.out.println("Giá trị của i sau khi tăng: " + i); // In ra giá trị của i sau khi tăng lên
        System.out.println("Giá trị của j sau khi tăng: " + j); // In ra giá trị của j sau khi tăng lên
    }
}
#8
public class Main {
    public static void main(String[] args) {
        int i = 2; // Khởi tạo biến i với giá trị 2.
        
        System.out.println(i++); // In ra giá trị của i trước khi tăng lên
        System.out.println(++i); // In ra giá trị của i sau khi đã tăng lên
    }
}