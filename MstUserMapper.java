package jp.co.internous.ocean.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.ocean.model.domain.MstUser;

@Mapper
public interface MstUserMapper {
	List<MstUser> findByUserNameAndPassword(
			@Param("userName") String userName,
			@Param("password") String password);
	
	List<MstUser> findByUserName(String userName);
	
	@Select("SELECT * FROM mst_user WHERE id = #{id}")
	List<MstUser> findById(int id);
	
	@Update("UPDATE mst_user SET password = #{password}, updated_at = CURRENT_TIMESTAMP WHERE id = #{id}")
	void update(@Param("password") String password, @Param("id") int id);
	
	@Insert("INSERT INTO mst_user (user_name, password, family_name, first_name, family_name_kana, first_name_kana, gender) " +
			"VALUES (#{userName}, #{password}, #{familyName}, #{firstName}, #{familyNameKana}, #{firstNameKana}, #{gender})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert (MstUser mst_user);
}