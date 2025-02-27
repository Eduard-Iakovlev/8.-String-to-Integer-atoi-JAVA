public class Main {
    public static void main(String[] args) {
        int example = 0;
        int expected;
        String s;

        OutputSolkution outputSolkution = new OutputSolkution();

        example++;
        s = "42";
        expected = 42;
        outputSolkution.setOutputData(example, expected, s);
        outputSolkution.printSolution();

        example++;
        s = "-042";
        expected = -42;
        outputSolkution.setOutputData(example, expected, s);
        outputSolkution.printSolution();

        example++;
        s = "1337c0d3";
        expected = 1337;
        outputSolkution.setOutputData(example, expected, s);
        outputSolkution.printSolution();

        example++;
        s = "0-1";
        expected = 0;
        outputSolkution.setOutputData(example, expected, s);
        outputSolkution.printSolution();

        example++;
        s = "words and 987";
        expected = 0;
        outputSolkution.setOutputData(example, expected, s);
        outputSolkution.printSolution();


    }
}