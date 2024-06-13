package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSystemIdentificationInfo;
import com.vmware.vim25.HostSystemInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemInfo", propOrder = {"vendor", "model", "uuid", "otherIdentifyingInfo", "serialNumber"})
public class HostSystemInfo extends DynamicData {
  @XmlElement(required = true)
  protected String vendor;
  
  @XmlElement(required = true)
  protected String model;
  
  @XmlElement(required = true)
  protected String uuid;
  
  protected List<HostSystemIdentificationInfo> otherIdentifyingInfo;
  
  protected String serialNumber;
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public String getModel() {
    return this.model;
  }
  
  public void setModel(String paramString) {
    this.model = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public List<HostSystemIdentificationInfo> getOtherIdentifyingInfo() {
    if (this.otherIdentifyingInfo == null)
      this.otherIdentifyingInfo = new ArrayList<>(); 
    return this.otherIdentifyingInfo;
  }
  
  public String getSerialNumber() {
    return this.serialNumber;
  }
  
  public void setSerialNumber(String paramString) {
    this.serialNumber = paramString;
  }
}
