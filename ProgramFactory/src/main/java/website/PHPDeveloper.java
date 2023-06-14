package website;

import interfaces.Developer;

public class PHPDeveloper implements Developer {

    private String result;
    @Override
    public void writeCode() {
        result = "PHP developer writes PHP code...";
        System.out.println(result);

    }

    @Override
    public String getStringResult() {
        return result;
    }
}
