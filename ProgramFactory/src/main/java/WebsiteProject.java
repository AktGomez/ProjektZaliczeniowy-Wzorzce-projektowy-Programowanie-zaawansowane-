import banking.BankingTeamFactory;
import website.WebsiteTeamFactory;
import interfaces.Developer;
import interfaces.ProjectManager;
import interfaces.ProjectTeamFactory;
import interfaces.Tester;

public class WebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating site... ");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
