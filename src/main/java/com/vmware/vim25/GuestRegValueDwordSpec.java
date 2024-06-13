package com.vmware.vim25;

import com.vmware.vim25.GuestRegValueDataSpec;
import com.vmware.vim25.GuestRegValueDwordSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueDwordSpec", propOrder = {"value"})
public class GuestRegValueDwordSpec extends GuestRegValueDataSpec {
  protected int value;
  
  public int getValue() {
    return this.value;
  }
  
  public void setValue(int paramInt) {
    this.value = paramInt;
  }
}
