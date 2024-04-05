import java.util.List;

class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        view.setVisible(true);
    }

    public void saveToFile(String text) {
        model.setLines(List.of(text.split("\n")));
    }

    public String loadFromFile() {
        return String.join("\n", model.getLines());
    }

}