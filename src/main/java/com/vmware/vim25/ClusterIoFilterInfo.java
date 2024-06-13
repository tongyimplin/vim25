package com.vmware.vim25;

import com.vmware.vim25.ClusterIoFilterInfo;
import com.vmware.vim25.IoFilterInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterIoFilterInfo", propOrder = {"opType", "vibUrl"})
public class ClusterIoFilterInfo extends IoFilterInfo {
  @XmlElement(required = true)
  protected String opType;
  
  protected String vibUrl;
  
  public String getOpType() {
    return this.opType;
  }
  
  public void setOpType(String paramString) {
    this.opType = paramString;
  }
  
  public String getVibUrl() {
    return this.vibUrl;
  }
  
  public void setVibUrl(String paramString) {
    this.vibUrl = paramString;
  }
}
