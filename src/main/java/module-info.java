module com.tsareva.d.qa_guru_18_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tsareva.d.qa_guru_18_git to javafx.fxml;
    exports com.tsareva.d.qa_guru_18_git;
}