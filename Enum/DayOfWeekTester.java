package pl.itacademy.lesson17;

public class DayOfWeekTester {
    public static void main(String[] args) {
        DayOfWeek d = DayOfWeek.fromEnglishName("Friday");
        System.out.println(d);
        DayOfWeek d1 = DayOfWeek.SAT;
        System.out.println(d1.isWeekend());
    }
}
