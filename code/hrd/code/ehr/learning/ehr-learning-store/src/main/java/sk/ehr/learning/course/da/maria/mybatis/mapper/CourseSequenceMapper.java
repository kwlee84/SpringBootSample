package sk.ehr.learning.course.da.maria.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import sk.ehr.learning.course.domain.entity.sequence.CourseDomain;
import sk.ehr.learning.course.domain.entity.sequence.CourseSequence;

@Mapper
public interface CourseSequenceMapper {
	//
	@Insert("insert into course_sequence (course_domain, sequence) values (#{courseSequence.courseDomain},#{courseSequence.sequence})")
	void insertCourseSequence(@Param("courseSequence")CourseSequence courseSequence);
	
	@Select("select * from course_sequence where course_domain = #{courseDomain}")
	@Results({
        @Result(property = "courseDomain", column = "course_domain"),
        @Result(property = "sequence", column = "sequence")
    })
	CourseSequence selectCourseSequence(@Param("courseDomain")CourseDomain courseDomain);
	
	@Update("update course_sequence set sequence=#{courseSequence.sequence} where course_domain=#{courseSequence.courseDomain}")
	void updateCourseSequence(@Param("courseSequence")CourseSequence courseSequence);
}
