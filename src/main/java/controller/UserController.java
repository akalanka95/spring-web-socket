package controller;

import model.User;
import model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) throws InterruptedException {
            Thread.sleep(1000);
            return  new UserResponse("hi" + user.getName());
    }
}
