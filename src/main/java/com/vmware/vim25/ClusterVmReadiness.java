package com.vmware.vim25;

import com.vmware.vim25.ClusterVmReadiness;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmReadiness", propOrder = {"readyCondition", "postReadyDelay"})
public class ClusterVmReadiness extends DynamicData {
  protected String readyCondition;
  
  protected Integer postReadyDelay;
  
  public String getReadyCondition() {
    return this.readyCondition;
  }
  
  public void setReadyCondition(String paramString) {
    this.readyCondition = paramString;
  }
  
  public Integer getPostReadyDelay() {
    return this.postReadyDelay;
  }
  
  public void setPostReadyDelay(Integer paramInteger) {
    this.postReadyDelay = paramInteger;
  }
}
