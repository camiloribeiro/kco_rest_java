/*
 * Copyright 2015 Klarna AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klarna.rest.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Test cases for the KlarnaUserAgent class.
 */
@RunWith(MockitoJUnitRunner.class)
public class KlarnaUserAgentTest extends TestCase {

    private KlarnaUserAgent agent;

    @Before
    public void setUp() {
        agent = new KlarnaUserAgent();
    }

    @Test
    public void testDefaultFields() {
        assertThat(agent.toString(), containsString("OS/"));

        assertThat(agent.toString(), containsString("Library/Klarna.kco_rest_java_"));

        assertThat(agent.toString(), containsString("Language/Java_"));
    }
}
