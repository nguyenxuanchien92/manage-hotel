import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createMenu();
    }

    private static void createMenu() {
        int choice = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Đăng ký nhận phòng");
            System.out.println("2.Hiển thị thông tin khách hàng");
            System.out.println("3.Khách trả phòng");
            System.out.println("0.Exit");

            choice = Integer.valueOf(sc.nextLine());
            selectChoice(choice);

        } while (choice != 0);

        System.out.println("Chương trình kết thúc");
    }

    private static void selectChoice(int choice) {

        //viêt một regex cho việc chọn string

        switch (choice) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 0:
                break;
            default:
                System.out.println("Lựa chọn sai, yêu cầu lựa chọn lại lần nữa\n");
        }
    }
}
