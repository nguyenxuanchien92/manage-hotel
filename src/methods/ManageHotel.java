package methods;

import models.Customer;
import models.Hotel;
import models.Room;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManageHotel {
    private Scanner sc;

    public void createRoom() throws ParseException {
        sc = new Scanner(System.in);

        HashMap hashMap = initDataCustomer(sc);

        // lấy các giá trị cần cho việc validate
//        boolean resultDOB = false;
//        boolean resultUserId = false;
//        Set<String> keys = hashMap.keySet();
//        for (String key : keys) {
//            if (key.equals("dobCustomer")) {
//                resultDOB = isDOB((String) hashMap.get(key));
//            }
//            if (key.equals("userId")) {
//                resultUserId = isUserId((String) hashMap.get(key));
//            }
//        }

//        boolean resultDOB = isDOB(map.k);
//        boolean resultUserId = isUserId(userId);


//        if (resultDOB || resultUserId) {
//
//            Hotel hotel = new Hotel();
//
//            System.out.println();
//        } else {
//            System.out.println("bạn nhập sai dạng dữ liệu DOB or User Id");
//        }

    }

    private HashMap initDataCustomer(Scanner sc) {

        HashMap<String, String> hashMap = new HashMap<>();

        System.out.println("Nhập thông tin khách hàng");
        System.out.println("Tên khách hàng");
        String nameCustomer = sc.nextLine();
        System.out.print("DOB(dd-MM-yyyy): ");
        String dobCustomer = sc.nextLine();
        System.out.println("CMND: ");
        String userId = sc.nextLine();
        System.out.print("Loại phòng: ");
        String typeRoom = sc.nextLine();
        System.out.print("Giá phòng: ");
        String priceRoom = sc.nextLine();
        System.out.print("Số ngày thuê trọ của khách:");
        String dateOfRent = sc.nextLine();

        // khởi tạo customer and room

        hashMap.put("nameCustomer", nameCustomer);
        hashMap.put("dobCustomer", dobCustomer);
        hashMap.put("userId", userId);
        hashMap.put("typeRoom", typeRoom);
        hashMap.put("priceRoom", priceRoom);
        hashMap.put("dateOfRent", dateOfRent);

        return hashMap;
    }

    private boolean isValidateDOB(String dob) {
        String patterDOB = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

        Pattern pattern = Pattern.compile(patterDOB);
        Matcher matcher = pattern.matcher(dob);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    private boolean isValidateUserId(String userId) {
        String patternUserId = "^(?!\\d+$)\\w{8,20}$";

        Pattern pattern = Pattern.compile(patternUserId);
        Matcher matcher = pattern.matcher(userId);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
