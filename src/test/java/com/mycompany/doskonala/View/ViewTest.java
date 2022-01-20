package com.mycompany.doskonala.View;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewTest {
    /**
     *
     * @author J->J
     * @version 1
     */
    /**
     Class of ViewTest */
    private static final String MESSAGE_FOR_ENTER_LOWER_COMPARTMENT = "Please Enter Lower Compartment";
    private static final String MESSAGE_FOR_ENTER_HIGHER_COMPARTMENT = "Please Enter Higher Compartment";

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private View view;

    @BeforeEach
    void beforeEach(){
        view = new View();
        System.setOut(new PrintStream(outputStreamCaptor));

    }
    /**
     Test showDialogLowers */
    public
    @Test
    void showDialogLower() {

        view.showDialogLower();
        assertEquals(outputStreamCaptor.toString().trim(), MESSAGE_FOR_ENTER_LOWER_COMPARTMENT);
    }
    /**
     Test showDialogHigher */
    @Test
    void showDialogHigher() {
        view.showDialogHigher();
        assertEquals(outputStreamCaptor.toString().trim(), MESSAGE_FOR_ENTER_HIGHER_COMPARTMENT);
    }
}