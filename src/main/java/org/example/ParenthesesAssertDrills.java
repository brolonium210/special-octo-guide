package org.example;

public class ParenthesesAssertDrills {

    static int foo = 1;
    // 1. Access a static class variable
    public static int getStaticFoo() {
        // TODO: Implement

        return foo;
    }

    // 2. Access a shadowed local variable
    public static int getLocalFoo() {
        // TODO: Implement
        int foo = 10;
        return foo;
    }

    // 3. Use an assert to check local variable value
    public static void assertLocalFoo(int foo) {
        // TODO: Implement
        int temp = foo;
        assert(foo == temp):"failed";
    }

    // 4. Use an assert to check static variable value
    public static void assertStaticFoo() {
        // TODO: Implement
        assert(ParenthesesAssertDrills.foo == 1):"failed for some reason";

    }

    // 5. Compare local and static foo
    public static boolean compareFoos(int foo) {
        // TODO: Implement
        return foo == ParenthesesAssertDrills.foo;
    }

    // 6. Create expression that evaluates to 10 regardless of context
    public static int expressionReturns10(int foo) {
        // TODO: Implement
        foo = 24;

        return ParenthesesAssertDrills.foo;
    }

    // 7. Match value to assertion
    public static boolean testAssertion(int expected, int actual) {
        // TODO: Implement
        return false;
    }

    // 8. Replace [???] with a single expression for multiple values
    public static int getExpectedValue(int i) {
        // TODO: Implement logic so 10 == i + x works for i=0,1,2,3
        return ParenthesesAssertDrills.foo;
    }

    // Pattern Drill 1: Shadowing pattern test
    public static int shadowingTest(int foo) {
        // TODO: Use both local and static foo in a meaningful way


        return ParenthesesAssertDrills.foo + foo;
    }

    // Pattern Drill 2: Scope difference test
    public static int sumLocalAndStatic(int foo) {
        // TODO: Add static and local foo
        return 0;
    }

    // Pattern Drill 3: Replace same expression in all asserts
    public static int sharedExpression(int offset) {
        // TODO: Return value to make all assertions match
        return 0;
    }

    // Pattern Drill 4: Write an assert using both local and class variables
    public static void mixedScopeAssert(int foo) {
        // TODO: Implement
    }
}
