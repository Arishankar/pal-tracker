package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    TimeEntry create(TimeEntry entry);

    TimeEntry find(long timeEntryId);

    List<TimeEntry> list();

    TimeEntry update(long id, TimeEntry newEntry);

    void delete(long timeEntryId);
}
