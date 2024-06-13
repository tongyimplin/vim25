package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestRegKeyNameSpec;
import com.vmware.vim25.GuestRegValueNameSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueNameSpec", propOrder = {"keyName", "name"})
public class GuestRegValueNameSpec extends DynamicData {
  @XmlElement(required = true)
  protected GuestRegKeyNameSpec keyName;
  
  @XmlElement(required = true)
  protected String name;
  
  public GuestRegKeyNameSpec getKeyName() {
    return this.keyName;
  }
  
  public void setKeyName(GuestRegKeyNameSpec paramGuestRegKeyNameSpec) {
    this.keyName = paramGuestRegKeyNameSpec;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
