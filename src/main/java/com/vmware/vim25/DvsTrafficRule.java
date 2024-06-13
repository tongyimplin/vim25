package com.vmware.vim25;

import com.vmware.vim25.DvsNetworkRuleAction;
import com.vmware.vim25.DvsNetworkRuleQualifier;
import com.vmware.vim25.DvsTrafficRule;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsTrafficRule", propOrder = {"key", "description", "sequence", "qualifier", "action", "direction"})
public class DvsTrafficRule extends DynamicData {
  protected String key;
  
  protected String description;
  
  protected Integer sequence;
  
  protected List<DvsNetworkRuleQualifier> qualifier;
  
  protected DvsNetworkRuleAction action;
  
  protected String direction;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Integer getSequence() {
    return this.sequence;
  }
  
  public void setSequence(Integer paramInteger) {
    this.sequence = paramInteger;
  }
  
  public List<DvsNetworkRuleQualifier> getQualifier() {
    if (this.qualifier == null)
      this.qualifier = new ArrayList<>(); 
    return this.qualifier;
  }
  
  public DvsNetworkRuleAction getAction() {
    return this.action;
  }
  
  public void setAction(DvsNetworkRuleAction paramDvsNetworkRuleAction) {
    this.action = paramDvsNetworkRuleAction;
  }
  
  public String getDirection() {
    return this.direction;
  }
  
  public void setDirection(String paramString) {
    this.direction = paramString;
  }
}
