package com.example.app;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("p-button")
@JsModule("./p-button.js")
public class PButton extends Button {

    PButton(String text, ComponentEventListener<ClickEvent<Button>> listener) {
        super(text,listener);
    }
}