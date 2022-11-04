package sixkata;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class VisitorStatistics {
    private final LongAdder counter = new LongAdder();
    private final Map<String, Long> visitorCount = new ConcurrentHashMap<>();

    public void visit(String name) {
        counter.increment();
        visitorCount.merge(name,1L, Long::sum);
    }

    public long totalVisits() {
        return counter.sum();
    }

    public long visitsBy(String name) {
        return visitorCount.getOrDefault(name, 0L);
    }
}
