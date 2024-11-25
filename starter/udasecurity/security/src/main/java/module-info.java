module com.udacity.catpoint.security {
    requires com.google.common;
    requires com.google.gson;
    requires com.udacity.catpoint.image;
    requires java.desktop;
    requires java.prefs;

    exports com.udacity.catpoint.security.service to com.udacity.catpoint.app;
    exports com.udacity.catpoint.security.data to com.udacity.catpoint.app;
    exports com.udacity.catpoint.security.application to com.udacity.catpoint.app;

    opens com.udacity.catpoint.security.service;
}