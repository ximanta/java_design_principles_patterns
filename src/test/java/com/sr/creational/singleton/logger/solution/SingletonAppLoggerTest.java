package com.sr.creational.singleton.logger.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonAppLoggerTest {

    @BeforeEach
    public void resetLogger() throws NoSuchFieldException, IllegalAccessException {
        Field instanceField = SingletonAppLogger.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);  // Reset the singleton instance
        SingletonAppLogger logger = SingletonAppLogger.getInstance();
    }

    @Test
    public void testSingleInstance() {
        SingletonAppLogger logger1 = SingletonAppLogger.getInstance();
        SingletonAppLogger logger2 = SingletonAppLogger.getInstance();
        assertSame(logger1, logger2); // Both should refer to the same instance
    }

    @Test
    public void testLogCount() {
        SingletonAppLogger logger = SingletonAppLogger.getInstance();
        logger.log("Test Log 1");
        logger.log("Test Log 2");
        logger.printLogCount();

        assertEquals(2, logger.getLogCount()); // Check that 2 logs were added
    }

    @Test
    public void testReflectionBreakingSingleton() throws Exception {
        Constructor<SingletonAppLogger> constructor = SingletonAppLogger.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        // This should throw an exception
        assertThrows(Exception.class, () -> {
            SingletonAppLogger logger2 = SingletonAppLogger.class.getDeclaredConstructor().newInstance();
        });

    }
}
