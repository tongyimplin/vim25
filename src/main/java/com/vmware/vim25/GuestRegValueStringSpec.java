package com.vmware.vim25;

import com.vmware.vim25.GuestRegValueDataSpec;
import com.vmware.vim25.GuestRegValueStringSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueStringSpec", propOrder = {"value"})
public class GuestRegValueStringSpec extends GuestRegValueDataSpec {
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
