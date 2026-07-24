package org.bluebridge.annotation.resource.service;

import jakarta.annotation.Resource;
import org.bluebridge.annotation.resource.dao.StudentDao;
import org.springframework.stereotype.Service;

/**
 * StudentServiceImpl
 *
 * @author lingwh
 * @date 2026/1/10 14:45
 */
@Service
public class StudentServiceImpl implements IStudentService{

    @Resource
    private StudentDao studentDao;

    @Override
    public void deleteById(String id) {
        studentDao.deleteById(id);
    }
}
