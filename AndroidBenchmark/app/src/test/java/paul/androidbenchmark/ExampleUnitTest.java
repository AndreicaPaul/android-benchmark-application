package paul.androidbenchmark;

import org.junit.Test;

import static org.junit.Assert.*;

import paul.androidbenchmark.ui.login.LoginViewModel;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void userName_isValid() {
        LoginViewModel loginViewModel = new LoginViewModel(null);
        assertTrue(loginViewModel.isUserNameValid("Paul"));
    }

    @Test
    public void email_isValid() {
        LoginViewModel loginViewModel = new LoginViewModel(null);
        assertTrue(loginViewModel.isUserNameValid("Paul@yahoo.com"));
    }
    @Test
    public void email_isInvalid() {
        LoginViewModel loginViewModel = new LoginViewModel(null);
        assertFalse(loginViewModel.isUserNameValid("Paul@"));
    }
    @Test
    public void userName_isInvalid() {
        LoginViewModel loginViewModel = new LoginViewModel(null);
        assertFalse(loginViewModel.isUserNameValid(""));
    }

    @Test
    public void password_isValid() {
        LoginViewModel loginViewModel = new LoginViewModel(null);
        assertTrue(loginViewModel.isPasswordValid("Password"));
    }

    @Test
    public void password_isInvalid() {
        LoginViewModel loginViewModel = new LoginViewModel(null);
        assertFalse(loginViewModel.isPasswordValid("Pas"));
    }

}