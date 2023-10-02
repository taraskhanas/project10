package Part1;

public class Part1_References {
    public static void main(String[] args) {

        //Assignments
        Assignments assignment = new Assignments(1);
        Assignments assignment1 = new Assignments(2);
        Assignments assignment2 = new Assignments(3);
        print(assignment, assignment1, assignment2);

        assignment1 = assignment;
        assignment2 = assignment;

        print(assignment, assignment1, assignment2);

        assignment1.assignment = 2;
        print(assignment, assignment1, assignment2);

        assignment1.assignment = 3;
        print(assignment, assignment1, assignment2);

        //
        System.out.println();
        //

        //Arguments
        Arguments argument = new Arguments(5);
        System.out.println(argument.argument);

        changeArgument(argument);
        System.out.println(argument.argument);
    }

    public static void print(Assignments a, Assignments b, Assignments c){
        System.out.printf("%d, %d, %d\n", a.assignment, b.assignment, c.assignment);
    }

    public static void changeArgument(Arguments argument){
        argument.argument *= 2;
    }

}
