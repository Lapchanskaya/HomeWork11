

import java.time.LocalDate;

public class Main {
    private final static int currentYear = LocalDate.now().getYear();
    // Задание 1 Метод 1
    //Расчет високосного года
    public static boolean isLeapYear (int year) {
       return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
    }

    // Задание 1 Метод 1
    //Печать високосного/невисокосного года
    public static void printLeapOrNotLeapYear (int year){
        if (isLeapYear(year)){
            System.out.println( year + " Год является всокосным ");
            return;
        }
        System.out.println(  year + " Год не является всокосным ");
    }




    //Задание 2 Метод 1
    // определение андройда или айфона
    public static String identificationOs ( int versionOS) {
        if (versionOS == 0) {
            return "IOS";
        } else if (versionOS == 1) {
            return "Android";
        } else {
          throw new RuntimeException(" Такой операционной системы не существует");
        }
    }

    //Задание 2 Метод 2
    // Определение текущего года
    public static boolean isNowYear(int year){
        return year == currentYear;
    }
    // Задание 2 Метод 3
    // Определение версии ос
    public static void printVersionOS( int year, int versionOS){
        if (isNowYear(year)){
            System.out.println( " Установите полную версию для Вашего " + identificationOs(versionOS));
        }else{
            System.out.println(" Установите lite версию для Вашего " + identificationOs(versionOS)) ;
        }
    }
    // Задание 3 Метод 1
    // Печать дистанции и времени доставки
    public static void printTimeDelivery (int distance){
        if (distance > 0 && distance < 2000 ){
            System.out.println( " Время доставки  = " + ((distance+19)/40+1));
        }else{
            throw new RuntimeException(" Доставка меньше 0 км и свыше 2000 км не осуществляется");
        }

    }


    public static void main(String[] args) {
    // Задание 1
        System.out.println( " Задание 1");
        printLeapOrNotLeapYear(2014);

    // Задание 2
        System.out.println( " Задание 2");
        printVersionOS( 2022, 0);
    // Задание 3
        System.out.println( " Задание 3");

        printTimeDelivery( 17);
        printTimeDelivery( 25);
        printTimeDelivery( -61);
        printTimeDelivery( 2050);


    }
}