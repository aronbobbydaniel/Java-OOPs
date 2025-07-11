
public class Switchclass {
    public static void main(String[] args) {
        String Day = "Monday";

        String Week = switch (Day) {
            case "Monday" -> "Python Test";
            case "Tuesday" -> "C Test";
            case "Wednesday" -> "Math Test";
            case "Thrusday" -> "Physics Test";
            case "Friday" -> "Lab Test";
            default -> "Holiday";
        };

        System.out.println("Today is " + Day);
        System.out.println("Exam: " + Week);
    }
}
