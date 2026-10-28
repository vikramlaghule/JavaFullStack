package app.schoolApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import app.schoolApp.dtos.Dtos.schoolName;
import app.schoolApp.dtos.Dtos.studentDto;
import app.schoolApp.dtos.Dtos.studentName;
import app.schoolApp.dtos.Dtos.studentRequest;
import app.schoolApp.dtos.Dtos.studentResponse;
import app.schoolApp.dtos.Dtos.teacherName;
import app.schoolApp.entity.School;
import app.schoolApp.entity.Student;
import app.schoolApp.entity.Teacher;

@Service
public class MapperService {

	public  studentDto toDto( Student stud)
	{
		return new studentDto(stud.getName(),stud.getRollNo(),stud.getClassName(),stud.getTeacher().getName(),stud.getSchool().getName());
	}
	
	public Student toDto(studentRequest stud)
	{
		Student st=new Student();
		st.setClassName(stud.className());
		st.setName(stud.name());
		st.setRollNo(stud.rollNo());
		return st;
	}
	
	 // School Entity -> School DTO
    public schoolName mapSchool(School s) {

        return new schoolName(
            s.getName(),

            s.getTeachers().stream()
                .map(this::mapTeacher)
                .collect(Collectors.toList())
        );
    }

    // Teacher Entity -> Teacher DTO
    public teacherName mapTeacher(Teacher t) {

        return new teacherName(
            t.getName(),

            t.getStudents().stream()
                .map(this::mapStudent)
                .collect(Collectors.toList())
        );
    }

    // Student Entity -> Student DTO
    public studentName mapStudent(Student st) {

        return new studentName(
            st.getName()
        );
    }
    
    public studentResponse todto(Student stud)
    {
    	return new studentResponse(stud.getName(),stud.getRollNo(),stud.getClassName(),stud.getTeacher().getName());
    }
	
	
	
}
