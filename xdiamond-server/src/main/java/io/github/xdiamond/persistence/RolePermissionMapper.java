package io.github.xdiamond.persistence;

import io.github.xdiamond.domain.RolePermission;
import io.github.xdiamond.domain.RolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  int countByExample(RolePermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  int deleteByExample(RolePermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  int deleteByPrimaryKey(@Param("roleId") Integer roleId,
      @Param("permissionId") Integer permissionId);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  int insert(RolePermission record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  int insertSelective(RolePermission record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  List<RolePermission> selectByExample(RolePermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  int updateByExampleSelective(@Param("record") RolePermission record,
      @Param("example") RolePermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table role_permissions
   * @mbggenerated
   */
  int updateByExample(@Param("record") RolePermission record,
      @Param("example") RolePermissionExample example);
}