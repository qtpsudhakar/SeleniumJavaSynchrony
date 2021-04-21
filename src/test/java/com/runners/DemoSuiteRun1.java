package com.runners;

import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(WildcardPatternSuite.class) //this feature is not coming from junit
//its from junit-toolbox https://mvnrepository.com/artifact/com.googlecode.junit-toolbox/junit-toolbox
@SuiteClasses("../tests/*Test*.class")
public class DemoSuiteRun1 {

}
