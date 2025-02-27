public class OutputSolkution {
    private int example, expected, result;
    String s;

    public OutputSolkution() {}
    public void setOutputData(int example, int expected, String s) {
        this.example = example;
        this.expected = expected;
        this.s = s;
    }

    public void printSolution() {
        setResult();
        System.out.println("============ Тест " + example + " =============");
        System.out.println(" Входные данные: s = \"" + s + "\"");
        System.out.println(" Ожидаемый результат: " + expected);
        System.out.println(" Результат: " + result);
        System.out.println("============ Проверка =============");
        printCheck();
        System.out.println("==================================");
    }

    private void setResult() {
        Solution solution = new Solution();
        this.result = solution.myAtoi(s);
    }

    private void printCheck() {
        CheckSolution checkSolution = new CheckSolution(expected, result);
        if ((checkSolution.check())) {
            System.out.println("Проверка пройдена успешно");
        } else {
            System.out.println("Проверка не пройдена");
        }
    }

}
