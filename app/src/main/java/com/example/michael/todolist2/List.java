package com.example.michael.todolist2;

/**
 * Created by michael on 2016/7/7.
 */
public class List
{

    private Integer listId;
    private String title;
    private String text;
    private Integer status;

    public List(Integer listId, String title, String text,Integer status) {
        this.listId = listId;
        this.title = title;
        this.text = text;
        this.status = status;
    }


    public Integer getListid() {
        return listId;
    }

    public void setListid(Integer listId) {
        this.listId = listId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public Integer getStatus(){
        return status;
    }
    public void setStatus(Integer status){
        this.status = status;
    }

    @Override
    public String toString() {
        String statustext;
        if(status==0){
            statustext = "未完成";
        }
        else{
            statustext = "已完成";
        }
        return "任务" + listId + " 标题" + title + " 内容" + text+" 完成状态"+statustext;
    }

}
