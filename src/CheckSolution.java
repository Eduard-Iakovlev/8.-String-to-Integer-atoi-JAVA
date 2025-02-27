public class CheckSolution {
    private int expected, result;
    public CheckSolution(int expected, int result) {
        this.expected = expected;
        this.result = result;
    }
    public boolean check() {
        return expected == result;
    }
}
