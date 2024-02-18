package dip1.model;

import dip1.model.util.ReportPrinter;

import java.util.Collection;

public interface ReportManager {
    void output(Collection<ReportItem> items);
}
