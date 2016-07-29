package sh.ehr.learning.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import sk.ehr.learning.course.domain.service.CourseService;

@SpringBootApplication
public class FrontServcieApplication {
	//
	public static void main(String[] args) {
		SpringApplication.run(FrontServcieApplication.class, args);
	}
	
	@Value("${sh.ehr.learning.api.host}")
	private String shEhrLearningApiHost;
	
	@Bean
	public CourseService createCourseServiceClient() {
		//
		HttpInvokerProxyFactoryBean httpInvoker = new HttpInvokerProxyFactoryBean();
		httpInvoker.setServiceUrl(shEhrLearningApiHost + "/learning-course/remote/CourseService");
		httpInvoker.setServiceInterface(CourseService.class);
		
		httpInvoker.afterPropertiesSet();
		CourseService courseService = (CourseService)httpInvoker.getObject();
		return courseService;
	}
}
