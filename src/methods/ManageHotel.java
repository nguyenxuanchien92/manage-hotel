package methods;

import models.Customer;
import models.Room;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManageHotel {
    private Scanner sc;


    public void createRoom() throws ParseException {
        sc = new Scanner(System.in);
        System.out.println("Nhập thông tin khách hàng");
        System.out.println("Tên khách hàng");
        String nameCustomer = sc.nextLine();
        System.out.print("DOB(dd-MM-yyyy): ");
        String dobCustomer = sc.nextLine();
        System.out.println("CMND: ");
        String userId = sc.nextLine();
        System.out.print("Số ngày thuê trọ của khách:");
        String dateOfRent = sc.nextLine();

        boolean resultDOB = isDOB(dobCustomer);
        boolean resultUserId = isUserId(userId);
        if (resultDOB || resultUserId) {
            Customer customer = new Customer(nameCustomer, dobCustomer, Long.valueOf(userId));
            System.out.println(customer);
        } else {
            System.out.println("bạn nhập sai dạng dữ liệu DOB or User Id");
        }

    }

    private boolean isDOB(String dob) {
        String patterDOB = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

        Pattern pattern = Pattern.compile(patterDOB);
        Matcher matcher = pattern.matcher(dob);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    private boolean isUserId(String userId) {
        String patternUserId = "^(?!\\d+$)\\w{8,20}$";

        Pattern pattern = Pattern.compile(patternUserId);
        Matcher matcher = pattern.matcher(userId);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
