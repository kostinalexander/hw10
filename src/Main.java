import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var yearLeap = 2020;
        if (isYearLeap(yearLeap)){
            System.out.println(yearLeap + " Год високосный");
        } else {
            System.out.println( yearLeap + " Год не високосный");
        }

     printAppType(1, 2011);
        int days = countDeliveryDays(6);
        if (days >0) {
            System.out.println("Доставка займёт "+ days+ " день");
        }


    }
    public static int countDeliveryDays(int deliveryDistance) {
        if (deliveryDistance>100){
            return -1;
        }
        int days = 1;
        if (deliveryDistance>20){
            days++;
        }
        if (deliveryDistance>60){
            days++;
        }
        return days;
    }
    public static void printAppType(int os, int year){
        int currentYear = LocalDate.now().getYear();
        String osName = os == 0 ? " iOs " : " Anroid";
        String appType = year == currentYear ? " обычную " : " облегчённую ";
        System.out.println(" установите "+ appType+ " версию приложения для "+ osName);

    }
    public static boolean isYearLeap(int yearLeap) {
        return  yearLeap % 4 == 0 && yearLeap % 100 != 0 || yearLeap % 400 == 0;
        }

        }


