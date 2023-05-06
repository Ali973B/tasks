package page;

import base.BaseForm;
import org.openqa.selenium.By;

public abstract class InyerfaceHomePage extends BaseForm {

    public InyerfaceHomePage(By uniqueFormLocator, String formName) {
        super(uniqueFormLocator, formName);
    }


}
