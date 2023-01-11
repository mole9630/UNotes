package top.mole9630.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.mole9630.domain.Book;

@Mapper
public interface BookDao{
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}