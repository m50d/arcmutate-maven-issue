package com.example.impl;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.annotation.Nullable;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import com.example.categories.Marker;

@RunWith(Parameterized.class)
@Category(Marker.class)
public abstract class SlowTestBase {
    @Parameter
    public String vt;
    @Parameter(1)
    public String vtp;

    @Parameterized.Parameters(name = "P {1}")
    public static Iterable<Object[]> versions() {
        return Arrays.asList(new Object[][] {
                {"foo-1.4", "1.4"},
                {"foo-2.4", "2.4"}
        });
    }
}
