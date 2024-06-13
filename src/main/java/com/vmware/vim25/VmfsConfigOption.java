package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LongOption;
import com.vmware.vim25.VmfsConfigOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsConfigOption", propOrder = {"blockSizeOption", "unmapGranularityOption", "unmapBandwidthFixedValue", "unmapBandwidthDynamicMin", "unmapBandwidthDynamicMax", "unmapBandwidthIncrement"})
public class VmfsConfigOption extends DynamicData {
  protected int blockSizeOption;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> unmapGranularityOption;
  
  protected LongOption unmapBandwidthFixedValue;
  
  protected LongOption unmapBandwidthDynamicMin;
  
  protected LongOption unmapBandwidthDynamicMax;
  
  protected Long unmapBandwidthIncrement;
  
  public int getBlockSizeOption() {
    return this.blockSizeOption;
  }
  
  public void setBlockSizeOption(int paramInt) {
    this.blockSizeOption = paramInt;
  }
  
  public List<Integer> getUnmapGranularityOption() {
    if (this.unmapGranularityOption == null)
      this.unmapGranularityOption = new ArrayList<>(); 
    return this.unmapGranularityOption;
  }
  
  public LongOption getUnmapBandwidthFixedValue() {
    return this.unmapBandwidthFixedValue;
  }
  
  public void setUnmapBandwidthFixedValue(LongOption paramLongOption) {
    this.unmapBandwidthFixedValue = paramLongOption;
  }
  
  public LongOption getUnmapBandwidthDynamicMin() {
    return this.unmapBandwidthDynamicMin;
  }
  
  public void setUnmapBandwidthDynamicMin(LongOption paramLongOption) {
    this.unmapBandwidthDynamicMin = paramLongOption;
  }
  
  public LongOption getUnmapBandwidthDynamicMax() {
    return this.unmapBandwidthDynamicMax;
  }
  
  public void setUnmapBandwidthDynamicMax(LongOption paramLongOption) {
    this.unmapBandwidthDynamicMax = paramLongOption;
  }
  
  public Long getUnmapBandwidthIncrement() {
    return this.unmapBandwidthIncrement;
  }
  
  public void setUnmapBandwidthIncrement(Long paramLong) {
    this.unmapBandwidthIncrement = paramLong;
  }
}
