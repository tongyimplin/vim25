package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestRegValueDataSpec;
import com.vmware.vim25.GuestRegValueNameSpec;
import com.vmware.vim25.GuestRegValueSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueSpec", propOrder = {"name", "data"})
public class GuestRegValueSpec extends DynamicData {
  @XmlElement(required = true)
  protected GuestRegValueNameSpec name;
  
  @XmlElement(required = true)
  protected GuestRegValueDataSpec data;
  
  public GuestRegValueNameSpec getName() {
    return this.name;
  }
  
  public void setName(GuestRegValueNameSpec paramGuestRegValueNameSpec) {
    this.name = paramGuestRegValueNameSpec;
  }
  
  public GuestRegValueDataSpec getData() {
    return this.data;
  }
  
  public void setData(GuestRegValueDataSpec paramGuestRegValueDataSpec) {
    this.data = paramGuestRegValueDataSpec;
  }
}
