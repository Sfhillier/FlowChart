package takeouttacos.flowchart.api;

import takeouttacos.flowchart.impl.FlowChartNode;

/**
 * Created by Scott on 5/2/2017.
 */
public interface IFlowchartNode {
    boolean isLeafNode (FlowChartNode node);

    FlowChartNode hasLeftChild (FlowChartNode node);

    FlowChartNode hasRightChild (FlowChartNode node);
}
