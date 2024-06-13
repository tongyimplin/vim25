package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNumaNode;
import com.vmware.vim25.HostNumaNode;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNumaNode", propOrder = {"hostNumaNode"})
public class ArrayOfHostNumaNode {
  @XmlElement(name = "HostNumaNode")
  protected List<HostNumaNode> hostNumaNode;
  
  public List<HostNumaNode> getHostNumaNode() {
    if (this.hostNumaNode == null)
      this.hostNumaNode = new ArrayList<>(); 
    return this.hostNumaNode;
  }
}
