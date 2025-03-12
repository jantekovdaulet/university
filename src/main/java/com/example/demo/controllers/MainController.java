package com.example.demo.controllers;

import com.example.demo.entities.*;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private GroupService groupService;

    @Autowired
    private MarkService markService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    public DayService dayService;

    @GetMapping(value = "/profile/{id}")
    public String getProfile(Model model,
                             @PathVariable(name = "id") Long id) {

        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);

        List<Course> courses = student.getCourses();
        model.addAttribute("courses", courses);

        return "profile";
    }

    @GetMapping(value = "/my-curator/{id}")
    public String getMyCurator(Model model,
                               @PathVariable(name = "id") Long id) {

        Curator curator = studentService.getStudent(id).getGroup().getCurator();
        model.addAttribute("curator", curator);

        List<Group> groups = groupService.getGroupsByCuratorId(curator.getId());
        model.addAttribute("groups", groups);

        return "my-curator";
    }

    @GetMapping(value = "/group/{id}")
    public String getGroupStudents(Model model,
                                   @PathVariable(name = "id") Long groupId) {

        List<Student> students = studentService.getStudentsByGroupId(groupId);
        model.addAttribute("students", students);

        return "group";
    }

    @GetMapping(value = "/{id}")
    public String getIndex(Model model,
                           @PathVariable(name = "id") Long id) {

        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);

        return "index";
    }

    @GetMapping(value = "/my-courses/{id}")
    public String getMyCourses(Model model,
                               @PathVariable(name = "id") Long id) {

        List<Course> courses = studentService.getStudent(id).getCourses();
        model.addAttribute("courses", courses);

        List<Mark> sumMarksOfCourse = markService.getSumMarksByCourse(courses, id);
        model.addAttribute("marks", sumMarksOfCourse);

        return "my-courses";
    }

    @GetMapping(value = "/my-subjects/{id}")
    public String getMySubjects(Model model,
                                @PathVariable(name = "id") Long id) {

        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);

        List<Subject> subjects = subjectService.getSubjectsByCourses(courses);
        model.addAttribute("subjects", subjects);

        return "my-subjects";
    }

    @GetMapping(value = "/my-marks/{id}")
    public String getMyMarks(Model model,
                             @PathVariable(name = "id") Long id){

        List<Course> courses = studentService.getStudent(id).getCourses();
        model.addAttribute("courses", courses);

        List<Mark> marks = markService.getAllMarks();
        model.addAttribute("marks", marks);

        List<Day> days = dayService.getAllDays();
        model.addAttribute("days", days);

        return "my-marks";
    }
}
