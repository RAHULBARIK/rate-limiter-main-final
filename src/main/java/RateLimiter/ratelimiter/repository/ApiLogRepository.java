package RateLimiter.ratelimiter.repository;

import RateLimiter.ratelimiter.entity.ApiLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiLogRepository extends JpaRepository<ApiLog, Long> {
}
