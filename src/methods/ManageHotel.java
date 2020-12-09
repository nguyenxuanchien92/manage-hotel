package methods;

import models.Customer;
import models.Hotel;
import models.Room;
import models.TypeRoom;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManageHotel {
    private Scanner sc;
    private static HashMap hashMap = new HashMap();
    private static final String NAME_FILE = "ListCustomer.csv";

    public void createRoom() {
        sc = new Scanner(System.in);
        hashMap = initDataCustomer(sc);
        Hotel hotelCustomer = null;

        String dobCustomer = (String) hashMap.get("dobCustomer");
        String userId = (String) hashMap.get("userId");
        String nameCustomer = (String) hashMap.get("nameCustomer");
        TypeRoom typeRoom = (TypeRoom) hashMap.get("typeRoom");
        String dateOfRent = (String) hashMap.get("dateOfRent");

        boolean result = checkValidate(dobCustomer, userId);

        if (result) {
            // demo create data hotel
            Customer customer = new Customer(nameCustomer, dobCustomer, userId);
            Room room = null;

            switch (typeRoom.name()) {
                case "VIP":
                    room = new Room(TypeRoom.VIP.value, typeRoom, dateOfRent);
                    break;
                case "ECONOMY":
                    room = new Room(TypeRoom.ECONOMY.value, typeRoom, dateOfRent);
                    break;
            }
            hotelCustomer = new Hotel(customer, room);
        } else {
            System.out.println("Bạn nhập sai định dạng DOB hoặc user id");
        }

        System.out.println(hotelCustomer);
        //ghi ra file csv
        writeFile(hashMap, NAME_FILE);

    }

    private void writeFile(HashMap hashMap, String fileName) {
        boolean result = createFile(fileName);
        if (result) {

        }
    }

    private boolean createFile(String fileName) {

        File file = new File(fileName);
        if (file.exists()) {
            try {
                file.createNewFile();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private boolean checkValidate(String dob, String userId) {

        boolean resultDob = isValidateDOB(dob);
        boolean resultUserId = isValidateUserId(userId);

        if (resultDob && resultUserId) {
            return true;
        }
        return false;
    }

    private HashMap initDataCustomer(Scanner sc) {

        HashMap<Object, Object> hashMap = new HashMap<>();

        System.out.println("Nhập thông tin khách hàng");
        System.out.println("Tên khách hàng");
        String nameCustomer = sc.nextLine();
        System.out.print("DOB(dd-MM-yyyy): ");
        String dobCustomer = sc.nextLine();
        System.out.println("CMND: ");
        String userId = sc.nextLine();
        System.out.print("Loại phòng: ");
        String typeRoom = sc.nextLine();

        TypeRoom valType = selectTypeRoom(typeRoom);

        System.out.print("Số ngày thuê trọ của khách:");
        String dateOfRent = sc.nextLine();

        // khởi tạo customer and room

        hashMap.put("nameCustomer", nameCustomer);
        hashMap.put("dobCustomer", dobCustomer);
        hashMap.put("userId", userId);
        hashMap.put("typeRoom", valType);
//        hashMap.put("priceRoom", priceRoom);


        hashMap.put("dateOfRent", dateOfRent);

        return hashMap;
    }

    private TypeRoom selectTypeRoom(String typeRoom) {
        String val = typeRoom.toUpperCase();
        switch (val) {
            case "VIP":
                return TypeRoom.VIP;
        }
        return TypeRoom.ECONOMY;
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
        String patternUserId = "\\d+";

        Pattern pattern = Pattern.compile(patternUserId);
        Matcher matcher = pattern.matcher(userId);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
