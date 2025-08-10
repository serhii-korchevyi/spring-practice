package justfordemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //Qualifier priority is higher than primary
public class JustForDemo1 implements JustForDemo {
    @Override
    public String getDemoText() {
        return "JustForDemo1";
    }
}
