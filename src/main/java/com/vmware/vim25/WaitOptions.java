package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.WaitOptions;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitOptions", propOrder = {"maxWaitSeconds", "maxObjectUpdates"})
public class WaitOptions extends DynamicData {
  protected Integer maxWaitSeconds;
  
  protected Integer maxObjectUpdates;
  
  public Integer getMaxWaitSeconds() {
    return this.maxWaitSeconds;
  }
  
  public void setMaxWaitSeconds(Integer paramInteger) {
    this.maxWaitSeconds = paramInteger;
  }
  
  public Integer getMaxObjectUpdates() {
    return this.maxObjectUpdates;
  }
  
  public void setMaxObjectUpdates(Integer paramInteger) {
    this.maxObjectUpdates = paramInteger;
  }
}
