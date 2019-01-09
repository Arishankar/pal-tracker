package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    TimeEntry create(TimeEntry entry);

    TimeEntry find(Long timeEntryId);

    List<TimeEntry> list();

    TimeEntry update(Long id, TimeEntry newEntry);

    void delete(Long timeEntryId);
}
