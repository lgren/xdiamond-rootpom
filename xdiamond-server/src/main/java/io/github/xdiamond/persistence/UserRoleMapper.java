package io.github.xdiamond.persistence;

import io.github.xdiamond.domain.UserRole;
import io.github.xdiamond.domain.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  int countByExample(UserRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  int deleteByExample(UserRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  int insert(UserRole record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  int insertSelective(UserRole record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  List<UserRole> selectByExample(UserRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  int updateByExampleSelective(@Param("record") UserRole record,
      @Param("example") UserRoleExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table user_roles
   * @mbggenerated
   */
  int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);
}