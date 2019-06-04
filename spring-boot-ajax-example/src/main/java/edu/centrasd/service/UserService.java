package edu.centrasd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import edu.centrasd.model.User;
@Service
public class UserService {
	private List<User> users;

//    // Love Java 8
//    public List<User> findByUserNameOrEmail(String username) {
//
//        List<User> result = users.stream()
//            .filter(x -> x.getUsername().equalsIgnoreCase(username))
//            .collect(Collectors.toList());
//
//        return result;
//
//    }
    
 // Simulate the search function
 	public List<User> findByUserNameOrEmail(String username, String email) {

 		List<User> result = new ArrayList<User>();

 		for (User user : users) {

 			if ((!StringUtils.isEmpty(username)) && (!StringUtils.isEmpty(email))) {

 				if (username.equals(user.getUsername()) && email.equals(user.getEmail())) {
 					result.add(user);
 					continue;
 				} else {
 					continue;
 				}

 			}
 			if (!StringUtils.isEmpty(username)) {
 				if (username.equals(user.getUsername())) {
 					result.add(user);
 					continue;
 				}
 			}

 			if (!StringUtils.isEmpty(email)) {
 				if (email.equals(user.getEmail())) {
 					result.add(user);
 					continue;
 				}
 			}

 		}

 		return result;

 	}

    // Init some users for testing
    @PostConstruct
    private void iniDataForTesting() {

        users = new ArrayList<User>();

        User user1 = new User("thomc", "password111", "thomc@ntu.edu.vn");
        User user2 = new User("huongly", "password222", "huonglynt84@gmail.com");
        User user3 = new User("ivs", "password333", "ivs@gmail.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);

    }
}
