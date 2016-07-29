package sk.ehr.learning.course.da.maria.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import sk.ehr.learning.course.domain.entity.Course;

@Mapper
public interface CourseMapper {
	//
	Course selectCourse(@Param("usid")String usid);
	void insertCourse(@Param("course")Course course);
	void updateCourse(@Param("course")Course course);
	void deleteCourse(@Param("usid")String usid);
	List<Course> selectAllCourses();
}
