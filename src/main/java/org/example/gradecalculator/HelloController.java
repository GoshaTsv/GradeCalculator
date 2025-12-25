package org.example.gradecalculator;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    public Button changeRoundTo07Button;
    public Button changeRoundTo06Button;
    public Button changeRoundTo05Button;
    public Button changeMaxGradeTo12Button;
    public Button changeMaxGradeTo10Button;
    public Button changeMaxGradeTo5Button;
    public ProgressBar gradeBar;
    public Label resultGrade;
    public Rectangle resultBackground;
    public Label resultLabel;
    public HBox NumberRow4;
    public HBox NumberRow3;
    public Button deleteAllGradesButton;
    public Button deleteLastGradeButton;
    public Label allGrades;
    private List<Integer> grades = new ArrayList<>();
    double average = 0;
    double roundVal = 0.5;
    int maxGrade = 12;

    public void gradeButton12(ActionEvent event) {
        grades.add(12);
        applyChanges();
    }

    public void gradeButton11(ActionEvent event) {
        grades.add(11);
        applyChanges();
    }

    public void gradeButton10(ActionEvent event) {
        grades.add(10);
        applyChanges();
    }

    public void gradeButton9(ActionEvent event) {
        grades.add(9);
        applyChanges();
    }

    public void gradeButton8(ActionEvent event) {
        grades.add(8);
        applyChanges();
    }

    public void gradeButton7(ActionEvent event) {
        grades.add(7);
        applyChanges();
    }

    public void gradeButton6(ActionEvent event) {
        grades.add(6);
        applyChanges();
    }

    public void gradeButton5(ActionEvent event) {
        grades.add(5);
        applyChanges();
    }

    public void gradeButton4(ActionEvent event) {
        grades.add(4);
        applyChanges();
    }

    public void gradeButton3(ActionEvent event) {
        grades.add(3);
        applyChanges();
    }

    public void gradeButton2(ActionEvent event) {
        grades.add(2);
        applyChanges();
    }

    public void gradeButton1(ActionEvent event) {
        grades.add(1);
        applyChanges();
    }

    public void deleteAllGrades(ActionEvent event) {
        deleteAllGradesPlaceholder();
    }
    public void deleteAllGradesPlaceholder(){
        if (!grades.isEmpty()) {
            grades.clear();
            deleteAllGradesButton.setDisable(true);
            deleteLastGradeButton.setDisable(true);
            gradeBar.setProgress(0);
            resultBackground.setVisible(false);
            resultLabel.setText("");
            resultGrade.setText("");
            allGrades.setText("");
        }
    }

    public void gradeButton0(ActionEvent event) {
        grades.add(0);
        applyChanges();
    }

    public void deleteLastGrade(ActionEvent event) {
        grades.removeLast();
        allGrades.setText(grades.toString().replace("[", "").replace("]", ""));
        if (grades.isEmpty()){
            deleteAllGradesButton.setDisable(true);
            deleteLastGradeButton.setDisable(true);
            gradeBar.setProgress(0);
            resultBackground.setVisible(false);
            resultLabel.setText("");
            resultGrade.setText("");
            average = 0;
        }
        else{
            applyChanges();
        }
    }

    public void changeRoundTo07(ActionEvent event) {
        roundVal = 0.7;
        changeRoundTo07Button.setStyle("-fx-background-color: #000000");
        changeRoundTo06Button.setStyle("-fx-background-color: #FFFFFF");
        changeRoundTo05Button.setStyle("-fx-background-color: #FFFFFF");
        changeRoundTo07Button.setTextFill(Paint.valueOf("#FFFFFF"));
        changeRoundTo06Button.setTextFill(Paint.valueOf("#000000"));
        changeRoundTo05Button.setTextFill(Paint.valueOf("#000000"));
        if (!grades.isEmpty()){
            int result = countResult(average);
            resultGrade.setText(String.valueOf(result));
            gradeBar.setProgress((average /maxGrade));
        }
    }

    public void changeRoundTo06(ActionEvent event) {
        roundVal = 0.6;
        changeRoundTo06Button.setStyle("-fx-background-color: #000000");
        changeRoundTo07Button.setStyle("-fx-background-color: #FFFFFF");
        changeRoundTo05Button.setStyle("-fx-background-color: #FFFFFF");
        changeRoundTo06Button.setTextFill(Paint.valueOf("#FFFFFF"));
        changeRoundTo07Button.setTextFill(Paint.valueOf("#000000"));
        changeRoundTo05Button.setTextFill(Paint.valueOf("#000000"));
        if (!grades.isEmpty()){
            int result = countResult(average);
            resultGrade.setText(String.valueOf(result));
            gradeBar.setProgress((average /maxGrade));
        }

    }

    public void changeRoundTo05(ActionEvent event) {
        roundVal = 0.5;
        changeRoundTo05Button.setStyle("-fx-background-color: #000000");
        changeRoundTo06Button.setStyle("-fx-background-color: #FFFFFF");
        changeRoundTo07Button.setStyle("-fx-background-color: #FFFFFF");
        changeRoundTo05Button.setTextFill(Paint.valueOf("#FFFFFF"));
        changeRoundTo06Button.setTextFill(Paint.valueOf("#000000"));
        changeRoundTo07Button.setTextFill(Paint.valueOf("#000000"));
        if (!grades.isEmpty()){
            int result = countResult(average);
            resultGrade.setText(String.valueOf(result));
            gradeBar.setProgress((average /maxGrade));
        }
    }

    public void changeMaxGradeTo12(ActionEvent event) {
        maxGrade = 12;
        NumberRow3.setVisible(true);
        for(Node button: NumberRow3.getChildren()){
            button.setDisable(false);
        }
        NumberRow4.setVisible(true);
        for(Node button: NumberRow4.getChildren()){
            button.setDisable(false);
        }
        deleteAllGradesPlaceholder();
        changeMaxGradeTo12Button.setStyle("-fx-background-color: #000000");
        changeMaxGradeTo12Button.setTextFill(Paint.valueOf("#FFFFFF"));
        changeMaxGradeTo10Button.setStyle("-fx-background-color: #FFFFFF");
        changeMaxGradeTo10Button.setTextFill(Paint.valueOf("#000000"));
        changeMaxGradeTo5Button.setStyle("-fx-background-color: #FFFFFF");
        changeMaxGradeTo5Button.setTextFill(Paint.valueOf("#000000"));
    }

    public void changeMaxGradeTo10(ActionEvent event) {
        maxGrade = 10;
        NumberRow3.setVisible(true);
        for(Node button: NumberRow3.getChildren()){
            button.setDisable(false);
        }
        NumberRow4.setVisible(false);
        for(Node button: NumberRow4.getChildren()){
            button.setDisable(true);
        }
        deleteAllGradesPlaceholder();
        changeMaxGradeTo10Button.setStyle("-fx-background-color: #000000");
        changeMaxGradeTo10Button.setTextFill(Paint.valueOf("#FFFFFF"));
        changeMaxGradeTo12Button.setStyle("-fx-background-color: #FFFFFF");
        changeMaxGradeTo12Button.setTextFill(Paint.valueOf("#000000"));
        changeMaxGradeTo5Button.setStyle("-fx-background-color: #FFFFFF");
        changeMaxGradeTo5Button.setTextFill(Paint.valueOf("#000000"));
    }

    public void changeMaxGradeTo5(ActionEvent event) {
        maxGrade = 5;
        NumberRow3.setVisible(false);
        for(Node button: NumberRow3.getChildren()){
            button.setDisable(true);
        }
        NumberRow4.setVisible(false);
        for(Node button: NumberRow4.getChildren()){
            button.setDisable(true);
        }
        deleteAllGradesPlaceholder();
        changeMaxGradeTo5Button.setStyle("-fx-background-color: #000000");
        changeMaxGradeTo5Button.setTextFill(Paint.valueOf("#FFFFFF"));
        changeMaxGradeTo10Button.setStyle("-fx-background-color: #FFFFFF");
        changeMaxGradeTo10Button.setTextFill(Paint.valueOf("#000000"));
        changeMaxGradeTo12Button.setStyle("-fx-background-color: #FFFFFF");
        changeMaxGradeTo12Button.setTextFill(Paint.valueOf("#000000"));
    }
    public double countAverage(List<Integer> list){
        int sum = 0;
        int length = list.size();
        for (Integer integer : list) {
            sum += integer;
        }
        allGrades.setText(list.toString().replace("[", "").replace("]", ""));
        return (double) sum /length;
    }
    public int countResult(double avr){
        int res;
        if ((Math.floor(avr) + roundVal) > avr){
            res = (int) Math.floor(avr);
        }
        else {
            res = (int) Math.round(avr);
        }
        decideResultColor(res);
        resultLabel.setText("Кол-во оценок: " + grades.size() + ", средний балл: " + Math.round(avr * 100.0) / 100.0 + ", итоговая оценка: " + res);
        return res;
    }
    public void decideResultColor(int res){
        resultBackground.setVisible(true);
        switch(maxGrade){
            case 5 ->{
                switch(res){
                    case 5, 4 -> resultBackground.setFill(Paint.valueOf("#21ff3f3b"));
                    case 3 -> resultBackground.setFill(Paint.valueOf("#ffec003b"));
                    case 2, 1, 0 -> resultBackground.setFill(Paint.valueOf("#ff28283b"));
                }
            }
            case 10 ->{
                switch(res){
                    case 10, 9, 8 -> resultBackground.setFill(Paint.valueOf("#21ff3f3b"));
                    case 7, 6, 5-> resultBackground.setFill(Paint.valueOf("#ffec003b"));
                    case 4, 3, 2, 1, 0 -> resultBackground.setFill(Paint.valueOf("#ff28283b"));
                }
            }
            case 12 ->{
                switch(res){
                    case 12, 11, 10 -> resultBackground.setFill(Paint.valueOf("#21ff3f3b"));
                    case 9, 8, 7, 6-> resultBackground.setFill(Paint.valueOf("#ffec003b"));
                    case 5, 4, 3, 2, 1, 0 -> resultBackground.setFill(Paint.valueOf("#ff28283b"));
                }
            }
        }
    }
    public void initialize(){
        changeRoundTo05Button.setStyle("-fx-background-color: #000000");
        changeRoundTo05Button.setTextFill(Paint.valueOf("#FFFFFF"));
        changeMaxGradeTo12Button.setStyle("-fx-background-color: #000000");
        changeMaxGradeTo12Button.setTextFill(Paint.valueOf("#FFFFFF"));
        deleteAllGradesButton.setDisable(true);
        deleteLastGradeButton.setDisable(true);
        gradeBar.setProgress(0);
        resultBackground.setVisible(false);
        resultLabel.setText("");
        resultGrade.setText("");
    }
    private void applyChanges(){
        average = countAverage(grades);
        int result = countResult(average);
        resultGrade.setText(String.valueOf(result));
        gradeBar.setProgress((average /maxGrade));
        deleteAllGradesButton.setDisable(false);
        deleteLastGradeButton.setDisable(false);
    }
}
