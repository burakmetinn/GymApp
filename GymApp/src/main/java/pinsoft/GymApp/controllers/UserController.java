package pinsoft.GymApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pinsoft.GymApp.core.Result;
import pinsoft.GymApp.model.User;
import pinsoft.GymApp.service.UserService;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("sign")
    public Result sign(@RequestBody User user){
        return userService.signUp(user);
    }


    @DeleteMapping("delete")
    public Result deleteUser(int id){
        return userService.deleteUser(id);
    }




}
