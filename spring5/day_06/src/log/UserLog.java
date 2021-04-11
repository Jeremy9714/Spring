package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 手动输出日志
 * @author Chenyang
 * @create 2021-04-11-15:39
 */
public class UserLog {

    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}

