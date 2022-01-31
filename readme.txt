#Topics:
https://junit.org/junit5/docs/current/user-guide/#overview

#Basic:
1. JUnit 5 Introduction
2. All Basic Tags - @Before @DisplayName @Test etc
3. Assertions - static import etc
4. Assumption - assumingThat, assumeTrue, assumeFalse
5. Handling Exceptions
6. @RepeatedTest
7. @Tag  (mvn -Dtest=G_TestPlanTagsTest test)
8. @Disabled
9. @Timeout


#Adv:
10. @TestInstance(Lifecycle.PER_CLASS)
11. @TestInstance(Lifecycle.PER_METHOD)
12. @TestMethodOrder - Alphanumeric, Random, OrderAnnotation
13. @ParameterizedTest, @ValueSource, @JavaTimeConversionPattern (String, int, boolean, Date, Time)
14. @CsvSource, @CsvFileSource
15. @EnumSource
16. @ArgumentsSource
17. @MethodSource
18. @AggregateWith
19. ArgumentsAccessor
20. Parallel Tests



mvn clean install -DskipTests=true -Djib.skip=true
mvn -Dtest=G_TestPlanTagsTest#testFour test
mvn -Dtest=G_TestPlanTagsTest test



