package com.jangphong.hem.karbicalender2;

public class Item {

    private String event;
    private String time;
    private String date;
    private int uniqueId;
    private String notesDate;
    private String notes;
    private String notesTitle;
    private String id;

    public Item(String event, String time, String date, int uniqueId) {
        this.event = event;
        this.time = time;
        this.date = date;
        this.uniqueId = uniqueId;
    }

    public Item(String notesDate, String notes, String notesTitle) {
        this.notesDate = notesDate;
        this.notes = notes;
        this.notesTitle = notesTitle;
    }
    public Item(String id)
    {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getNotesDate() {
        return notesDate;
    }

    public String getNotes() {
        return notes;
    }

    public String getNotesTitle() {
        return notesTitle;
    }

    public void setNotesDate(String notesDate) {
        this.notesDate = notesDate;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setNotesTitle(String notesTitle) {
        this.notesTitle = notesTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
