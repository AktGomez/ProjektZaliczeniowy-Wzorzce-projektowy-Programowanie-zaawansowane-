package interfaces;
import org.junit.jupiter.api.Assertions;
import website.*;
import banking.*;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;


class interfaces {

    @Test
    void phpDeveloperImplementsInterface() {
        Developer developer = new PHPDeveloper();
        Assertions.assertTrue(developer instanceof Developer);
    }

    @Test
    void websiteProjectManagerImplementsInterface() {
        ProjectManager projectManager = new WebsiteProjectManager();
        Assertions.assertTrue(projectManager instanceof ProjectManager);
    }

    @Test
    void websiteTesterImplementsInterface() {
        Tester tester = new WebsiteTester();
        Assertions.assertTrue(tester instanceof Tester);
    }

    @Test
    void javaDeveloperImplementsInterface() {
        Developer developer = new JavaDeveloper();
        Assertions.assertTrue(developer instanceof Developer);
    }

    @Test
    void bankingProjectManagerImplementsInterface() {
        ProjectManager projectManager = new BankingProjectManager();
        Assertions.assertTrue(projectManager instanceof ProjectManager);
    }

    @Test
    void qaTesterImplementsInterface() {
        Tester tester = new QATester();
        Assertions.assertTrue(tester instanceof Tester);
    }

}