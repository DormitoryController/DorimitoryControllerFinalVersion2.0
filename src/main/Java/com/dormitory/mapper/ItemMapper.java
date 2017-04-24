package com.dormitory.mapper;

import SSM.model.Item;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by war on 2017/4/18.
 */
@Repository
public interface ItemMapper {
    Item selectItemByName(@Param("name") String name);
    void updateItem(@Param("item_id") int item_id, @Param("item_num") int item_num);
}
