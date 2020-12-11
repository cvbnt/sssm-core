package com.hao123.core.controller;

import com.hao123.core.entity.Pin;
import com.hao123.core.entity.Teacher;
import com.hao123.core.service.Impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    @GetMapping("/pages/allteacher")
    public String allTeacher(Model model) {
        List<Teacher> list = teacherService.queryAllTeacher();
        model.addAttribute("key", list);
        model.addAttribute("pin", new Pin());
        return "pages/allTeacher";
    }

    @PostMapping("/pages/allteacher")
    public String allTeacher(Teacher teacher) {
        teacherService.addTeacher(teacher);
        return "redirect:/pages/allteacher";
    }

    @GetMapping("/pages/addteacher")
    public String addTeacher() {
        return "pages/addTeacher";
    }

    @GetMapping("/pages/deleteteacher/{id}")
    public String deleteBook(@PathVariable("id") int aid) {
        teacherService.deleteTeacherById(aid);
        return "redirect:/pages/allteacher";
    }

    @GetMapping("/pages/toupdateteacher/{id}")
    public String toupdateTeacher(@PathVariable("id") int aid, Model model) {
        Teacher teahcer = teacherService.queryTeacherById(aid);
        model.addAttribute("key2", teahcer);
        return "pages/updateTeacher";
    }

    @PostMapping("/pages/updateteacher")
    public String updateTeacher(Teacher teacher) {
        teacherService.updateTeacher(teacher);
        return "redirect:/pages/allteacher";
    }

    @PostMapping("/searchTeacher")
    public String Search(@ModelAttribute Pin pin, Model model) {
        String name = pin.getName();
        List<Teacher> list = teacherService.queryTeacherByName(name);
        if (null == list || list.size() == 0) {
            list = teacherService.queryAllTeacher();
            model.addAttribute("error", "未查到教师");
        }
        model.addAttribute("key", list);
        return "pages/allTeacher";
    }
}
