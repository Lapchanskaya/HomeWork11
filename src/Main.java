public class Main {
    //Метод 1 Задание 1
    //Расчет високосного года
    public static boolean isLeapYear (int year) {
       return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
    }

    //Метод 2 Задание 1
    //Печать високосного/невисокосного года
    public static void printLeapOrNotLeapYear (int year){
        if (isLeapYear(year)){
            System.out.println( year + " Год является всокосным ");
            return;
        }
        System.out.println(  year + " Год не является всокосным ");
    }
    public static void main(String[] args) {
    // Задание 1
        System.out.println( " Задание 1");
        printLeapOrNotLeapYear(2014);


    }
}