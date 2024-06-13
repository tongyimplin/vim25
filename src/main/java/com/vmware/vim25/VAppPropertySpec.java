package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.VAppPropertyInfo;
import com.vmware.vim25.VAppPropertySpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppPropertySpec", propOrder = {"info"})
public class VAppPropertySpec extends ArrayUpdateSpec {
  protected VAppPropertyInfo info;
  
  public VAppPropertyInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(VAppPropertyInfo paramVAppPropertyInfo) {
    this.info = paramVAppPropertyInfo;
  }
}
