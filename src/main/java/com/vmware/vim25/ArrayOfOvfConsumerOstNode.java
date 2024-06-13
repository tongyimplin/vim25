package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfConsumerOstNode;
import com.vmware.vim25.OvfConsumerOstNode;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfConsumerOstNode", propOrder = {"ovfConsumerOstNode"})
public class ArrayOfOvfConsumerOstNode {
  @XmlElement(name = "OvfConsumerOstNode")
  protected List<OvfConsumerOstNode> ovfConsumerOstNode;
  
  public List<OvfConsumerOstNode> getOvfConsumerOstNode() {
    if (this.ovfConsumerOstNode == null)
      this.ovfConsumerOstNode = new ArrayList<>(); 
    return this.ovfConsumerOstNode;
  }
}
