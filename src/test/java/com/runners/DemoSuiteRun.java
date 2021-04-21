package com.runners;

import com.tests.DemoTest1;
import com.tests.DemoTest2;
import com.tests.GoogleTest;
import com.tests.OhrmAddDeleteEmployeeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({DemoTest1.class, DemoTest2.class, GoogleTest.class, OhrmAddDeleteEmployeeTest.class})
public class DemoSuiteRun {
}
