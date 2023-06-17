import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Activity{
    int start;
    int end;
    Activity(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}
public class maxActivity {
      public static int maximumActivities(List<Integer> start, List<Integer> end) {
        int n = start.size();
    List<Activity> activities = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        activities.add(new Activity(start.get(i), end.get(i)));
    }
    Collections.sort(activities, Comparator.comparingInt(a -> a.end));
    int selectedActivities = 1;
    int lastSelectedIndex = 0;
    
    for (int i = 1; i < n; i++) {
        if (activities.get(i).start >= activities.get(lastSelectedIndex).end) {
            selectedActivities++;
            lastSelectedIndex = i;
        }
    }
    
    return selectedActivities;
    }
}
