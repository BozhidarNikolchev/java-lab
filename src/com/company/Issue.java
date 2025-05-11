package com.company;

import java.time.LocalDate;

public class Issue extends BoardItem {

    private final String description;

    public Issue(String title, String description, LocalDate dueDate) {
        super(title, dueDate, Status.OPEN);

        if (description.isEmpty()) {
            this.description = "No description";
        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String viewInfo() {
        String baseInfo = super.viewInfo();
        return String.format("Task: %s, Description: %s", baseInfo, getDescription());
    }
}
