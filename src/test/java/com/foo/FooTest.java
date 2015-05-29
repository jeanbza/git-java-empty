package com.foo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class FooTest {
    Foo foo;

    @Before
    public void setup() {
        foo = new Foo();
    }

    @Test public void testFoo() throws Exception {
        assertThat(foo.foo(), equalTo(5));
    }

    @Test public void testFooWrong() throws Exception {
        assertThat(foo.foo(), equalTo(7));
    }
}
