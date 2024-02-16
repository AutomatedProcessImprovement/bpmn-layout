package ee.ut.cs.pix.bpmn.graph;

import ee.ut.cs.pix.bpmn.di.BPMNElement;
import ee.ut.cs.pix.bpmn.di.Bounds;

// FlowNode represents a node in the BPMN process, e.g., a task, event, or gateway.
public class FlowNode {
    public String id;
    public String name;
    public BPMNElement type;
    public Double x;
    public Double y;
    public Double width;
    public Double height;
    public Bounds bounds;

    public FlowNode(String id, BPMNElement type) {
        this.id = id;
        this.type = type;
    }

    public FlowNode(String id, String name, BPMNElement type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.bounds = Bounds.forNode(type);
    }
}
