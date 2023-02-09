package pinsoft.GymApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pinsoft.GymApp.core.Result;
import pinsoft.GymApp.core.SuccessResult;
import pinsoft.GymApp.model.User;
import pinsoft.GymApp.repository.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }


    public Result signUp(User user){
        userRepository.save(user);
        return new SuccessResult("User added.");
    }

    public Result deleteUser(int id){
        userRepository.deleteById(id);
        return new SuccessResult("User deleted.");
    }

}
