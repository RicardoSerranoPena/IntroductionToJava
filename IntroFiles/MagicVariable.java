public class MagicVariable {

    public static void main(String[] args) {

        final int WORKDAYS = 5;
        int hoursWorked = 40;

        int dailyWorkHours = hoursWorked / WORKDAYS;
        System.out.println(dailyWorkHours);
    }
}
