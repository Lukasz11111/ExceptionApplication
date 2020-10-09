package exception.generation.exception;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @GetMapping("/")
    String show(){
            final String uri = "http://localhost:8080/error";
            RestTemplate restTemplate = new RestTemplate();
        for (int i =0 ;i<25;i++){
            try {
                String result = restTemplate.getForObject(uri, String.class);
            }catch (Exception e){

            }
        }
        return "Stop";
    }
    @GetMapping("/error")
    String showError(){
        int alfa=0;
        int beta = 4/alfa;
        return "";
    }
}
