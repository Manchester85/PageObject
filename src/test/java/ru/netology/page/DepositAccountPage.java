package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class DepositAccountPage {
    private SelenideElement heading = $(withText("Пополнение карты"));
    private SelenideElement amount = $("[data-test-id=amount]");
    private SelenideElement from = $("[data-test-id=from]");
    private SelenideElement button =$("[data-test-id=action-transfer]");

    public DashboardPage depositAccount(String sum, DataHelper.CardNumber cardNumber) {
        amount.setValue(sum);
        from.setValue(String.valueOf(cardNumber));
        button.click();
        return new DashboardPage();
    }
}


