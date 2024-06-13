package com.vmware.vim25;

import com.vmware.vim25.DvsFilterConfig;
import com.vmware.vim25.DvsFilterConfigSpec;
import com.vmware.vim25.DvsFilterParameter;
import com.vmware.vim25.DvsTrafficFilterConfig;
import com.vmware.vim25.InheritablePolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsFilterConfig", propOrder = {"key", "agentName", "slotNumber", "parameters", "onFailure"})
@XmlSeeAlso({DvsTrafficFilterConfig.class, DvsFilterConfigSpec.class})
public class DvsFilterConfig extends InheritablePolicy {
  protected String key;
  
  protected String agentName;
  
  protected String slotNumber;
  
  protected DvsFilterParameter parameters;
  
  protected String onFailure;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getAgentName() {
    return this.agentName;
  }
  
  public void setAgentName(String paramString) {
    this.agentName = paramString;
  }
  
  public String getSlotNumber() {
    return this.slotNumber;
  }
  
  public void setSlotNumber(String paramString) {
    this.slotNumber = paramString;
  }
  
  public DvsFilterParameter getParameters() {
    return this.parameters;
  }
  
  public void setParameters(DvsFilterParameter paramDvsFilterParameter) {
    this.parameters = paramDvsFilterParameter;
  }
  
  public String getOnFailure() {
    return this.onFailure;
  }
  
  public void setOnFailure(String paramString) {
    this.onFailure = paramString;
  }
}
