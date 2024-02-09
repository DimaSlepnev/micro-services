package com.example.student.service;

import com.example.student.domain.Student;
import com.example.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }

    public List<Student> findAllStudentBySchool(Long schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
