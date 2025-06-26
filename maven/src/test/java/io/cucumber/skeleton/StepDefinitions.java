package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static io.cucumber.skeleton.TextGenerator.generateRandomText;
import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions { //наш 2ой слой

    private User user; //передали объект пользователь как поле для проверки

    @Given("пользователь успешно создан")
    public void пользовательУспешноСоздан() {
        String name = generateRandomText(5);
        String email = generateRandomText(10) + "@gmail.com";
        String password = generateRandomText(10);
        user = new User(name, email, password);
    }

    @When("пользователь заходит на страницу {string}")
    public void пользовательЗаходитНаСтраницу(String arg0) {
        if (user == null) {
            throw new RuntimeException("Пользователь не был создан");
        }
    }

    @And("пользователь вводит валидный логин {string}")
    public void пользовательВводитВалидныйЛогин(String arg0) {
    }

    @Then("пользователь успешно авторизован")
    public void пользовательУспешноАвторизован() {

    }

    @Then("пользователю показывается список товаров")
    public void пользователюПоказываетсяСписокТоваров(List<String> types) {
    }

    @Then("отображаются следующие товары")
    public void отображаютсяследующиетовары(List<Map<String, String>> items) {
    }

    @And("отображается сообщение")
    public void отображаетсяСообщение(String arg0) { //передали многострочный текст как аргумент
    }
}
