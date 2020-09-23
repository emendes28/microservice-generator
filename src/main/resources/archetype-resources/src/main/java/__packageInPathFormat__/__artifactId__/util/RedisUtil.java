package ${package}.${artifactId}.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@Configuration
public class RedisUtil {

    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations<String, Object, Object> hashOperarions;
    private ValueOperations<String, Object> valueOperations;
    private ListOperations<String, Object> listOperations;

    @Autowired
    RedisUtil(RedisTemplate<String, Object> template) {

        this.redisTemplate = template;
        this.hashOperarions = template.opsForHash();
        this.valueOperations = template.opsForValue();
        this.listOperations = template.opsForList();
    }

    public String putValue(String redisKey, Object redisValue) {
        valueOperations.set(redisKey, redisValue);
        return "OK";
    }

    public String getValue(String redisKey) {
        return valueOperations.get(redisKey).toString();
    }

    public List<Object> getListValues(String redisKey) {
        return listOperations.range(redisKey, 0, -1);
    }
}
