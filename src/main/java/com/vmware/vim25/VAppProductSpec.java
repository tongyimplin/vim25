package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.VAppProductInfo;
import com.vmware.vim25.VAppProductSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppProductSpec", propOrder = {"info"})
public class VAppProductSpec extends ArrayUpdateSpec {
  protected VAppProductInfo info;
  
  public VAppProductInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(VAppProductInfo paramVAppProductInfo) {
    this.info = paramVAppProductInfo;
  }
}
