package website;

import interfaces.Developer;
import interfaces.ProjectManager;
import interfaces.ProjectTeamFactory;
import interfaces.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebsiteTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsiteProjectManager();
    }
}
