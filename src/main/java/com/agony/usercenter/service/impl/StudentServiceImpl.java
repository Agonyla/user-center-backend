package com.agony.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.agony.usercenter.pojo.Student;
import com.agony.usercenter.service.StudentService;
import com.agony.usercenter.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author 11971
* @description 针对表【student】的数据库操作Service实现
* @createDate 2023-11-18 21:21:53
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




