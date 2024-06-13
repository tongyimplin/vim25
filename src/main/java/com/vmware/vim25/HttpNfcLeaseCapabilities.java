package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HttpNfcLeaseCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseCapabilities", propOrder = {"pullModeSupported", "corsSupported"})
public class HttpNfcLeaseCapabilities extends DynamicData {
  protected boolean pullModeSupported;
  
  protected boolean corsSupported;
  
  public boolean isPullModeSupported() {
    return this.pullModeSupported;
  }
  
  public void setPullModeSupported(boolean paramBoolean) {
    this.pullModeSupported = paramBoolean;
  }
  
  public boolean isCorsSupported() {
    return this.corsSupported;
  }
  
  public void setCorsSupported(boolean paramBoolean) {
    this.corsSupported = paramBoolean;
  }
}
