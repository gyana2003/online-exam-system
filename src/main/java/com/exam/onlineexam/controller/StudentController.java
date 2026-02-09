package com.exam.onlineexam.controller;

import com.exam.onlineexam.model.Student;
import com.exam.onlineexam.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // REGISTER
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // GET ALL
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // GET BY ID
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {

        Student student = studentRepository.findById(id).orElse(null);

        if (student != null) {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setPassword(updatedStudent.getPassword());
            return studentRepository.save(student);
        }

        return null;
    }

    // DELETE
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }

    // LOGIN
    @PostMapping("/login")
    public Student login(@RequestBody Student student) {
        return studentRepository
                .findByEmailAndPassword(student.getEmail(), student.getPassword())
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));
    }
}
