package RateLimiter.ratelimiter.expection;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.reflect.Method;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomException extends RuntimeException{
    private String resourceName;
    private String fieldName;

    public CustomException(String resourceName, Method fieldName){
        super(String.format("%s not found with '%s'",resourceName,fieldName));
    }
}
