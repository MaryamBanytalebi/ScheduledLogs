package org.maktab.scheduledlogs.repository;

import org.maktab.scheduledlogs.model.Logs;

import java.util.List;

public interface IRepository {

    List<Logs> getLogs();
    Logs getLog(long inputID);
    void updateLog(Logs logs);
    void insertLog(Logs logs);
    void insertLogs(Logs... logs);
    void deleteLog(Logs logs);
}
