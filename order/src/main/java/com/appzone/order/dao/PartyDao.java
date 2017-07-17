package com.appzone.order.dao;
import com.appzone.order.entity.PartyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PartyDao {

    @Select("SELECT * FROM t_party WHERE party_id = #{partyId}")
    PartyEntity findById(@Param("partyId") String partyId);
}
