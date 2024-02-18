package homework.core.impl;

import homework.core.IUser;
import homework.core.Reporter;

public class ReporterConsole implements Reporter {
    private IUser user;
    public ReporterConsole(IUser user){
        this.user = user;
    }
    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}