package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PerfInterval;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfInterval", propOrder = {"key", "samplingPeriod", "name", "length", "level", "enabled"})
public class PerfInterval extends DynamicData {
  protected int key;
  
  protected int samplingPeriod;
  
  @XmlElement(required = true)
  protected String name;
  
  protected int length;
  
  protected Integer level;
  
  protected boolean enabled;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public int getSamplingPeriod() {
    return this.samplingPeriod;
  }
  
  public void setSamplingPeriod(int paramInt) {
    this.samplingPeriod = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getLength() {
    return this.length;
  }
  
  public void setLength(int paramInt) {
    this.length = paramInt;
  }
  
  public Integer getLevel() {
    return this.level;
  }
  
  public void setLevel(Integer paramInteger) {
    this.level = paramInteger;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
}
