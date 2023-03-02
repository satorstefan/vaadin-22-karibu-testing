package com.example.application.views.login;

import com.example.application.AbstractAppTest;
import com.example.application.views.helloworld.HelloWorldView;
import com.vaadin.flow.component.UI;
import org.junit.jupiter.api.Test;

import static com.github.mvysny.kaributesting.v10.LocatorJ._assertOne;

public class LoginViewTest extends AbstractAppTest {
    @Test
    public void smokeTest() {
        UI.getCurrent().navigate(LoginView.class);
        _assertOne(LoginView.class);
    }

    @Test
    public void securityRedirectWorks() {
        UI.getCurrent().navigate(HelloWorldView.class);
        _assertOne(LoginView.class);
    }
}
