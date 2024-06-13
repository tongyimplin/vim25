package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostHyperThreadScheduleInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHyperThreadScheduleInfo", propOrder = {"available", "active", "config"})
public class HostHyperThreadScheduleInfo extends DynamicData {
  protected boolean available;
  
  protected boolean active;
  
  protected boolean config;
  
  public boolean isAvailable() {
    return this.available;
  }
  
  public void setAvailable(boolean paramBoolean) {
    this.available = paramBoolean;
  }
  
  public boolean isActive() {
    return this.active;
  }
  
  public void setActive(boolean paramBoolean) {
    this.active = paramBoolean;
  }
  
  public boolean isConfig() {
    return this.config;
  }
  
  public void setConfig(boolean paramBoolean) {
    this.config = paramBoolean;
  }
}
