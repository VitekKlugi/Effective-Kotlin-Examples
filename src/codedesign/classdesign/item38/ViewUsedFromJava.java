package codedesign.classdesign.item38;

import kotlin.Unit;

public class ViewUsedFromJava {
    public static void main(String[] args) {
        KotlinView view = new KotlinView();
        view.setOnSomethingSelected(str -> Unit.INSTANCE); // we must explicitly return UNIT type
        view.setOnSomethingClicked(str -> {});
        view.setOnClicked(str -> {});
    }
}
