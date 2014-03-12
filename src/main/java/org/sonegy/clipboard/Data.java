package org.sonegy.clipboard;

/**
 * @author: sonegy@sk.com
 */
public class Data {
    private String text;
    public Data(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
