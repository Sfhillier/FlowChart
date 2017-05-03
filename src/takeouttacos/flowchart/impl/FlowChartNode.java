package takeouttacos.flowchart.impl;

import takeouttacos.flowchart.api.IFlowchartNode;

/**
 * Created by Scott on 4/23/2017.
 */
public class FlowChartNode implements IFlowchartNode {

    private String name;
    private FlowChartNode predecessor;
    private FlowChartNode successor;
    private boolean isLeafNode;

    public FlowChartNode (String name, FlowChartNode predecessor, FlowChartNode successor, boolean isLeafNode) {
        this.name = name;
        this.predecessor = predecessor;
        this.successor = successor;
        this.isLeafNode = isLeafNode;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean isLeafNode(FlowChartNode node) {
        return false;
    }

    @Override
    public FlowChartNode hasLeftChild(FlowChartNode node) {
        return null;
    }

    @Override
    public FlowChartNode hasRightChild(FlowChartNode node) {
        return null;
    }
}
