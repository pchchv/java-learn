package exs.tree.graph.view;

import exs.stack_and_queue.SimpleQueue;
import exs.stack_and_queue.SimpleStack;
import exs.tree.graph.model.GraphModel;
import exs.tree.graph.model.GraphNode;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FieldComponent extends JComponent {
    GraphModel graphModel;

    ArrayList<GraphNode> visitedList = new ArrayList<>();

    SimpleQueue<GraphNode> queue = new SimpleQueue<>();
    SimpleStack<GraphNode> stack = new SimpleStack<>();

    GraphNode currentNode;

    public FieldComponent(GraphModel graphModel) {
        this.graphModel = graphModel;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        int cellSize = getWidth() / graphModel.getFieldWidth();
        for (int i = 0; i < graphModel.getFieldHeight(); i++) {
            for (int j = 0; j < graphModel.getFieldWidth()) {
                GraphNode node = graphModel.getNodes()[i][j];
                if (node == graphModel.getRoot()) {
                    g.setColor(Color.RED);
                } else if (visitedList.contains(node)) {
                    g.setColor(Color.LIGHT_GRAY);
                } else if (node.hasOdject()) {
                    g.setColor(Color.YELLOW);
                } else if (node.equals(currentNode)) {
                    g.setColor(Color.GRAY);
                } else {
                    g.setColor(Color.MAGENTA);
                }
                g.fillRect(j * cellSize, i * cellSize, (int)(cellSize / 1.2), (int)(cellSize / 1.2));
            }
        }
    }
}
