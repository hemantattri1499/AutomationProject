package cucumberIntegrationTests.stepDefinitions.windows;

import java.io.IOException;

import UITestFramework.CreateSession;
import cucumberIntegrationTests.screens.windows.WindowsLoginScreen;

public class WindowsLoginSteps {
    WindowsLoginScreen iwindowsLoginScreen;

    public WindowsLoginSteps(CreateSession createSession) throws IOException {
    	iwindowsLoginScreen = new WindowsLoginScreen(createSession.driver);
    }
    

}
