package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNumaInfo;
import com.vmware.vim25.HostNumaNode;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNumaInfo", propOrder = {"type", "numNodes", "numaNode"})
public class HostNumaInfo extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  protected int numNodes;
  
  protected List<HostNumaNode> numaNode;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public int getNumNodes() {
    return this.numNodes;
  }
  
  public void setNumNodes(int paramInt) {
    this.numNodes = paramInt;
  }
  
  public List<HostNumaNode> getNumaNode() {
    if (this.numaNode == null)
      this.numaNode = new ArrayList<>(); 
    return this.numaNode;
  }
}
