package com.vmware.vim25;

import com.vmware.vim25.DvsNetworkRuleAction;
import com.vmware.vim25.DvsUpdateTagNetworkRuleAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsUpdateTagNetworkRuleAction", propOrder = {"qosTag", "dscpTag"})
public class DvsUpdateTagNetworkRuleAction extends DvsNetworkRuleAction {
  protected Integer qosTag;
  
  protected Integer dscpTag;
  
  public Integer getQosTag() {
    return this.qosTag;
  }
  
  public void setQosTag(Integer paramInteger) {
    this.qosTag = paramInteger;
  }
  
  public Integer getDscpTag() {
    return this.dscpTag;
  }
  
  public void setDscpTag(Integer paramInteger) {
    this.dscpTag = paramInteger;
  }
}
