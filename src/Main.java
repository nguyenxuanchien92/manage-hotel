import methods.ManageHotel;

import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private final static String REGEX_PATTERN = "^[0-9]+$";

    public static void main(String[] args) throws ParseException {
        createMenu();
    }

    private static void createMenu() throws ParseException {
        String choice = "";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Đăng ký nhận phòng");
            System.out.println("2.Hiển thị thông tin khách hàng");
            System.out.println("3.Khách trả phòng");
            System.out.println("0.Exit");

            choice = sc.nextLine();
            boolean result = isValidate(choice);
            if (result) {
                int val =Integer.valueOf(choice);
                selectChoice(val);
            } else {
                System.out.println("Bạn nhập dạng sai dạng dữ liệu\n");
                choice = - 1 + "";
            }

        } while (Integer.valueOf(choice) != 0);

        System.out.println("Chương trình kết thúc");
    }

    private static void selectChoice(int choice) throws ParseException {
        ManageHotel manageHotel = new ManageHotel();
        switch (choice) {
            case 1:
                manageHotel.createRoom();
                break;
            case 2:
                manageHotel.showCusInfo();
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

    private static boolean isValidate(String choice) {
        Pattern pattern = Pattern.compile(REGEX_PATTERN);
        Matcher matcher = pattern.matcher(choice);

        return matcher.matches();
    }
}
// đây cũng có thể là 1 comment ẳn
