package com.vmware.vim25;

import com.vmware.vim25.GuestRegValueDataSpec;
import com.vmware.vim25.GuestRegValueExpandStringSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueExpandStringSpec", propOrder = {"value"})
public class GuestRegValueExpandStringSpec extends GuestRegValueDataSpec {
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
