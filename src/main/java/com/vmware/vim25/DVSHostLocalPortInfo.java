package com.vmware.vim25;

import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DVSHostLocalPortInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSHostLocalPortInfo", propOrder = {"switchUuid", "portKey", "setting", "vnic"})
public class DVSHostLocalPortInfo extends DynamicData {
  @XmlElement(required = true)
  protected String switchUuid;
  
  @XmlElement(required = true)
  protected String portKey;
  
  @XmlElement(required = true)
  protected DVPortSetting setting;
  
  @XmlElement(required = true)
  protected String vnic;
  
  public String getSwitchUuid() {
    return this.switchUuid;
  }
  
  public void setSwitchUuid(String paramString) {
    this.switchUuid = paramString;
  }
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public DVPortSetting getSetting() {
    return this.setting;
  }
  
  public void setSetting(DVPortSetting paramDVPortSetting) {
    this.setting = paramDVPortSetting;
  }
  
  public String getVnic() {
    return this.vnic;
  }
  
  public void setVnic(String paramString) {
    this.vnic = paramString;
  }
}
