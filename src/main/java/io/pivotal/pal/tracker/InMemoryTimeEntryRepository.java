package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements  TimeEntryRepository{

    private Map<Long, TimeEntry> map = new HashMap<Long, TimeEntry>();

    private long counter = 0;


    public TimeEntry create(TimeEntry timeEntry) {
        counter = counter + 1;
        Long id = counter;
        timeEntry.setId(id);

        map.put(id, timeEntry);

        return timeEntry;
    }

    @Override
    public TimeEntry find(Long timeEntryId) {
        return map.get(timeEntryId);
    }

    public List<TimeEntry> list() {
        return new ArrayList<>(map.values());
    }

    @Override
    public TimeEntry update(Long id, TimeEntry timeEntry) {
        TimeEntry obj = map.get(id);
        if (obj != null) {
            obj.setId(id);
            obj.setDate(timeEntry.getDate());
            obj.setHours(timeEntry.getHours());
            obj.setProjectId(timeEntry.getProjectId());
            obj.setUserId(timeEntry.getUserId());
            return obj;
        } else {
            return null;
        }
    }

    @Override
    public void delete(Long id) {
        map.remove(id);
    }
}
