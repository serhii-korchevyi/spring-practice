package justfordemo;

import org.springframework.stereotype.Component;

@Component
public class JustForDemo2 implements JustForDemo {
    @Override
    public String getDemoText() {
        return "JustForDemo2";
    }
}
