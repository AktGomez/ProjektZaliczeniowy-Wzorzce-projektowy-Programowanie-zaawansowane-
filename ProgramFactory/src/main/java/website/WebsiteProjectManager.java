package website;

import interfaces.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {

    private String result;
    @Override
    public void manageProject() {
        result = "Website project manager manages website project...";
        System.out.println(result);

    }

    @Override
    public String getStringResult() {
        return result;
    }
}
