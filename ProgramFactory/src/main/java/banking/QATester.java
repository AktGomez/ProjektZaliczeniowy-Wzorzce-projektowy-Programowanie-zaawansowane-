package banking;

import interfaces.Tester;

public class QATester implements Tester {

    private String result;
    @Override
    public void testCode() {
        result = "QA tester tests code...";
        System.out.println(result);


    }

    @Override
    public String getStringResult() {
        return result;
    }
}
