package com.vmware.vim25;

import com.vmware.vim25.DVSHealthCheckConfig;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDVSHealthCheckConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSHealthCheckConfig", propOrder = {"enable", "interval"})
@XmlSeeAlso({VMwareDVSHealthCheckConfig.class})
public class DVSHealthCheckConfig extends DynamicData {
  protected Boolean enable;
  
  protected Integer interval;
  
  public Boolean isEnable() {
    return this.enable;
  }
  
  public void setEnable(Boolean paramBoolean) {
    this.enable = paramBoolean;
  }
  
  public Integer getInterval() {
    return this.interval;
  }
  
  public void setInterval(Integer paramInteger) {
    this.interval = paramInteger;
  }
}
