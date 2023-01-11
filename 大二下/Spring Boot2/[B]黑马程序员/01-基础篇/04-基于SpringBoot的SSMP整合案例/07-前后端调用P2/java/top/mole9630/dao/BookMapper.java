package top.mole9630.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.mole9630.damain.Book;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
    Book selectByIdFunction(Integer id);
}
