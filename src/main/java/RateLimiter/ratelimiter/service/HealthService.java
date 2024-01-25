package RateLimiter.ratelimiter.service;

import RateLimiter.ratelimiter.expection.CustomException;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String checkHealth() throws CustomException {

        try{
            return "Im up";
        }catch (Exception e){

        }
        return "Default String";
    }
}
