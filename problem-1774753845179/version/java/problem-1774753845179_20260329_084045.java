// Last updated: 3/29/2026, 8:40:45 AM
1import java.util.*;
2
3class EventManager {
4    static class Event {
5        int id;
6        int priority;
7
8        Event(int id, int priority) {
9            this.id = id;
10            this.priority = priority;
11        }
12    }
13    private Map<Integer, Event> map;
14    private TreeSet<Event> set;
15
16    public EventManager(int[][] events) {
17        map = new HashMap<>();
18
19        set = new TreeSet<>((a, b) -> {
20            if (a.priority != b.priority) {
21                return b.priority - a.priority; 
22            }
23            return a.id - b.id; 
24        });
25
26        for (int[] e : events) {
27            Event ev = new Event(e[0], e[1]);
28            map.put(e[0], ev);
29            set.add(ev);
30        }
31    }
32
33    public void updatePriority(int eventId, int newPriority) {
34        Event ev = map.get(eventId);
35        set.remove(ev);
36
37        ev.priority = newPriority;
38
39        set.add(ev);
40    }
41
42    public int pollHighest() {
43        if (set.isEmpty()) return -1;
44
45        Event top = set.first();
46
47        set.remove(top);
48        map.remove(top.id);
49
50        return top.id;
51    }
52}
53/**
54 * Your EventManager object will be instantiated and called as such:
55 * EventManager obj = new EventManager(events);
56 * obj.updatePriority(eventId,newPriority);
57 * int param_2 = obj.pollHighest();
58 */