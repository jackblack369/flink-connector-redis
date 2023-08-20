package org.apache.flink.streaming.connectors.redis.dw;

import org.apache.flink.streaming.connectors.redis.common.mapper.RedisCommand;
import org.apache.flink.util.Preconditions;
import org.junit.jupiter.api.Test;

public class TestFunction {

    @Test
    public void test1(){
        System.out.println(RedisCommand.HGET.name());
        System.out.println(RedisCommand.HSET);
        Preconditions.checkArgument(
                RedisCommand.HGET == RedisCommand.HGET ,
                "just hget support load all.");
    }
}
