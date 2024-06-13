package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPlugStoreTopologyPath;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPlugStoreTopologyPath", propOrder = {"key", "name", "channelNumber", "targetNumber", "lunNumber", "adapter", "target", "device"})
public class HostPlugStoreTopologyPath extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  protected Integer channelNumber;
  
  protected Integer targetNumber;
  
  protected Integer lunNumber;
  
  protected String adapter;
  
  protected String target;
  
  protected String device;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Integer getChannelNumber() {
    return this.channelNumber;
  }
  
  public void setChannelNumber(Integer paramInteger) {
    this.channelNumber = paramInteger;
  }
  
  public Integer getTargetNumber() {
    return this.targetNumber;
  }
  
  public void setTargetNumber(Integer paramInteger) {
    this.targetNumber = paramInteger;
  }
  
  public Integer getLunNumber() {
    return this.lunNumber;
  }
  
  public void setLunNumber(Integer paramInteger) {
    this.lunNumber = paramInteger;
  }
  
  public String getAdapter() {
    return this.adapter;
  }
  
  public void setAdapter(String paramString) {
    this.adapter = paramString;
  }
  
  public String getTarget() {
    return this.target;
  }
  
  public void setTarget(String paramString) {
    this.target = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
