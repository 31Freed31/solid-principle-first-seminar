package homework.core;

import homework.core.impl.PersisterConsole;
import homework.core.impl.ReporterConsole;
import homework.core.impl.User;

public class UserRunner {
    IUser user;
    public UserRunner(IUser user){
        this.user = user;
    }
    public void run(){
        Reporter reporter = new ReporterConsole(user);
        reporter.report();
        Persister persister = new PersisterConsole(user);
        persister.save();
    }
}