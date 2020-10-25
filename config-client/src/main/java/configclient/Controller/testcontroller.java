package configclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class testcontroller {
    @Value("${custom.title}")
    public String title;
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return title;
    }
}
