package com.hz;

public abstract class Student implements Observer {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void listen(String topic) {
        String opinion = String.format(this.getOpinion(), topic);
        String think = String.format("[%s] > %s", this.name, opinion);

        Console.writeLine(think);
    }

    public abstract String getOpinion();

    public void update(String topic) {
        this.listen(topic);
    }
}
