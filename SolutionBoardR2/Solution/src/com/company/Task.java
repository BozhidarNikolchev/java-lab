package com.company;

import java.time.LocalDate;

public class Task extends BoardItem {
    private static final int ASSIGNEE_MIN_LENGTH = 5;
    private static final int ASSIGNEE_MAX_LENGTH = 30;

    private String assignee;

    public Task(String title, String assignee, LocalDate dueDate) {
        super(title, dueDate, Status.TODO);
        validateAssignee(assignee);
        this.assignee = assignee;
    }

    public String getAssignee() {
        return assignee;
    }

    protected void setAssignee(String assignee) {
        validateAssignee(assignee);

        logEvent(String.format("Assignee changed from %s to %s", this.getAssignee(), assignee));

        this.assignee = assignee;

    }

    private void validateAssignee(String assignee) {
        if (assignee.length() < ASSIGNEE_MIN_LENGTH || assignee.length() > ASSIGNEE_MAX_LENGTH) {
            throw new IllegalArgumentException(String.format("The assignee's name must be between" +
                    "%d and %d characters.", ASSIGNEE_MIN_LENGTH, ASSIGNEE_MAX_LENGTH));
        }
    }


}



