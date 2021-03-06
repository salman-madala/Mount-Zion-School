package com.zion.school.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zion.school.dto.StudentDto;
import com.zion.school.model.Student;
import com.zion.school.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Lenovo on 01-03-2021.
 */
@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private MessageSource messageSources;

    @Transactional
    public Student create(Student student){
       Student student1 = studentRepository.save(student);
        return student1;
    }
    @Transactional
    public Student update(Student student){
        return studentRepository.save(student);
    }
    @Transactional
    public void delete(Integer registrationId){
        studentRepository.deleteById(registrationId);
    }

    @Transactional
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    @Transactional
    public Student get(Integer registrationId){
        Student student=studentRepository.getOne(registrationId);
        return  student;
    }

//    public Page<Student> getAllStudentsByPage(Pageable pageable){
//        Page<Student> students=studentRepository.findAll(pageable);
//        return  students;
//    }

    
    //--------------------Normal Students--------------------------------------

    public Integer getTotalNormalStudentsCount(){
        return studentRepository.findByRteStudentFalse().size();
    }
        
    public List<Student> getTotalNormalStudents(){
        return studentRepository.findByRteStudentFalse();
    }

    public Integer getClassStudentsCount(String className){
        return studentRepository.findByClassToJoinAndRteStudentFalse(className).size();
    }

    public  List<Student> getIndividualNormalClassStudents(String className){
        return studentRepository.findByClassToJoinAndRteStudentFalse(className);
    }


    //--------------------RTE--------------------------------------

    public Integer getClassRteStudentsCount(String className){
        return studentRepository.findByRteStudentTrueAndClassToJoin(className).size();
    }
    
    
    public  List<Student> getIndividualRteClassStudents(String className){
        return studentRepository.findByRteStudentTrueAndClassToJoin(className);
    }

    public  List<Student> getTotalRteStudents(){
        return studentRepository.findByRteStudentTrue();
    }
    
    public Integer getTotalRteStudentsCount(){
        return studentRepository.findByRteStudentTrue().size();
    }
}
