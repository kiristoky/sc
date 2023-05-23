import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simpan member dan guest dalam HashMap
        Map<String, Member> members = new HashMap<>();
        Map<String, Double> guests = new HashMap<>();

        // Simpan menu makanan dalam ArrayList
        List<MenuItem> menuItems = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\|");

            String command = inputArr[0];

            switch (command) {
                case "CREATE MEMBER":
                    String memberId = inputArr[1];
                    String name = inputArr[2];
                    String joinDate = inputArr[3];
                    double balance = Double.parseDouble(inputArr[4]);

                    Member member = new Member(memberId, name, joinDate, balance);
                    members.put(memberId, member);
                    System.out.println("CREATE MEMBER SUCCESS: " + memberId + " " + name);
                    break;
                case "CREATE GUEST":
                    String guestId = inputArr[1];
                    double guestBalance = Double.parseDouble(inputArr[2]);

                    guests.put(guestId, guestBalance);
                    System.out.println("CREATE GUEST SUCCESS: " + guestId + " " + guestBalance);
                    break;
                case "CREATE MENU MAKANAN":
                    String itemId = inputArr[1];
                    String itemName = inputArr[2];
                    double itemPrice = Double.parseDouble(inputArr[3]);

                    MenuItem menuItem = new MenuItem(itemId, itemName, itemPrice, "MAKANAN");
                    menuItems.add(menuItem);
                    System.out.println("CREATE MENU SUCCESS: " + itemId + " " + itemName);
                    break;
                case "CREATE MENU MINUMAN":
                    String drinkItemId = inputArr[1];
                    String drinkName = inputArr[2];
                    double drinkPrice = Double.parseDouble(inputArr[3]);
                    String drinkSize = inputArr[4];

                    MenuItem drinkMenuItem = new MenuItem(drinkItemId, drinkName, drinkPrice, "MINUMAN (" + drinkSize + ")");
                    menuItems.add(drinkMenuItem);
                    System.out.println("CREATE MENU SUCCESS: " + drinkItemId + " " + drinkName);
                    break;
                case "CREATE PROMO DELIVERY":
                    String promoCode = inputArr[1];
                    String startDate = inputArr[2];
                    String endDate = inputArr[3];
                    double discountRate = Double.parseDouble(inputArr[4]);
                    double minimumAmount = Double.parseDouble(inputArr[5]);
                    double maximumAmount = Double.parseDouble(inputArr[6]);

                    Promo promoDelivery = new Promo(promoCode, startDate, endDate, discountRate, minimumAmount, maximumAmount);
                    break;
                case "CREATE PROMO CASHBACK":
                    promoCode = inputArr[1];
                    startDate = inputArr[2];
                    endDate = inputArr[3];
                    discountRate = Double.parseDouble(inputArr[4]);
                    minimumAmount = Double.parseDouble(inputArr[5]);
                    maximumAmount = Double.parseDouble(inputArr[6]);

                    Promo promoCashback = new Promo(promoCode, startDate, endDate, discountRate, minimumAmount, maximumAmount);
                    break;
                case "CREATE PROMO DISCOUNT":
                    promoCode = inputArr[1];
                    startDate = inputArr[2];
                    endDate = inputArr[3];
                    discountRate = Double.parseDouble(inputArr[4]);
                    minimumAmount = Double.parseDouble(inputArr[5]);
                    maximumAmount = Double.parseDouble(inputArr[6]);

                    Promo promoDiscount = new Promo(promoCode, startDate, endDate, discountRate, minimumAmount, maximumAmount);
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}

//CREATE MEMBER|A001|Ani|2023/01/10|10
//CREATE GUEST|G001|150000
//gabisa tulisan persen