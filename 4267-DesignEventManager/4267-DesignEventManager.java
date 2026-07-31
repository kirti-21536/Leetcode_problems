// Last updated: 8/1/2026, 12:01:13 AM
import java.util.*;

class EventManager {
    static class Event {
        int id;
        int priority;

        Event(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
    private Map<Integer, Event> map;
    private TreeSet<Event> set;

    public EventManager(int[][] events) {
        map = new HashMap<>();

        set = new TreeSet<>((a, b) -> {
            if (a.priority != b.priority) {
                return b.priority - a.priority; 
            }
            return a.id - b.id; 
        });

        for (int[] e : events) {
            Event ev = new Event(e[0], e[1]);
            map.put(e[0], ev);
            set.add(ev);
        }
    }

    public void updatePriority(int eventId, int newPriority) {
        Event ev = map.get(eventId);
        set.remove(ev);

        ev.priority = newPriority;

        set.add(ev);
    }

    public int pollHighest() {
        if (set.isEmpty()) return -1;

        Event top = set.first();

        set.remove(top);
        map.remove(top.id);

        return top.id;
    }
}
/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */