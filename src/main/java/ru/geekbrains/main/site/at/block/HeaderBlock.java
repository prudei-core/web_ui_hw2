package ru.geekbrains.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;

public class HeaderBlock extends BasePage {

    @FindBy(css = "h2[class=\"gb-header__title\"]")
    private WebElement namePage;

    @FindBy(css = "[class*=\"gb-header\"]")
    private WebElement headerPage;

    @FindBy(css = "[class = \"site-footer__content\"]")
    private WebElement footerPage;

    public HeaderBlock(WebDriver driver) {
        super(driver);
    }

    public WebElement getNamePage() {
        return namePage;
    }

    public WebElement getHeaderPage () {
        return headerPage;
    }

    public WebElement getFooterPage () {
        return footerPage;
    }
}