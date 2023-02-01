public class Main {
    public static void printYearLeap(int yearLeap) {
        if (yearLeap % 4 == 0 && yearLeap % 100 != 0 || yearLeap % 400 == 0) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }
    }
    public static void printOsSystem(int year,int os) {
        if(year>=2015 && os==0){
            System.out.println("Установите версию на сайте для IOS");
        } if(year<2015 && os==0){
            System.out.println("Установите облегчённую версию для IOS");
        }if (year>=2015 && os==1){
            System.out.println("Усатновите версию на сайте для Андроид");
        } if (year<2015 && os==1) {
            System.out.println("Установите облегчённую версию для Андроид");
        }
    }
    public static void printDeliveryDays(int distant, int time){
        if (distant<=20){
            time = 1;
            System.out.println("Доставка займёт "+ time+ " день");
        }
        if (distant>=20 && distant<60) {
            time = time+1;
            System.out.println("Доставка займёт "+ time+ " дня");
        }
        if (distant>=60 && distant<100){
            time = time+2;
            System.out.println("Доставка займёт "+ time+ " дня");
        }
        if (distant>100){
            System.out.println("Доставки нет");
        }

    }


    public static void main (String[]args){
        Task1();
        Task2();
        Task3();
    }


    public static void Task1 () {
        System.out.println("Задание1");
        int year = 2021;
        printYearLeap(year);
    }

    public static void Task2 () {
        System.out.println("Задание2");
        int os = 0;
        int year =2010;
        printOsSystem(year,os );
    }
    public static void Task3 () {
        System.out.println("Задание3");
        int deliveryDistant = 114;
        int timeDelivery = 1;
        printDeliveryDays(deliveryDistant,timeDelivery );


    }

}