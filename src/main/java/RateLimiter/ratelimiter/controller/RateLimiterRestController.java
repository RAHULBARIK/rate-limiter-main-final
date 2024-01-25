package RateLimiter.ratelimiter.controller;

import RateLimiter.ratelimiter.expection.CustomException;
import RateLimiter.ratelimiter.service.HealthService;
import RateLimiter.ratelimiter.util.TrackFunctionCall;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "Health Check APIs for Monitoring Health",
        description = "Create User, Update User, Get User, Get All Users, Delete User"
)
@RestController
public class RateLimiterRestController {

    @Autowired
    HealthService healthService;

    @Operation(
            summary = "Check the health of the Application",
            description = "Check health API is used to retrieve current Health status of the Application"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 ,Application is up and running"
    )
    @TrackFunctionCall
    @GetMapping("/health")
    public String healthCheck() throws CustomException {
        // Your method logic here
        return healthService.checkHealth();
    }
}
