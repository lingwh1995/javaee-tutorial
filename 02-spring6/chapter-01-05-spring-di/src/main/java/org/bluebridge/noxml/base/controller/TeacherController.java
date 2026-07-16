package org.bluebridge.noxml.base.controller;

import org.bluebridge.noxml.base.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * TeacherController
 *
 * @author lingwh
 * @date 2026/7/13 10:07
 */
@Controller
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    public void deleteById(String id) {
        teacherService.deleteById(id);
    }
}
