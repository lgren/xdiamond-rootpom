package io.github.xdiamond.persistence;

import io.github.xdiamond.domain.Role;
import io.github.xdiamond.domain.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int countByExample(RoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int deleteByExample(RoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int deleteByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int insert(Role record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int insertSelective(Role record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  List<Role> selectByExample(RoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  Role selectByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int updateByPrimaryKeySelective(Role record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role
   * @mbggenerated
   */
  int updateByPrimaryKey(Role record);
}