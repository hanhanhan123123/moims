package org.edupoll.repository;

import java.util.List;

import org.edupoll.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {

	//패턴만 만들면 알아서 찾아준다. jps spring 사이트 참고
	//검색 조건을 두개써서 리턴타입 두개필요
	//sort 하고싶으면 ordeyby 붙이면 됨
	List<User>findByIdContainingOrNickContainingAllIgnoreCase(String id, String nick);
}
