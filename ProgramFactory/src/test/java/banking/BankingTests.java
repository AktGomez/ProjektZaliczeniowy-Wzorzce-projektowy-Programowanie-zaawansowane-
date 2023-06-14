package banking;
import interfaces.*;
import interfaces.ProjectManager;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class BankingTests {



    //testy jednostkowe
    @Test
    void projectManagerShouldPrintMessage() {
        ProjectManager projectManager = new BankingProjectManager();

        projectManager.manageProject();

        Assertions.assertEquals("Project Manager manages banking project...", projectManager.getStringResult());

    }

    @Test
    void javaDeveloperShouldPrintMessage() {
        Developer developer = new JavaDeveloper();


        developer.writeCode();
        Assertions.assertEquals("Java Developer writes Java code...", developer.getStringResult());

    }

    @Test
    void qaTesterShouldPrintMessage() {
        Tester tester = new QATester();


        tester.testCode();
        Assertions.assertEquals("QA tester tests code...", tester.getStringResult());
    }


    //Integracyjne testy
    @Test
    void bankingProjectManagerAndJavaDeveloperIntegrationTest() {
        ProjectManager projectManager = new BankingProjectManager();
        Developer developer = new JavaDeveloper();

        projectManager.manageProject();
        developer.writeCode();


        Assertions.assertEquals("Project Manager manages banking project... Java Developer writes Java code...",
                projectManager.getStringResult() + " " + developer.getStringResult());
    }

    @Test
    void javaDeveloperAndTesterIntegrationTest() {
        Developer developer = new JavaDeveloper();
        Tester tester = new QATester();

        developer.writeCode();
        tester.testCode();


        Assertions.assertEquals("Java Developer writes Java code... QA tester tests code...",
                developer.getStringResult() + " " + tester.getStringResult());
    }


    //Akceptacyjne testy

    @Test
    void bankingProjectTeamFactoryTest() {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();


        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();


        Assertions.assertEquals("Java Developer writes Java code... QA tester tests code... Project Manager manages banking project...",
                developer.getStringResult() + " " + tester.getStringResult() + " " + projectManager.getStringResult());
    }

    @Test
    void bankingProjectExecutionTest() {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();


        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();


        String projectExecutionResult = executeBankingProject(developer, tester, projectManager);


        Assertions.assertEquals("Java Developer writes Java code... QA tester tests code... Project Manager manages banking project... Project execution is successful.",
                projectExecutionResult);
    }

    private String executeBankingProject(Developer developer, Tester tester, ProjectManager projectManager) {
        StringBuilder result = new StringBuilder();
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
        result.append(developer.getStringResult()).append(" ");
        result.append(tester.getStringResult()).append(" ");
        result.append(projectManager.getStringResult()).append(" ");
        result.append("Project execution is successful.");

        return result.toString();
    }

}



