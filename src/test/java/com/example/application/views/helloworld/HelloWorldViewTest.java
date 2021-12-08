package com.example.application.views.helloworld;

import com.example.application.AbstractAppTest;
import com.vaadin.flow.component.UI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.mvysny.kaributesting.v10.LocatorJ._assertOne;

public class HelloWorldViewTest extends AbstractAppTest {
    @BeforeEach
    public void login() {
        login("user", "user");
    }

    @Test
    public void smokeTest() {
        UI.getCurrent().navigate(HelloWorldView.class);
        _assertOne(HelloWorldView.class);
    }
}
