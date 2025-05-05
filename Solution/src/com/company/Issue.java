package com.company;

import java.time.LocalDate;

public class Issue extends BoardItem {

    private String description;

    public Issue(String title, String description, LocalDate dueDate) {
        super(title, dueDate, Status.OPEN);
        setDescription(description);

    }

    protected void setDescription(String description) {
        if (description.isEmpty()) {
            this.description = "No description";

        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }


}
