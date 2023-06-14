package banking;

import interfaces.Developer;

public class JavaDeveloper implements Developer {

    private String result;
    @Override
    public void writeCode() {
        result = "Java Developer writes Java code...";
        System.out.println(result);

    }

    @Override
    public String getStringResult() {
        return result;
    }


}
