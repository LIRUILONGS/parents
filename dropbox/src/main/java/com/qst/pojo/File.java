package com.qst.pojo;

public class File {

    private int fileld;
    private  String userName;
    private  String filePath;

    public int getFileld() {
        return fileld;
    }

    public void setFileld(int fileld) {
        this.fileld = fileld;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileld=" + fileld +
                ", userName='" + userName + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
