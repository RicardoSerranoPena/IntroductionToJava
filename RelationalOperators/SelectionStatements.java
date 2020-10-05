class SelectionStatements {

    public static void main (String[] args) {

        // boolean hasACat = true;

        // if (hasACat) {
        //     System.out.println("You do have a cat");
        // } else {
        //     System.out.println("You do not have a cat");
        // }
        
        int age = 70;
        if (age >= 18 && age < 65) {
            System.out.println("You are over 18");
        } 
        else if (age <= 13) {
            System.out.println("You qualify for a child's discount");
        } else if (age >= 65) {
            System.out.println("You qualify for a senior citizen discount");
        }
        else {
            System.out.println("You are under 18");
        }

    }
}