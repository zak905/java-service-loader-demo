package org.example;

public class SyncExecuter implements TaskExecuter {


    @Override
    public void execute() {
        System.out.println("I am executing the task Sync");
    }
}
