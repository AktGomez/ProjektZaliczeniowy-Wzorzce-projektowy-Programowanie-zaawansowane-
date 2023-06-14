package website;

import interfaces.Tester;

public class WebsiteTester implements Tester {

    private String result;
    @Override
    public void testCode() {
        result = "Website Tester tests site...";
        System.out.println(result);

    }

    @Override
    public String getStringResult() {
        return result;
    }
}
