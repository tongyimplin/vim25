package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.PerfCounterInfo;
import com.vmware.vim25.PerfStatsType;
import com.vmware.vim25.PerfSummaryType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfCounterInfo", propOrder = {"key", "nameInfo", "groupInfo", "unitInfo", "rollupType", "statsType", "level", "perDeviceLevel", "associatedCounterId"})
public class PerfCounterInfo extends DynamicData {
  protected int key;
  
  @XmlElement(required = true)
  protected ElementDescription nameInfo;
  
  @XmlElement(required = true)
  protected ElementDescription groupInfo;
  
  @XmlElement(required = true)
  protected ElementDescription unitInfo;
  
  @XmlElement(required = true)
  protected PerfSummaryType rollupType;
  
  @XmlElement(required = true)
  protected PerfStatsType statsType;
  
  protected Integer level;
  
  protected Integer perDeviceLevel;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> associatedCounterId;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public ElementDescription getNameInfo() {
    return this.nameInfo;
  }
  
  public void setNameInfo(ElementDescription paramElementDescription) {
    this.nameInfo = paramElementDescription;
  }
  
  public ElementDescription getGroupInfo() {
    return this.groupInfo;
  }
  
  public void setGroupInfo(ElementDescription paramElementDescription) {
    this.groupInfo = paramElementDescription;
  }
  
  public ElementDescription getUnitInfo() {
    return this.unitInfo;
  }
  
  public void setUnitInfo(ElementDescription paramElementDescription) {
    this.unitInfo = paramElementDescription;
  }
  
  public PerfSummaryType getRollupType() {
    return this.rollupType;
  }
  
  public void setRollupType(PerfSummaryType paramPerfSummaryType) {
    this.rollupType = paramPerfSummaryType;
  }
  
  public PerfStatsType getStatsType() {
    return this.statsType;
  }
  
  public void setStatsType(PerfStatsType paramPerfStatsType) {
    this.statsType = paramPerfStatsType;
  }
  
  public Integer getLevel() {
    return this.level;
  }
  
  public void setLevel(Integer paramInteger) {
    this.level = paramInteger;
  }
  
  public Integer getPerDeviceLevel() {
    return this.perDeviceLevel;
  }
  
  public void setPerDeviceLevel(Integer paramInteger) {
    this.perDeviceLevel = paramInteger;
  }
  
  public List<Integer> getAssociatedCounterId() {
    if (this.associatedCounterId == null)
      this.associatedCounterId = new ArrayList<>(); 
    return this.associatedCounterId;
  }
}
