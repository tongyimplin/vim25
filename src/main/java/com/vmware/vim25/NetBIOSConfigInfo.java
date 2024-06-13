package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetBIOSConfigInfo;
import com.vmware.vim25.WinNetBIOSConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetBIOSConfigInfo", propOrder = {"mode"})
@XmlSeeAlso({WinNetBIOSConfigInfo.class})
public class NetBIOSConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected String mode;
  
  public String getMode() {
    return this.mode;
  }
  
  public void setMode(String paramString) {
    this.mode = paramString;
  }
}
