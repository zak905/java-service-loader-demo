package org.example;

import org.example.TaskExecuter;

public class AsyncExecuter implements TaskExecuter {
    @Override
    public void execute() {
        System.out.println("I am executing the task async");
    }
}
