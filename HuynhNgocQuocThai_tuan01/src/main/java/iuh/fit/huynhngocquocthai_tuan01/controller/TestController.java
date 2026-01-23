package iuh.fit.huynhngocquocthai_tuan01.controller;




import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public/hello")
    public String publicApi() {
        return "Public API - no token needed";
    }

    @GetMapping("/secure/hello")
    public String secureApi(@AuthenticationPrincipal Jwt jwt) {
        return "Hello " + jwt.getSubject();
    }
}
