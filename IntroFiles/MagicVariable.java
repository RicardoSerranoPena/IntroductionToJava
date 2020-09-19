public class MagicVariable {

    public static void main(String[] args) {

        int hoursWorked = 40;
        final int WORKDAYS = 5;

        int dailyWorkHours = hoursWorked / WORKDAYS;
        System.out.println(dailyWorkHours);
    }
}
