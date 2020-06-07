package kea.javascript.exercise.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String ajax ()
    {
        return "ajax";
    }

    @GetMapping("/jquery")
    public String homePage ()
    {
        return "js_basics_to_jquery";
    }


    /**
     *  localhost:8383
     *  ajax.html
     */
}

