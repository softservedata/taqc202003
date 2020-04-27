package com.softserve.edu.hw15;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {
    private final String TIME_TEMPLATE = "yyyy-MM-dd_HH-mm-ss";
    private String screenImagePath;
    private String htmlTextPath;

    public ScreenShot() {

    }


    public String takeScreenShotPath() throws IOException {
        String currentTime = new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
        screenImagePath = this.getClass().getResource("/").getPath();
        screenImagePath = screenImagePath.replace("target/test-classes/", "screenshot_" + currentTime + ".png").substring(1);
        return screenImagePath;

    }

    public String takeHtmlPath() {
        String currentTime = new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
        htmlTextPath = this.getClass().getResource("/").getPath();
        htmlTextPath = htmlTextPath.replace("target/test-classes/", "htmlText_" + currentTime + ".html").substring(1);
        return htmlTextPath;
    }
}
