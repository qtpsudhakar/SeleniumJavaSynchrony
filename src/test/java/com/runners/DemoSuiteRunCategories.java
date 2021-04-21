package com.runners;

import com.categories.Smoke;
import com.tests.DemoTest1;
import com.tests.DemoTest2;
import com.tests.GoogleTest;
import com.tests.OhrmAddDeleteEmployeeTest;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses({DemoTest1.class, DemoTest2.class, GoogleTest.class, OhrmAddDeleteEmployeeTest.class})
public class DemoSuiteRunCategories {
}
