package com.vmware.vim25;

import com.vmware.vim25.NetBIOSConfigInfo;
import com.vmware.vim25.WinNetBIOSConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinNetBIOSConfigInfo", propOrder = {"primaryWINS", "secondaryWINS"})
public class WinNetBIOSConfigInfo extends NetBIOSConfigInfo {
  @XmlElement(required = true)
  protected String primaryWINS;
  
  protected String secondaryWINS;
  
  public String getPrimaryWINS() {
    return this.primaryWINS;
  }
  
  public void setPrimaryWINS(String paramString) {
    this.primaryWINS = paramString;
  }
  
  public String getSecondaryWINS() {
    return this.secondaryWINS;
  }
  
  public void setSecondaryWINS(String paramString) {
    this.secondaryWINS = paramString;
  }
}
