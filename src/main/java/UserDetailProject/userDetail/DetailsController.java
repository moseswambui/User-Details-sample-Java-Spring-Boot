package UserDetailProject.userDetail;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
    @GetMapping(path = "/details/path-variable/{}")

    public List<Details> getAllDetails(){
        return Arrays.asList(
            new Details(20,"Moses", "Wambui", 45332,"Nyahururu" ));
    }
    
}
