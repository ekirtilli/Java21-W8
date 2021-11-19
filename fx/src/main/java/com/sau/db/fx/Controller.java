package com.sau.db.fx;

import com.sau.db.AppDB;
import com.sau.db.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label l1;

    @FXML
    protected void onHelloButtonClick() {
        AppDB adb=new AppDB();
        Student st=adb.getir(2);
        System.out.println("Gelen:"+ st.getName()+ " Yaş:" + st.getAge());
        l1.setText(st.getName()+ st.getAge());
    }
}