package com.jetbrains.lang.dart.completion.editor;

import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.lookup.Lookup;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;
import com.jetbrains.lang.dart.util.DartTestUtils;

/**
 * @author: Fedor.Korotkov
 */
public class DartTabCompletionTest extends LightPlatformCodeInsightFixtureTestCase {
  @Override
  protected String getTestDataPath() {
    return FileUtil.toSystemDependentName(DartTestUtils.BASE_TEST_DATA_PATH + "/completion/tab");
  }

  public void doTest() {
    myFixture.configureByFile(getTestName(true) + ".dart");
    myFixture.complete(CompletionType.BASIC);
    myFixture.finishLookup(Lookup.REPLACE_SELECT_CHAR);
    myFixture.checkResultByFile(getTestName(true) + "_expected.dart");
  }

  public void testExpression1() {
    doTest();
  }

  public void testWEB_7191() {
    doTest();
  }
}
