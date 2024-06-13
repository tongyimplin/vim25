package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAccessControlEntry;
import com.vmware.vim25.HostAccessMode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAccessControlEntry", propOrder = {"principal", "group", "accessMode"})
public class HostAccessControlEntry extends DynamicData {
  @XmlElement(required = true)
  protected String principal;
  
  protected boolean group;
  
  @XmlElement(required = true)
  protected HostAccessMode accessMode;
  
  public String getPrincipal() {
    return this.principal;
  }
  
  public void setPrincipal(String paramString) {
    this.principal = paramString;
  }
  
  public boolean isGroup() {
    return this.group;
  }
  
  public void setGroup(boolean paramBoolean) {
    this.group = paramBoolean;
  }
  
  public HostAccessMode getAccessMode() {
    return this.accessMode;
  }
  
  public void setAccessMode(HostAccessMode paramHostAccessMode) {
    this.accessMode = paramHostAccessMode;
  }
}
