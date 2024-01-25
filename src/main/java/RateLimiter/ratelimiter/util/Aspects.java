package RateLimiter.ratelimiter.util;


import RateLimiter.ratelimiter.entity.ApiLog;
import RateLimiter.ratelimiter.repository.ApiLogRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;


@Aspect
@Component
public class Aspects {

        @Autowired
        ApiLogRepository apiLogRepository;
        @After("@annotation(TrackFunctionCall)")
        public void logFunctionCall(JoinPoint joinPoint) {
            // Get the function name
            String functionName = joinPoint.getSignature().getName();


            // Get the timestamp
            LocalDateTime currentDateTime = LocalDateTime.now();

            ApiLog apiLog = new ApiLog();
            apiLog.setFunctionName(functionName);
            apiLog.setTimestamp(currentDateTime);

            // Log or store the information in the database
            // You can use a service or repository to save the data to PostgreSQL
            // For simplicity, we will print it here
            System.out.println("Function: " + functionName + ", Timestamp: " + currentDateTime);
            apiLogRepository.save(apiLog);
        }
}

