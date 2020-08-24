package org.jboss.pnc.bacon.common;

import java.io.File;

public class Constant {

    public static final String DEFAULT_CONFIG_FOLDER = System.getProperty("user.home") + File.separator + ".config"
            + File.separator + "pnc-bacon";

    public static final String CONFIG_FILE_NAME = "config.yaml";

    public static final String CONFIG_ENV = "PNC_CONFIG_PATH";

    public static final String PIG_CONTEXT_DIR = "PIG_CONTEXT_DIR";

    public static final String CACHE_FILE = "saved-user.json";

    private Constant() {
    }
}
