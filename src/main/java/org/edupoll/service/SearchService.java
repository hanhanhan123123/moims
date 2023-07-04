package org.edupoll.service;

import java.util.List;

import org.edupoll.model.entity.User;
import org.edupoll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

	@Autowired
	UserRepository userRepository;

	// 특정단어로 유저 찾아주는 기능을 처리할 서비스 구현

	public List<User> getUsersMatchedQuery(String query) {
		// 특정단어를 포함하고 데이터를 찾아야 하는데, 기본 JpaRepository에는 없는 기능
		return userRepository.findByIdContainingOrNickContainingAllIgnoreCase(query, query);
	}

}
