import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<String> lines;

    public Model() {
        this.lines = new ArrayList<>();
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public void addLine(String line) {
        this.lines.add(line);
    }

    public void removeLine(int index) {
        if (index >= 0 && index < lines.size()) {
            this.lines.remove(index);
        }
    }
}

