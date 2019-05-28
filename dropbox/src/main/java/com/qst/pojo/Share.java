package com.qst.pojo;

public class Share {

    private int shareld;
    private String shareUrl;
    private String path;
    private int shareUser;
    private int status;
    private String command;

    public int getShareld() {
        return shareld;
    }

    public void setShareld(int shareld) {
        this.shareld = shareld;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getShareUser() {
        return shareUser;
    }

    public void setShareUser(int shareUser) {
        this.shareUser = shareUser;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Share{" +
                "shareld=" + shareld +
                ", shareUrl='" + shareUrl + '\'' +
                ", path='" + path + '\'' +
                ", shareUser=" + shareUser +
                ", status=" + status +
                ", command='" + command + '\'' +
                '}';
    }
}
