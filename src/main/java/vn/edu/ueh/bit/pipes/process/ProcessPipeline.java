package vn.edu.ueh.bit.pipes.process;

import java.util.ArrayList;
import java.util.List;

public class ProcessPipeline {
    private final List<IFilter<IMessage>> filters = new ArrayList<>();

    // Thêm bộ lọc vào pipeline
    public void addFilter(IFilter<IMessage> filter) {
        filters.add(filter);
    }

    // Xử lý message qua tất cả các bộ lọc
    public IMessage process(IMessage message) {
        for (IFilter<IMessage> filter : filters) {
            message = filter.execute(message);
        }
        return message;
    }
}
