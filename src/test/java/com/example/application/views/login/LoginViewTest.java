package com.example.application.views.login;

import com.example.application.AbstractAppTest;
import com.github.mvysny.kaributesting.v10.MockVaadin;
import com.github.mvysny.kaributesting.v10.Routes;
import com.vaadin.flow.component.UI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.mvysny.kaributesting.v10.LocatorJ._assertOne;
import static org.junit.jupiter.api.Assertions.*;

public class LoginViewTest extends AbstractAppTest {
    @Test
    public void smokeTest() {
        UI.getCurrent().navigate(LoginView.class);
        _assertOne(LoginView.class);
    }
}
