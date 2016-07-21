package namoo.nara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "namoo.nara.town"
})
public class TownServiceApplication {
    //
    public static void main(String[] args) throws Exception {
        //
        SpringApplication.run(TownServiceApplication.class, args);
    }
}