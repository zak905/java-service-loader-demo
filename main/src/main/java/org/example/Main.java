package org.example;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<TaskExecuter> loader = ServiceLoader.load(TaskExecuter.class);

        for (TaskExecuter executer: loader) {
            executer.execute();
        }
}

}
