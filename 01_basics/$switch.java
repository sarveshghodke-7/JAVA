public class $switch {
    public static void main(String[] args){
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
        
        // Switch statement is used to execute one block of code among many options based on the value of a variable.
        // The switch statement evaluates the expression and matches the value with the corresponding case label.
        // If a match is found, the code block associated with that case is executed until a break statement is encountered.
        // If no match is found, the code block associated with the default label is executed (if present).
        // In this example, the value of the variable 'day' is 3, so the code block associated with case 3 is executed, 
        // which assigns "Wednesday" to the variable 'dayName'.
        // The break statement is used to exit the switch statement after a case has been executed. If the break statement 
        // is omitted, the code will continue to execute the next case(s) until a break statement is encountered or the switch statement ends.
        // The default case is optional and can be used to handle any values that do not match any of the specified cases. 
        // It is executed when none of the cases match the value of the expression.
    }    
}
