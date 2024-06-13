package com.vmware.vim25;

import com.vmware.vim25.GuestRegValueDataSpec;
import com.vmware.vim25.GuestRegValueQwordSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueQwordSpec", propOrder = {"value"})
public class GuestRegValueQwordSpec extends GuestRegValueDataSpec {
  protected long value;
  
  public long getValue() {
    return this.value;
  }
  
  public void setValue(long paramLong) {
    this.value = paramLong;
  }
}
