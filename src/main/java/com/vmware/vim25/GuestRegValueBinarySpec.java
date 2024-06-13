package com.vmware.vim25;

import com.vmware.vim25.GuestRegValueBinarySpec;
import com.vmware.vim25.GuestRegValueDataSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueBinarySpec", propOrder = {"value"})
public class GuestRegValueBinarySpec extends GuestRegValueDataSpec {
  protected byte[] value;
  
  public byte[] getValue() {
    return this.value;
  }
  
  public void setValue(byte[] paramArrayOfbyte) {
    this.value = paramArrayOfbyte;
  }
}
