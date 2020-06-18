package com.example.demo.mapper;



import com.example.demo.model.Sthomework;
import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao.java文件内容，访问的方法接口。
 */
@Mapper
@Repository
public interface StudentDao {

    int addSthomework(Sthomework sthomework);

    int deleteSthomeworkById(long id);

    int updateSthomework(Sthomework sthomework);

    Sthomework querySthomeworkById(long id);

    List<Sthomework> queryAllSthomework();






}
