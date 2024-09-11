import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller(StreamService StreamService) {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        this.streamService.sortStreams(streams);
    }
}