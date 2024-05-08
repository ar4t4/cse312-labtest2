package com.example.asif_44;

import androidx.test.espresso.Espresso;
        import androidx.test.espresso.action.ViewActions;
        import androidx.test.espresso.matcher.ViewMatchers;
        import androidx.test.ext.junit.rules.ActivityScenarioRule;
        import org.junit.Rule;
        import org.junit.Test;

        import static androidx.test.espresso.assertion.ViewAssertions.matches;
        import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testSedanButton() {
        Espresso.onView(ViewMatchers.withId(R.id.sedan_button)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.ui)).check(matches(withText("Sedan driven")));
    }

    @Test
    public void testMotorcycleButton() {
        Espresso.onView(ViewMatchers.withId(R.id.moto)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.ui)).check(matches(withText("Motorcycle driven")));
    }

    @Test
    public void testSUVButton() {
        Espresso.onView(ViewMatchers.withId(R.id.suv)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.ui)).check(matches(withText("SUV driven")));
    }
}
