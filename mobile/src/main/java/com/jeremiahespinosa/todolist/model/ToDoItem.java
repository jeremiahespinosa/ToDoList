package com.jeremiahespinosa.todolist.model;

public class ToDoItem {

	public enum Priority {
		LOW, MED, HIGH
	}

	public enum Status {
        NOT_DONE, DONE
	}

    String title;
    String notes;
    String dateCreated;
    String dateDue;
    String timeDue;
    String lat;
    String lng;
    String address;

}
