public class ControlStatementsPractice {
    public static void main(String[] args) {

        // IF-ELSE-IF EXAMPLE
        int score = 65;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // SWITCH EXAMPLE
        int option = 2;

        switch (option) {
            case 1:
                System.out.println("Check Balance");
                break;
            case 2:
                System.out.println("Withdraw Money");
                break;
            case 3:
                System.out.println("Deposit Money");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
