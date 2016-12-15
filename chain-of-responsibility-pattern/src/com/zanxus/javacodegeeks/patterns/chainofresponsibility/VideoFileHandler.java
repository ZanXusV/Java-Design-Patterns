package com.zanxus.javacodegeeks.patterns.chainofresponsibility;

/**
 * @author zanxus
 * @description
 * @create 2016-12-15-上午10:19
 */
public class VideoFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public VideoFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("video")) {
            System.out.println("Process and saving video file ... by"+handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " fowards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
