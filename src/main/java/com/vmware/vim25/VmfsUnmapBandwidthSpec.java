package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VmfsUnmapBandwidthSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsUnmapBandwidthSpec", propOrder = {"policy", "fixedValue", "dynamicMin", "dynamicMax"})
public class VmfsUnmapBandwidthSpec extends DynamicData {
  @XmlElement(required = true)
  protected String policy;
  
  protected long fixedValue;
  
  protected long dynamicMin;
  
  protected long dynamicMax;
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
  
  public long getFixedValue() {
    return this.fixedValue;
  }
  
  public void setFixedValue(long paramLong) {
    this.fixedValue = paramLong;
  }
  
  public long getDynamicMin() {
    return this.dynamicMin;
  }
  
  public void setDynamicMin(long paramLong) {
    this.dynamicMin = paramLong;
  }
  
  public long getDynamicMax() {
    return this.dynamicMax;
  }
  
  public void setDynamicMax(long paramLong) {
    this.dynamicMax = paramLong;
  }
}
