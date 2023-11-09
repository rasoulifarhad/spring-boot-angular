package com.farhad.example.springbootangulardemo.model;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farhad.example.springbootangulardemo.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public User updateUser(int id, User user) {
		User dbUser = userRepository.getReferenceById(id);
		dbUser.setFirstName(user.getFirstName());
		dbUser.setLastName(user.getLastName());
		dbUser.setUsername(user.getUsername());
		dbUser.setPassword(user.getPassword());

		return userRepository.save(dbUser);
	}

	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
}
