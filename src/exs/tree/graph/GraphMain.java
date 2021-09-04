package exs.tree.graph;

import exs.tree.graph.model.GraphModel;
import exs.tree.graph.view.FieldComponent;

import javax.swing.*;
import java.awt.*;

public class GraphMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphModel graphModel = new GraphModel();

        BorderLayout borderLayout = new BorderLayout();
        FieldComponent field = new FieldComponent(graphModel);
    }
}
