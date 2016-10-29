package com.github.yangweigbh.volleyx;

import com.android.volley.Request;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by yangwei on 2016/10/29.
 */

@RunWith(RobolectricTestRunner.class)
public class BaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    Request mockRequest;
}
