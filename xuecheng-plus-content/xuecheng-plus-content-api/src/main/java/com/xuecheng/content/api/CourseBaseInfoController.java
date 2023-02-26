package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import com.xuecheng.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @USER: Liuhl
 * @DATE: 2023/2/26 19:42
 */
@Api(value = "课程管理相关的接口",tags = "课程管理相关的接口")
@RestController
public class CourseBaseInfoController {
    @PostMapping("/course/list")
    @ApiOperation("课程查询接口")
    public PageResult<CourseBase> list(PageParams params, @RequestBody QueryCourseParamsDto queryCourseParamsDto){
        CourseBase courseBase = new CourseBase();
        courseBase.setName("测试名称");
        courseBase.setChangeDate(LocalDateTime.now());
        List<CourseBase> courseBases = new ArrayList<>();
        courseBases.add(courseBase);
        PageResult pageResult = new PageResult<CourseBase>(courseBases,10,1,10);
        return pageResult;
    }
}
