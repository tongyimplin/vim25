package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostVsanDiskInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostVsanDiskInfo", propOrder = {"vsanUuid", "formatVersion"})
public class VsanHostVsanDiskInfo extends DynamicData {
  @XmlElement(required = true)
  protected String vsanUuid;
  
  protected int formatVersion;
  
  public String getVsanUuid() {
    return this.vsanUuid;
  }
  
  public void setVsanUuid(String paramString) {
    this.vsanUuid = paramString;
  }
  
  public int getFormatVersion() {
    return this.formatVersion;
  }
  
  public void setFormatVersion(int paramInt) {
    this.formatVersion = paramInt;
  }
}
