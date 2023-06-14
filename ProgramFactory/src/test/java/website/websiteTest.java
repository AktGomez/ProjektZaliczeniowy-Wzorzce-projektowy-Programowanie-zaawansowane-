package website;

import interfaces.*;
import interfaces.ProjectManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



class websiteTest {






    //Jednostkowe testty
    @Test
    void phpDeveloperShouldPrintMessage() {
        Developer phpDeveloper = new PHPDeveloper();

        phpDeveloper.writeCode();
        Assertions.assertEquals("PHP developer writes PHP code...", phpDeveloper.getStringResult());
    }

    @Test
    void websiteProjectManagerShouldPrintMessage() {
        ProjectManager projectManager = new WebsiteProjectManager();


        projectManager.manageProject();
        Assertions.assertEquals("Website project manager manages website project...", projectManager.getStringResult());

    }

    @Test
    void websiteTesterShouldPrintMessage() {
        Tester websiteTester = new WebsiteTester();

        websiteTester.testCode();
        Assertions.assertEquals("Website Tester tests site...", websiteTester.getStringResult());
    }

    //Integracyjne testy

    @Test
    void websiteProjectManagerAndPHPDeveloperIntegrationTest() {
        ProjectManager projectManager = new WebsiteProjectManager();
        Developer developer = new PHPDeveloper();

        projectManager.manageProject();
        developer.writeCode();


        Assertions.assertEquals("Website project manager manages website project... PHP developer writes PHP code...",
                projectManager.getStringResult() + " " + developer.getStringResult());
    }

    @Test
    void phpDeveloperAndWebsiteTesterIntegrationTest() {
        Developer developer = new PHPDeveloper();
        Tester tester = new WebsiteTester();

        developer.writeCode();
        tester.testCode();


        Assertions.assertEquals("PHP developer writes PHP code... Website Tester tests site...",
                developer.getStringResult() + " " + tester.getStringResult());
    }

    //Akceptacyjne testy

    @Test
    void websiteProjectTeamFactoryTest() {
        ProjectTeamFactory teamFactory = new WebsiteTeamFactory();

        // Создание команды проекта с использованием WebsiteTeamFactory
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        // Замените вывод на консоль на проверку ожидаемого результата
        Assertions.assertEquals("PHP developer writes PHP code... Website Tester tests site... Website project manager manages website project...",
                developer.getStringResult() + " " + tester.getStringResult() + " " + projectManager.getStringResult());
    }

    @Test
    void websiteProjectExecutionTest() {
        ProjectTeamFactory teamFactory = new WebsiteTeamFactory();

        // Создание команды проекта с использованием WebsiteTeamFactory
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        // Имитация выполнения проекта
        String projectExecutionResult = executeWebsiteProject(developer, tester, projectManager);

        // Замените вывод на консоль на проверку ожидаемого результата
        Assertions.assertEquals("PHP developer writes PHP code... Website Tester tests site... Website project manager manages website project... Project execution is successful.",
                projectExecutionResult);
    }

    private String executeWebsiteProject(Developer developer, Tester tester, ProjectManager projectManager) {
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
        StringBuilder resul = new StringBuilder();
        resul.append(developer.getStringResult()).append(" ");
        resul.append(tester.getStringResult()).append(" ");
        resul.append(projectManager.getStringResult()).append(" ");
        resul.append("Project execution is successful.");

        return resul.toString();
    }

}