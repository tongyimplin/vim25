package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPciPassthruConfig;
import com.vmware.vim25.HostSriovConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPciPassthruConfig", propOrder = {"id", "passthruEnabled", "applyNow"})
@XmlSeeAlso({HostSriovConfig.class})
public class HostPciPassthruConfig extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected boolean passthruEnabled;
  
  protected Boolean applyNow;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public boolean isPassthruEnabled() {
    return this.passthruEnabled;
  }
  
  public void setPassthruEnabled(boolean paramBoolean) {
    this.passthruEnabled = paramBoolean;
  }
  
  public Boolean isApplyNow() {
    return this.applyNow;
  }
  
  public void setApplyNow(Boolean paramBoolean) {
    this.applyNow = paramBoolean;
  }
}
