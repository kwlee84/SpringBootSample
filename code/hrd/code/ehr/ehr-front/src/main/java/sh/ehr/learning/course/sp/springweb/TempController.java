package sh.ehr.learning.course.sp.springweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sk.ehr.learning.course.domain.entity.Course;
import sk.ehr.learning.course.domain.service.CourseService;

/**
 * @author Administrator
 * Course CRUD 시연을 위한 임시 컨트롤러
 *
 */
@Controller
@RequestMapping("temp")
public class TempController {
	//
	@Autowired
	CourseService courseService;
	
	//
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		//
		List<Course> courses = courseService.findAll();
		model.addAttribute("courses", courses);

		return "index";
	}
	
	@RequestMapping(value = "new", method = RequestMethod.GET)
	public String newForm() {
		//
		return "new";
	}
	
	@RequestMapping(value = "edit/{courseId}", method = RequestMethod.GET)
	public String editForm(@PathVariable("courseId") String courseId, Model model) {
		//
		Course course = courseService.find(courseId);
		model.addAttribute("course", course);
		
		return "edit";
	}
	
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("courseForm") Course course) {
		//
		this.courseService.register(course);
		
		return "redirect:/temp";
	}
	
	@RequestMapping(value = "modify/{courseId}", method = RequestMethod.POST)
	public String modify(@PathVariable("courseId") String courseId, @ModelAttribute("courseForm") Course course) {
		//
		course.setUsid(courseId);
		this.courseService.modify(course);
		
		return "redirect:/temp";
	}
	
	@RequestMapping(value = "remove/{courseId}", method = RequestMethod.POST)
	public String removce(@PathVariable("courseId") String courseId) {
		//
		this.courseService.remove(courseId);
		
		return "redirect:/temp";
	}
}
