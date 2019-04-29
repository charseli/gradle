package com.ctsp;


import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GreetingPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("hello",Greeting.class,(t)->{
            t.setOne("hello");
            t.setTwo("world");
        });
    }
}
