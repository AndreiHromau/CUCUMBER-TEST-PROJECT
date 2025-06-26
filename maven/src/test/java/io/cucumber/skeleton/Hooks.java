package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @Before
    public static void beforeAll() {
        System.out.println("перед тестами реализация чего-то");
    }

    @After
    public static void afterAll() {
        System.out.println("после тестов реализация чего-то");
    }
}
