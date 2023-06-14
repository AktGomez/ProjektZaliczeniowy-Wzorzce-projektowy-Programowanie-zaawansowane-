package banking;

import interfaces.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    private String result;
    @Override
    public void manageProject() {
        result = "Project Manager manages banking project...";
        System.out.println(result);


    }

    @Override
    public String getStringResult() {
        return result;
    }
}
