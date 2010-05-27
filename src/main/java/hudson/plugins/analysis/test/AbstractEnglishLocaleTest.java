package hudson.plugins.analysis.test;

import java.util.Locale;

import org.junit.Before;

/**
 * A test with predefined English locale.
 */
public abstract class AbstractEnglishLocaleTest { // NOPMD
    /**
     * Initializes the locale to English.
     */
    @Before
    public void initializeLocale() {
        Locale.setDefault(Locale.ENGLISH);
    }
}

