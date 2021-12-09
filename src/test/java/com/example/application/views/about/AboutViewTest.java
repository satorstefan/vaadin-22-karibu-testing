package com.example.application.views.about;

import com.example.application.AbstractAppTest;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.NotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.mvysny.kaributesting.v10.LocatorJ._assertOne;
import static org.junit.jupiter.api.Assertions.*;

class AboutViewTest extends AbstractAppTest {
    @BeforeEach
    public void login() {
        login("admin", "admin", Arrays.asList("admin"));
    }

    @Test
    public void smokeTest() {
        UI.getCurrent().navigate(AboutView.class);
        _assertOne(AboutView.class);
    }

    @Test
    public void userCantSeeThis() {
        login("user", "user", Arrays.asList("user"));
        final NotFoundException ex = assertThrows(NotFoundException.class, () -> {
            UI.getCurrent().navigate(AboutView.class);
        });
        // in production mode, the `Access denied` is ommitted
//        assertTrue(ex.getMessage().contains("No route found for 'about': Access denied"), ex.getMessage());
        assertTrue(ex.getMessage().contains("No route found for 'about'"), ex.getMessage());
    }
}
