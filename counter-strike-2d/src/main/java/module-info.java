open module javafx.sample.assignment {
    requires transitive javafx.fxml;
    requires transitive javafx.web;
    requires transitive javafx.swing;
    requires transitive javafx.graphics;
    requires transitive javafx.graphicsEmpty;
    //if any unrelated error occurred, first invalidate(file)then rebuild(tools)
}