package namoo.nara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "namoo.nara.sample"
})
public class SampleServiceApplication {
    //
    public static void main(String[] args) {
        //
        SpringApplication.run(SampleServiceApplication.class, args);
    }
}
